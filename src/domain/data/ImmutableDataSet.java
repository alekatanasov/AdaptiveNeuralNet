

package domain.data;

import java.util.List;

/**
 *
 * @author Alexander Atanasov
 */
public class ImmutableDataSet implements DataSet{
    private List<float[]> data;
    private int recordSize;
    
    @Override
    public int getLength(){
        return data.size();
    }
    
    @Override
    public int getRecordSize(){
        return this.recordSize;
    }
    
    @Override
    public float[] getRecord(int recordPosition){
        return this.data.get(recordPosition);
    }
}
