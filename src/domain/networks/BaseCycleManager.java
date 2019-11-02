

package domain.networks;

import domain.layers.NetworkLayer;
import java.util.List;

/**
 *
 * @author Alexander Atanasov
 */
public class BaseCycleManager implements NetworkCycleManager {
    private List<NetworkLayer> layerPriorityTable;
    
    public BaseCycleManager(){
        //
    }
    
    @Override
    public List<NetworkLayer> getLayerPriorityTable(){
        return this.layerPriorityTable;
    }
    
    @Override
    public void nextActiveCycle(){
        //
        for(NetworkLayer layer : getLayerPriorityTable()){
            
        }
    }
    
    @Override
    public void nextPassiveCycle(){
        
    }
}
