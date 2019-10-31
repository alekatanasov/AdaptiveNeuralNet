
package domain.layers;


/**
 *
 * @author Alexander Atanasov
 */
public class MapedBinarySynapseLayer extends BinarySynapseLayer implements MapableSynapseLayer {
    /**
     * An array which specifies the connections between the input and output layers.
     * The first dimension represents the positions of neurons in the input layer and
     * the second dimension represents the positions of connected neurons of the output layer
     */
    private int[][] connectionMap;
    
    /**
     * Has the same connection scheme as the connectionMap field. Each weight should corresponds to a
     * connection with the same array address in the connectionMap field;
     */
    private float[][] weights;
    
    public MapedBinarySynapseLayer(String id, ConnectedNeuronLayer inputLayer, 
                                   ConnectedNeuronLayer outputLayer, int[][] connectionMap){
        super(id, inputLayer, outputLayer);
        setConnectionMap(connectionMap);
        initializeWeights();
    }
    
    @Override
    public void nextActiveCycle(){
        // basic synapses have nothing to do
    }
    
    @Override
    public void nextPassiveCycle(){
        // basic synapses have  nothing to do here
    }
    
    @Override
    public void forwardInput(int inputSourcePosition, float outputValue){
        float weightedOutput;
        int[][] connections = this.getConnectionMap();
        
        for(int c=0; c < connections[inputSourcePosition].length;c++){
            weightedOutput = this.getWeight(inputSourcePosition, c);
            weightedOutput *= outputValue;
            this.getOutputLayer().receiveInput(connections[inputSourcePosition][c], weightedOutput);
        }
    }
    
    @Override
    public float getWeight(int inputLayerPosition, int outputLayerPosition){
        int[][] connections = this.getConnectionMap();
        
        for(int c=0; c < connections[inputLayerPosition].length; c++){
            if(connections[inputLayerPosition][c] == outputLayerPosition){
                return this.getWeights()[inputLayerPosition][c];
            }
        }
        
        // specified weight was not found
        throw new IllegalArgumentException("non existing weight specified");
    }
    
    @Override
    public void setWeight(int inputLayerPosition, int outputLayerPosition, float newValue){
        int[][] connections = this.getConnectionMap();
        
        for(int c=0; c < connections[inputLayerPosition].length; c++){
            if(connections[inputLayerPosition][c] == outputLayerPosition){
                this.getWeights()[inputLayerPosition][c] = newValue;
                return;
            }
        }
        
        // specified weight was not found
        throw new IllegalArgumentException("non existing weight specified");
    }
            
    /**
     * Loads deep copy of the provided map array in the connectionMap field.
     * 
     * @param map map specifying the connections between the input and output layers. cannot be null.
     */
    public final void setConnectionMap(int[][] map){
        if(map == null){
            throw new IllegalArgumentException("connection map cannot be null");
        }
        
        this.connectionMap = new int[map.length][];
        
        // copy values of map parameter to the connectionMap field
        for(int c=0;c < map.length;c++){
            this.connectionMap[c] = new int[map[c].length];
            
            for(int i = 0; i < this.connectionMap[c].length; i++){
                this.connectionMap[c][i] = map[c][i];
            }
        }
    }
    
    /**
     * This method should be called after the connectionMap field is initialized because the 
     * structure of the connections array is dependent on the connectionMap field.
     */
    private void initializeWeights(){
        this.weights = new float[this.getConnectionMap().length][];
        
        for(int c=0;c < this.weights.length; c++){
            this.weights[c] = new float[this.getConnectionMap()[c].length];
        }
    }
    
    /**
     * 
     * @return Reference to the connectionMap field (no shallow or deep copy)
     */
    protected final int[][] getConnectionMap(){
        return this.connectionMap;
    }
    
    /**
     * 
     * @return Reference (no shallow or deep copy) to the weights field.
     */
    protected float[][] getWeights(){
        return this.weights;
    }
}
