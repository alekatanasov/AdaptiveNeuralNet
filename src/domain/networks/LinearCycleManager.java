

package domain.networks;

import domain.layers.NetworkLayer;

/**
 *
 * @author Alexander Atanasov
 */
public interface LinearCycleManager extends NetworkCycleManager {
    /**
     * 
     * @param priorityPosition the position of the new layer in the priority table
     * 
     * @param newLayer reference the layer which is to be inserted
     */
    public void insertLayer(int priorityPosition, NetworkLayer newLayer);
    
    /**
     * Appends the new layer at the end the priority table
     */
    public void addlayer(NetworkLayer newLayer);
}
