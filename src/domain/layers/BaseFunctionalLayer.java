

package domain.layers;

import domain.entities.DesignatedEntity;

/**
 *
 * @author Alexander Atanasov
 */
public abstract class BaseFunctionalLayer extends DesignatedEntity implements FunctionalNetworkLayer {
    private ActivationFunction activationFunction;
    
    public BaseFunctionalLayer(String id){
        super(id);
    }
    
    @Override
    public final ActivationFunction getActivationFunction(){
        return this.activationFunction;
    }
    
    public void setActivationFunction(ActivationFunction function){
        if(function == null){
            throw new IllegalArgumentException("activation function cannot be null");
        }
        
        this.activationFunction = function;
    }
}
