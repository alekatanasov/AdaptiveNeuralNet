

package domain.layers;

/**
 * Represents a part of neural network capable of some information processing.
 * 
 * @author Alexander Atanasov
 */
public interface FunctionalNetworkLayer extends NetworkLayer {
    public enum ActivationFunction{
        LINEAR
    }
    
    /**
     * 
     * @return The activation function currently in use by this layer.
     */
    public ActivationFunction getActivationFunction();
    
    public void setActivationFunction(ActivationFunction function);
    
    public void setInput(float[] input);
    
    public float getOutput();
    
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
