

package domain.layers;

/**
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
    public void setInput(float[] input){
        NodeLayer nodeLayer = this.getInputLayer();
        
        if(input.length != nodeLayer.getSize()){
            throw new IllegalArgumentException("invalid input size");
        }
        
        for(int c = 0; c < input.length; c++){
            nodeLayer.addToNode(c, input[c]);
        }
    }
    
    /**
     * 
     * @return Reference (no copies) to the inputLayer field.
     */
    private NodeLayer getInputLayer(){
        return this.inputLayer;
    }
    
    /**
     * 
     * @return Reference (no copies) to the outputLayer field.
     */
    private NodeLayer getOutputLayer(){
        return this.outputLayer;
    }
    
    private void initializeInputLayer(int size){
        this.inputLayer = new StandardNodeLayer(size);
    }
    
    private void initializeOutputlayer(int size){
        this.outputLayer = new StandardNodeLayer(size);
    }
}
