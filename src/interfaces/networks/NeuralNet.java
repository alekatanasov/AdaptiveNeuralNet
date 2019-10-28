
package interfaces.networks;

/**
 *
 * @author Alexander Atanasov
 */
public interface NeuralNet {
    public boolean addLayer(Object layerData);
    
    public int getInputLayerSize();
    
    public int getOutputLayerSize();
}
