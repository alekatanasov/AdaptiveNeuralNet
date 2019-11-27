

package domain.layers;

/**
 *
 * @author Alexander Atanasov
 */
public class StandardWeightSet implements WeightSet{
    private float[] weights;
    
    public StandardWeightSet(float[] weights){
        setWeights(weights);
    }
    
    public StandardWeightSet(int size){
        initializeWeights(size);
    }
    
    @Override
    public int getSize(){
        return getWeights().length;
    }
    
    @Override
    public void setWeight(int position, float newValue){
        if(position < 0 || position > getWeights().length - 1){
            throw new IllegalArgumentException("out of bounds weight position");
        }
        
        getWeights()[position] = newValue;
    }
    
    @Override
    public float getWeight(int position){
        if(position < 0 || position > getWeights().length - 1){
            throw new IllegalArgumentException("out of bounds weight position");
        }
        
        return getWeights()[position];
    }
    
    private void setWeights(float[] newWeights){
        if(newWeights == null){
            throw new IllegalArgumentException("cannot set weights to null");
        }
        
        initializeWeights(newWeights.length);
        
        for(int c = 0; c < newWeights.length; c++){
            setWeight(c, newWeights[c]);
        }
    }
    
    private void initializeWeights(int size){
        if(size < 1){
            throw new IllegalArgumentException("size of weight set cannot be smaller than 1");
        }
        
        this.weights = new float[size];
    }
    
    /**
     * 
     * @return reference (no copies) to the weights field.
     */
    private float[] getWeights(){
        return this.weights;
    }
}
