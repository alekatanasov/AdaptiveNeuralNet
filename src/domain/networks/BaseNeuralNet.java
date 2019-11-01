
package domain.networks;

import domain.entities.DesignatedEntity;
import domain.layers.BaseNeuronLayer;
import domain.layers.NetworkLayer;
import domain.layers.NeuronLayer;
import domain.layers.NeuronLayer.ActivationFunction;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alexander Atanasov
 */
public abstract class BaseNeuralNet extends DesignatedEntity implements domain.networks.NeuralNet{
    public static final String INPUT_LAYER_ID = "input";
    public static final String OUTPUT_LAYER_ID = "output";
    
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
    
    @Override
    public boolean addLayer(NetworkLayer layer){
       boolean addSuccess = false;
       
       if(layer == null){
           throw new IllegalArgumentException("new layer cannot be null");
       }
       
       this.networkLayers.add(layer);
       
       addSuccess = true;
       return addSuccess;
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
    
    /**
     * This method should be used after initializeNetworkLayers method otherwise an exception will
     * occur.
     */
    private void addInputOutputLayers(){
        NeuronLayer input = new BaseNeuronLayer(BaseNeuralNet.INPUT_LAYER_ID, getInputLayerSize(),
                                                ActivationFunction.SIGMOID);
        NeuronLayer output = new BaseNeuronLayer(BaseNeuralNet.OUTPUT_LAYER_ID, getOutputLayerSize(),
                                                ActivationFunction.SIGMOID);
        
        addLayer(input);
        addLayer(output);
    }
}
