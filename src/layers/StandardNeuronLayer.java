

package layers;

import interfaces.layers.SynapseLayer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alexander Atanasov
 */
public class StandardNeuronLayer extends NeuronLayer{
    /**
     * Excitation values for the neurons in this layer. These values are reset to zero at the
     * end of each passive cycle.
     */
    private float[] neurons;
    
    public StandardNeuronLayer(int layerSize, ActivationFunction function){
        super(function);
        initializeNeurons(layerSize);
    }
    
    @Override
    public void receiveInput(int inputTarget, float input){
        // error check
        if(inputTarget <0 || inputTarget >= this.neurons.length){
            throw new IllegalArgumentException("inputTarget out of bounds");
        }
        
        //add new input to respective neuron
        this.neurons[inputTarget] += input;
    }
    
    /**
     * 
     * @return The number of neurons in this layer
     */
    @Override
    public int getSize(){
        return this.getNeurons().length;
    }
     
    /**
     * Calculates excitation values for all neurons and forwards non zero output to all loaded
     * outputSynapses.
     */
    @Override
    public void nextActiveCycle(){
        for(int c=0; c <this.getNeurons().length; c++){
            if(this.neurons[c]!=0){
                // send output to all output synapses
                for(SynapseLayer layer : this.getOutputSynapseLayers()){
                    layer.forwardInput(c, activationFunction(this.neurons[c]));
                }
            }
        }
    }
    
    /**
     * Sets all neuron excitation values to zero.
     */
    @Override
    public void nextPassiveCycle(){
        for(int c=0; c<this.getNeurons().length;c++){
            this.getNeurons()[c] = 0;
        }
    }
    
    private void initializeNeurons(int size){
        if(size < 0){
            throw new IllegalArgumentException("neurons's size cannot be negative");
        }
        
        this.neurons = new float[size];
    }
    
    /**
     * 
     * @return Reference to the neurons field
     */
    private float[] getNeurons(){
        return this.neurons;
    }
}
