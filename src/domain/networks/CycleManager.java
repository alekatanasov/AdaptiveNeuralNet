

package domain.networks;

/**
 * Defines each network layer priority in the excitation cycle.
 * 
 * @author Alexander Atanasov
 */
public interface CycleManager {
    public void nextActiveCycle();
    
    public void nextPassiveCycle();
}
