
package domain.layers;

/**
 * 
 * @author Alexander Atanasov
 */
public interface NetworkLayer {
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
