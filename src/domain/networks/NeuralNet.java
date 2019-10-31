
package domain.networks;

import domain.entities.DesignateableEntity;
import domain.layers.NetworkLayer;

/**
 *
 * @author Alexander Atanasov
 */
public interface NeuralNet extends DesignateableEntity {
    public boolean addLayer(NetworkLayer layer);
    
    public int getInputLayerSize();
    
    public int getOutputLayerSize();
    
    public void receiveInput(float[] input);
    
    public float[] getOutput();
}
