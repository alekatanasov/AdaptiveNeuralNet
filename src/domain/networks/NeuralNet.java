
package domain.networks;

import domain.entities.DesignateableEntity;
import domain.layers.NetworkLayer;

/**
 *
 * @author Alexander Atanasov
 */
public interface NeuralNet extends DesignateableEntity {
    /**
     * Attempts to add new layer to the network
     * 
     * @param layer
     * @param layerId
     * 
     * @return true if the layer was added successfully
     */
    public boolean addLayer(NetworkLayer layer);
    
    public int getInputLayerSize();
    
    public int getOutputLayerSize();
    
    /**
     * Send new input to the network.
     * 
     * @param input non null float array representing input to be loaded in the input layer.
     */
    public void receiveInput(float[] input);
    
    /**
     * Get the latest output of the network.
     * 
     * @return the current values of the output layer of this network
     */
    public float[] getOutput();
}
