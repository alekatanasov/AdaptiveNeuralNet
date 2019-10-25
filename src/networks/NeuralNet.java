
package networks;

/**
 *
 * @author Alexander Atanasov
 */
public abstract class NeuralNet implements interfaces.networks.NeuralNet{
    private String id;
    private int inputLayerSize;
    private int outputLayerSize;
    
    public NeuralNet(String id){
        setId(id);
    }
    
    public final void setId(String newId){
        this.id = newId;
    }
    
    public final String getId(){
        return this.id;
    }
    
    @Override
    public final void setInputLayerSize(int size){
        // error check
        if(size < 1){
            throw new IllegalArgumentException("input layer size cannot be less than 1");
        }
        
        this.inputLayerSize = size;
    }
    
    @Override
    public final void setOutputLayerSize(int size){
        // error check
        if(size < 1){
            throw new IllegalArgumentException("output layer size cannot be less than 1");
        }
        
        this.outputLayerSize = size;
    }
}
