

package domain.layers;

/**
 * Represents a part of neural network capable of some information processing.
 * 
 * @author Alexander Atanasov
 */
public interface FunctionalNetworkLayer extends NetworkLayer {
    public enum ActivationFunction {
        LINEAR
    }
    
    /**
     * 
     * @return The activation function currently in use by this layer.
     */
    public ActivationFunction getActivationFunction();
    
    /**
     * 
     * @param function ActivationFunction which will be in use from now on by this layer.
     */
    public void setActivationFunction(ActivationFunction function);
    
    /**
     * Passes new input to this FunctionalNetworkLayer.
     * 
     * @param input non null float array representing the new input.
     */
    public void setInput(float[] input);
    
    /**
     * Retrieves the latest output of this FunctionalNetworkLayer.
     * 
     * @return non null float array representing the output of this layer.
     */
    public float[] getOutput();
    
    /**
     * 
     * @return Positive integer representing the size of the input of this functional layer.
     */
    public int getInputSize();
    
    /**
     * 
     * @return Positive integer representing the size of the output of this functional layer.
     */
    public int getOutputSize();
    
}
