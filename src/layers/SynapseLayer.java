
package layers;

/**
 *
 * @author Alexander Atanasov
 */
public abstract class SynapseLayer implements interfaces.layers.SynapseLayer{
    private NeuronLayer inputLayer;
    private NeuronLayer outputLayer;
    
    public SynapseLayer(NeuronLayer inputLayer, NeuronLayer outputLayer){
        setInputLayer(inputLayer); 
        setOutputLayer(outputLayer);
    }
    
    public final void setInputLayer(NeuronLayer input){
        if(input == null){
            throw new IllegalArgumentException("inputLayer cannot be null");
        }
        
        this.inputLayer = input;
    }
    
    public final NeuronLayer getInputLayer(){
        return this.inputLayer;
    }
    
    public final void setOutputLayer(NeuronLayer output){
        if(output == null){
            throw new IllegalArgumentException("outputLayer cannot be null");
        }
        
        this.outputLayer = output;
    }
    
    public final NeuronLayer getOutputLayer(){
        return this.outputLayer;
    }
}
