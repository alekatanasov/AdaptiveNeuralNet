

package domain.layers;

/**
 * Represents connectivity between neuron layers. Has the ability to send input 
 * from single neuron layer to other neuron layers.
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
}
