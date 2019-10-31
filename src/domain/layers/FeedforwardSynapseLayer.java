
package domain.layers;

/**
 *
 * @author Alexander Atanasov
 */
public class FeedforwardSynapseLayer extends MapedBinarySynapseLayer {
    public FeedforwardSynapseLayer(ConnectedNeuronLayer inputLayer, ConnectedNeuronLayer outputLayer,
                                   int[][] connectionMap){
        super(inputLayer, outputLayer, connectionMap);
        
    }
    
    @Override
    public void nextActiveCycle(){
        getOutputLayer().nextActiveCycle();
    }
    
    @Override
    public void nextPassiveCycle(){
        getOutputLayer().nextPassiveCycle();
    }
    
}
