

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
        float inputNodeValue;
        float weightedValue;
        int outputLayerSize = this.getOutputLayer().getSize();
        
        for(int c = 0; c < getInputLayer().getSize(); c++){
            inputNodeValue = getInputLayer().getNodeValue(c);
            inputNodeValue = applyActivationFunction(inputNodeValue);
            
            for(int j = 0; j < outputLayerSize; j++){
                weightedValue = inputNodeValue * getWeightSet().getWeight(c*outputLayerSize + j);
                getOutputLayer().addToNode(j, inputNodeValue);
            }
        }
    }
    
    @Override
    public void nextPassiveCycle(){
        getInputLayer().resetNodes();
        getOutputLayer().resetNodes();
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
