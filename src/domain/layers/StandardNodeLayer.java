
package domain.layers;

/**
 *
 * @author Alexander Atanasov
 */
public class StandardNodeLayer implements NodeLayer {
    private float[] nodes;
    
    public StandardNodeLayer(int layerSize){
        initializeNodes(layerSize);
    }
    
    @Override
    public int getSize(){
        return getNodes().length;
    }
    
    @Override
    public float[] getAllNodeValues(){
        return getNodes();
    }
    
    @Override
    public void addToNode(int nodePosition, float input){
        if(nodePosition < 0){
            throw new IllegalArgumentException("Node position cannot be less than zero");
        }
        
        getNodes()[nodePosition] += input;
    }
    
    @Override
    public void reset(){
        float[] nodeArray = getNodes();
        
        for(int c = 0; c < getNodes().length; c++){
            nodeArray[c] = 0;
        }
    }
    
    private void initializeNodes(int size){
        if(size < 1){
            throw new IllegalArgumentException("Node layer cannot have less than one nodes");
        }
        
        this.nodes = new float[size];
    }
    
    private float[] getNodes(){
        return this.nodes;
    }
}
