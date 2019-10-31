
package domain.layers;

/**
 *
 * @author Alexander Atanasov
 */
public interface MapableBinarySynapseLayer extends SynapseLayer {
    public float getWeight(int inputLayerPosition, int outputLayerPosition);
    
    public void setWeight(int inputLayerPosition, int outputLayerPosition, float newValue);
}
