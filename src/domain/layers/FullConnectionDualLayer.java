

package domain.layers;

/**
 *
 * @author Alexander Atanasov
 */
public class FullConnectionDualLayer extends DualNodeLayer {
    private WeightSet weightSet;
    
    public FullConnectionDualLayer(String id, ActivationFunction function, int inputLayerSize,
                                   int outputLayerSize){
        super(id, function, inputLayerSize, outputLayerSize);
        initializeWeightSet();
    }
    
    @Override
    public void nextActiveCycle(){
        for(int c = 0; c < getInputLayer().getSize(); c++){
            for(int j = 0; j < this.getOutputLayer().getSize(); j++){
                //
            }
        }
    }
    
    @Override
    public void nextPassiveCycle(){
        // to do
    }
    
    /**
     * Initializes the weightSet field with instance of the StandardWeightSet class with all
     * weights set to zero
     */
    private void initializeWeightSet(){
        this.weightSet = new StandardWeightSet(getInputSize() * getOutputSize());
    }
    
    /**
     * 
     * @return Reference (no copies) to the weightSet field.
     */
    private WeightSet getWeightSet(){
        return this.weightSet;
    }
}
