

package domain.layers;

/**
 * A FunctionalNetworkLayer with two node layers designated input and output. Data flow is 
 * linear - from input to output.
 * 
 * @author Alexander Atanasov
 */
public abstract class DualNodeLayer extends BaseFunctionalLayer {
    private NodeLayer inputLayer;
    private NodeLayer outputLayer;
    
    public DualNodeLayer(String id, ActivationFunction function, int inputLayerSize,
                         int outputLayerSize){
        super(id, function);
        initializeInputLayer(inputLayerSize);
        initializeOutputlayer(outputLayerSize);
    }
    
    @Override
    public int getInputSize(){
        return getInputLayer().getSize();
    }
    
    @Override
    public int getOutputSize(){
        return getOutputLayer().getSize();
    }
    
    @Override
    public void passInput(float[] input){
        NodeLayer nodeLayer = this.getInputLayer();
        
        // check if the new input is of correct size
        if(input.length != nodeLayer.getSize()){
            throw new IllegalArgumentException("invalid input size");
        }
        
        for(int c = 0; c < input.length; c++){
            nodeLayer.addToNode(c, input[c]);
        }
    }
    
    @Override
    public float[] getOutput(){
        return getOutputLayer().getAllNodeValues();
    }
    
    /**
     * 
     * @return Reference (no copies) to the inputLayer field.
     */
    protected NodeLayer getInputLayer(){
        return this.inputLayer;
    }
    
    /**
     * 
     * @return Reference (no copies) to the outputLayer field.
     */
    protected NodeLayer getOutputLayer(){
        return this.outputLayer;
    }
    
    /**
     * Initializes the inputLayer field with an instance of the StandardNodelayer.
     * 
     * @param size The number of nodes in the input layer.
     */
    private void initializeInputLayer(int size){
        this.inputLayer = new StandardNodeLayer(size);
    }
    
    /**
     * Initializes the outputLayer field with an instance of the StandardNodelayer.
     * 
     * @param size The number of nodes in the output layer.
     */
    private void initializeOutputlayer(int size){
        this.outputLayer = new StandardNodeLayer(size);
    }
}
