
package networks;

/**
 *
 * @author Alexander Atanasov
 */
public abstract class NeuralNet implements interfaces.networks.NeuralNet{
    private String id;
    private int inputLayerSize;
    private int outputLayerSize;
    
    public NeuralNet(String id, int inputSize, int outputSize){
        setId(id);
        setInputLayerSize(inputSize);
        setOutputLayerSize(outputSize);
    }
    
    public final void setId(String newId){
        this.id = newId;
    }
    
    public final String getId(){
        return this.id;
    }
    
    @Override
    public int getInputLayerSize(){
        return this.inputLayerSize;
    }
    
    @Override
    public int getOutputLayerSize(){
        return this.outputLayerSize;
    }
    
    private void setInputLayerSize(int size){
        // error check
        if(size < 1){
            throw new IllegalArgumentException("input layer size cannot be less than 1");
        }
        
        this.inputLayerSize = size;
    }
    
    private void setOutputLayerSize(int size){
        // error check
        if(size < 1){
            throw new IllegalArgumentException("output layer size cannot be less than 1");
        }
        
        this.outputLayerSize = size;
    }
}
