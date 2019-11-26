
package domain.layers;

import domain.entities.DesignateableEntity;

/**
 * Root interface for all network layers.
 * 
 * @author Alexander Atanasov
 */
public interface NetworkLayer extends DesignateableEntity {
    /**
     * Active part of excitation cycle
     */
    default void nextActiveCycle(){
        // default behavior is to do nothing
    }
    
    /**
     * Passive part of excitation cycle
     */
    default void nextPassiveCycle(){
        // default behavior is to do nothing
    }
}
