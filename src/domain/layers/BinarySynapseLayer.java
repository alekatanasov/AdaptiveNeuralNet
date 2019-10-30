
package domain.layers;

/**
 * Synapse layer connecting two neuron layers.
 * 
 * @author Alexander Atanasov
 */
public abstract class BinarySynapseLayer implements domain.layers.SynapseLayer{
    private ConnectedNeuronLayer inputLayer;
    private ConnectedNeuronLayer outputLayer;
    
    public BinarySynapseLayer(ConnectedNeuronLayer inputLayer, ConnectedNeuronLayer outputLayer){
        setInputLayer(inputLayer); 
        setOutputLayer(outputLayer);
    }
    
    public final void setInputLayer(ConnectedNeuronLayer input){
        if(input == null){
            throw new IllegalArgumentException("inputLayer cannot be null");
        }
        
        this.inputLayer = input;
    }
    
    public final ConnectedNeuronLayer getInputLayer(){
        return this.inputLayer;
    }
    
    public final void setOutputLayer(ConnectedNeuronLayer output){
        if(output == null){
            throw new IllegalArgumentException("outputLayer cannot be null");
        }
        
        this.outputLayer = output;
    }
    
    public final ConnectedNeuronLayer getOutputLayer(){
        return this.outputLayer;
    }
}
