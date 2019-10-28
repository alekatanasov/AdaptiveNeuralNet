
package interfaces.layers;

import java.util.List;

/**
 * Represents a collection of neurons.
 * 
 * @author Alexander Atanasov
 */
public interface NeuronLayer extends NetworkLayer{
    public enum ActivationFunction{
        SIGMOID
    }
    
    /**
     * 
     * @return The number of neurons in this layer
     */
    public int getSize();
    
    public void addOutputSynapseLayer(SynapseLayer newLayer);
    
    /**
     * 
     * @return List representation of all output synapse layers to which the current neuron
     *         layer sends output.
     */
    public List<SynapseLayer> getOutputSynapseLayers();
    
    /**
     * 
     * @param intputTarget specifies the position of the neuron (in this layer ) which 
     *                     will receive the input
     * 
     * @param input input to receive
     */
    public void receiveInput(int intputTarget, float input);
   
}
