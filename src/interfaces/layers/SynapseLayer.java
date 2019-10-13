

package interfaces.layers;

/**
 * Represents connectivity between two neuron layers.
 * 
 * @author Alexander Atanasov
 */
public interface SynapseLayer extends NetworkLayer{
    
    /**
     * Forwards input received from the input layer to the output layer of this synapse.
     * 
     * @param inputSourcePosition the position of the neuron input source in the inputLayer.
     * 
     * @param inputValue value representing neuron excitation
     */
    public void forwardInput(int inputSourcePosition, float inputValue);
    
    public float getWeight(int inputLayerPosition, int outputLayerPosition);
    
    public void setWeight(int inputLayerPosition, int outputLayerPosition, float newValue);
}
