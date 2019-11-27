
package domain.networks;

import domain.entities.DesignateableEntity;
import domain.layers.FunctionalNetworkLayer;
import domain.layers.NetworkLayer;
import java.util.List;

/**
 *
 * @author Alexander Atanasov
 */
public interface NeuralNet extends DesignateableEntity {
    /**
     * Attempts to add new layer to the network.
     * 
     * @param layer non null FunctionalNetworkLayer to be added.
     * 
     * @return true if the layer was added successfully
     */
    public boolean addLayer(FunctionalNetworkLayer layer);
    
    /**
     * 
     * @return Positive integer representing the size of the input of this network.
     */
    public int getInputLayerSize();
    
    /**
     * 
     * @return Positive integer representing the size of the output of this network.
     */
    public int getOutputLayerSize();
    
    /**
     * Send new input to the network.
     * 
     * @param input non null float array representing input to be loaded to the input layer.
     */
    public void receiveInput(float[] input);
    
    /**
     * Get the latest output of the network.
     * 
     * @return the current values of the output layer of this network.
     */
    public float[] getOutput();
    
    /**
     * 
     * @param id
     * 
     * @return 
     */
    public NetworkLayer getLayerById(String id);
    
    /**
     * 
     * @return A list with all functional layers in this network.
     */
    public List<FunctionalNetworkLayer> getAllLayers();
}
