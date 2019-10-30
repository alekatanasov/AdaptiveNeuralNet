
package domain.networks;

import domain.layers.NetworkLayer;

/**
 *
 * @author Alexander Atanasov
 */
public interface NeuralNet {
    public boolean addLayer(NetworkLayer layer);
    
    public int getInputLayerSize();
    
    public int getOutputLayerSize();
}
