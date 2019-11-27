
package domain.layers;

/**
 *
 * @author Alexander Atanasov
 */
public interface WeightSet {
    /**
     * 
     * @return The number of weights in this WeightSet.
     */
    public int getSize();
    
    /**
     * 
     * @param position Non negative number representing the position of the weight in the
     *                 weightsArray of this weightSet.
     * 
     * @param newValue The new value of the specified weight.
     */
    public void setWeight(int position, float newValue);
    
    /**
     * 
     * @param position Non negative number representing the position of the weight in the
     *                 weightsArray of this weightSet.
     * 
     * @return The current value of the specified weight
     */
    public float getWeight(int position);
}
