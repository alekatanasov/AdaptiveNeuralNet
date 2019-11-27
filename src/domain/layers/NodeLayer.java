

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
    
    /**
     * 
     * @param nodePosition Non negative number representing the position of the target node in the
     *                     array of nodes in this NodeLayer.
     * 
     * @param input Value to add to the current value of the specified node.
     */
    public void addToNode(int nodePosition, float input);
    
    /**
     * 
     * @return Float array representing the values of all nodes in this layer.
     */
    public float[] getAllNodeValues();
    
    /**
     * Sets all nodes to zero.
     */
    public void resetNodes();
    
    /**
     * 
     * @param nodePosition The position of the node in the nodes array.
     * 
     * @return The value of the specified node.
     */
    public float getNodeValue(int nodePosition);
}
