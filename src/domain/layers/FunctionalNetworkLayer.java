

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
    
    public void setActivationFunction();
    
    public void setInput(float[] input);
    
    public float getOutput();
    
    public int getInputSize();
    
    public int getOutputSize();
    
}
