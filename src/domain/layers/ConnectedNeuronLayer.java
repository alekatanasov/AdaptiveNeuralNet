
package domain.layers;

import domain.entities.DesignatedEntity;
import java.util.ArrayList;
import java.util.List;



/**
 * Neuron layer which can hold references to synapse layers and defines 
 * activation functions.
 * 
 * @author Alexander Atanasov
 */
public abstract class ConnectedNeuronLayer extends DesignatedEntity implements domain.layers.NeuronLayer{
    private List<SynapseLayer> outputSynapseLayers;
    
    private ActivationFunction activationFunction;
    
    public ConnectedNeuronLayer(String id, ActivationFunction function){
        super(id);
        initializeOutputSynapseLayers();
        setActivationFunction(function);
    }
    
    @Override
    public void addOutputSynapseLayer(SynapseLayer newLayer){
        if(newLayer == null){
            throw new IllegalArgumentException("synapse layer cannot be null");
        }
        
        this.outputSynapseLayers.add(newLayer);
    }
    
    @Override
    public List<SynapseLayer> getOutputSynapseLayers(){
        return this.outputSynapseLayers;
    }
    
    public final void setActivationFunction(ActivationFunction function){
        if(function == null){
            throw new IllegalArgumentException("activationFunction cannot be null");
        }
        
        this.activationFunction = function;
    }
    
    public final ActivationFunction getActivationFunction(){
        return this.activationFunction;
    }
    
    protected float activationFunction(float input){
        float output;
        
        switch(getActivationFunction()){
            case SIGMOID:
                output = sigmoidActivation(input);
                break;
            default:
                throw new IllegalArgumentException("unknown activation function");
        }
        
        return output;
    }
    
    protected float sigmoidActivation(float input){
        float output = (float) Math.exp(input);
        output = 1/1+output;
        return output;
    }
    
    private void initializeOutputSynapseLayers(){
        this.outputSynapseLayers = new ArrayList<>();
    }
}
