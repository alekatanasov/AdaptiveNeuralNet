

package domain.layers;

import domain.entities.DesignatedEntity;

/**
 *
 * @author Alexander Atanasov
 */
public abstract class BaseFunctionalLayer extends DesignatedEntity implements FunctionalNetworkLayer {
    private ActivationFunction activationFunction;
    
    public BaseFunctionalLayer(String id, ActivationFunction function){
        super(id);
        setActivationFunction(function);
    }
    
    @Override
    public final ActivationFunction getActivationFunction(){
        return this.activationFunction;
    }
    
    @Override
    public final void setActivationFunction(ActivationFunction function){
        if(function == null){
            throw new IllegalArgumentException("activation function cannot be null");
        }
        
        this.activationFunction = function;
    }
    
    protected float applyActivationFunction(float rawValue){
        float resultValue = 0;
        
        switch(getActivationFunction()){
            case LINEAR:
                resultValue = linearActivation(rawValue);
                break;
                
            default:
                throw new IllegalArgumentException("unknown activation function");
        }
        
        return resultValue;
    }
    
    private float linearActivation(float rawValue){
        return rawValue;
    }
}
