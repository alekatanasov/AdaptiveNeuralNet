

package domain.networks;

import domain.layers.NetworkLayer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alexander Atanasov
 */
public abstract class BaseCycleManager implements NetworkCycleManager {
    private List<NetworkLayer> layerPriorityTable;
    
    public BaseCycleManager(){
        initializeLayerPriorityTable();
    }
    
    @Override
    public List<NetworkLayer> getLayerPriorityTable(){
        return this.layerPriorityTable;
    }
    
    @Override
    public void nextActiveCycle(){
        //
        for(NetworkLayer layer : getLayerPriorityTable()){
            layer.nextActiveCycle();
        }
    }
    
    @Override
    public void nextPassiveCycle(){
        //
        for(NetworkLayer layer : getLayerPriorityTable()){
            layer.nextPassiveCycle();
        }
    }
    
    @Override
    public int getPriorityTableSize(){
        return getLayerPriorityTable().size();
    }
    private void initializeLayerPriorityTable(){
        this.layerPriorityTable = new ArrayList<>();
    }
}
