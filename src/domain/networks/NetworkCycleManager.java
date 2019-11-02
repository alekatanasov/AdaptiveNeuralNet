

package domain.networks;

import domain.layers.NetworkLayer;
import java.util.List;

/**
 * Defines each network layer priority in the excitation cycle. Also handles cycle calls to
 * every layer in its network.
 * 
 * @author Alexander Atanasov
 */
public interface NetworkCycleManager {
    public List<NetworkLayer> getLayerPriorityTable();
    
    public void nextActiveCycle();
    
    public void nextPassiveCycle();
}
