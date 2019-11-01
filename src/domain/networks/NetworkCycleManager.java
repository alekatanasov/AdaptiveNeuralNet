

package domain.networks;

/**
 * Defines each network layer priority in the excitation cycle. Also handles cycle calls to
 * every layer in its network.
 * 
 * @author Alexander Atanasov
 */
public interface NetworkCycleManager {
    public void nextActiveCycle();
    
    public void nextPassiveCycle();
}
