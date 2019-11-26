

package domain.layers;

/**
 *
 * @author Alexander Atanasov
 */
public interface NodeLayer {
    
    /**
     * 
     * @return The number of nodes in this layer.
     */
    public int getSize();
    
    public void addToNode(int nodePosition, float input);
    
    /**
     * 
     * @return Float array representing the values of all nodes in this layer.
     */
    public float[] getAllNodeValues();
    
    /**
     * Sets all nodes to zero.
     */
    public void reset();
}
