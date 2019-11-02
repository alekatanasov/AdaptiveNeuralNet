

package domain.networks;

import domain.layers.NetworkLayer;

/**
 *
 * @author Alexander Atanasov
 */
public class SequentialCycleManager extends BaseCycleManager implements LinearCycleManager {
    SequentialCycleManager(){
        super();
    }
    
    @Override
    public void insertLayer(int priorityPosition, NetworkLayer newLayer){
        // error check
        if(newLayer == null){
            throw new IllegalArgumentException("new layer cannot be null");
        }
        
        getLayerPriorityTable().set(priorityPosition, newLayer);
    }
    
    @Override
    public void addlayer(NetworkLayer newLayer){
        // error check
        if(newLayer == null){
            throw new IllegalArgumentException("new layer cannot be null");
        }
        
        getLayerPriorityTable().add(newLayer);
    }
}
