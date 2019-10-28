
package layers;

/**
 *
 * @author Alexander Atanasov
 */
public class FeedforwardSynapseLayer extends BasicSynapseLayer {
    public FeedforwardSynapseLayer(NeuronLayer inputLayer, NeuronLayer outputLayer,
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
