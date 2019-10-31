
package domain.networks;

import domain.entities.DesignatedEntity;
import domain.layers.NetworkLayer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alexander Atanasov
 */
public abstract class BaseNeuralNet extends DesignatedEntity implements domain.networks.NeuralNet{
    private int inputLayerSize;
    private int outputLayerSize;
    private List<NetworkLayer> networkLayers;
    
    public BaseNeuralNet(String id, int inputSize, int outputSize){
        super(id);
        initializeNetworkLayers();
        setInputLayerSize(inputSize);
        setOutputLayerSize(outputSize);
    }
    
    @Override
    public int getInputLayerSize(){
        return this.inputLayerSize;
    }
    
    @Override
    public int getOutputLayerSize(){
        return this.outputLayerSize;
    }
    
    private void setInputLayerSize(int size){
        // error check
        if(size < 1){
            throw new IllegalArgumentException("input layer size cannot be less than 1");
        }
        
        this.inputLayerSize = size;
    }
    
    private void setOutputLayerSize(int size){
        // error check
        if(size < 1){
            throw new IllegalArgumentException("output layer size cannot be less than 1");
        }
        
        this.outputLayerSize = size;
    }
    
    private void initializeNetworkLayers(){
        this.networkLayers = new ArrayList<>();
    }
}
