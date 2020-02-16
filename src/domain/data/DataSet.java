
package domain.data;

/**
 *
 * @author Alexander Atanasov
 */
public interface DataSet {
    /**
     * 
     * @return Positive integer representing the size of all records in this DataSet.
     */
    public int getRecordSize();
    
    /**
     * 
     * @return The number of records in this DataSet
     */
    public int getLength();
    
    /**
     * 
     * @param recordPosition integer representing the position of the record in the set
     * 
     * @return the specified record
     */
    public float[] getRecord(int recordPosition);
}
