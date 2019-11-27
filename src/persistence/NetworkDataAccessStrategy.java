

package persistence;

import domain.networks.NeuralNet;

/**
 *
 * @author Alexander Atanasov
 */
public interface NetworkDataAccessStrategy {
    public NeuralNet retrieveNetwork();
    
    public boolean saveNetwork(NeuralNet network);
}
