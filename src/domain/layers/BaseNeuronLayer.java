

package domain.layers;


/**
 * 
 * @author Alexander Atanasov
 */
public class BaseNeuronLayer extends ConnectedNeuronLayer{
    /**
     * Excitation values for the neurons in this outputLayer. These values are reset to zero at the
     * end of each passive cycle.
     */
    private float[] neurons;
    
    public BaseNeuronLayer(String id, int layerSize, ActivationFunction function){
        super(id, function);
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
     * @return The number of neurons in this outputLayer
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
        for(int c=0; c < this.getNeurons().length; c++){
            if(getNeurons()[c] > 0){
                // send output to all output synapses
                for(SynapseLayer outputLayer : getOutputSynapseLayers()){
                    outputLayer.forwardInput(c, activationFunction(getNeurons()[c]));
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
    
    @Override
    public float getNeuronExcitation(int neuronPosition){
        if(neuronPosition < 0 || neuronPosition > getSize()-1){
            throw new IllegalArgumentException("out of bounds neuronPosition");
        }
        
        return this.getNeurons()[neuronPosition];
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
