
package interfaces.networks;

/**
 *
 * @author Alexander Atanasov
 */
public interface NeuralNet {
    public boolean addLayer(Object layerData);
    
    public void setInputLayerSize(int size);
    
    public void setOutputLayerSize(int size);
}
