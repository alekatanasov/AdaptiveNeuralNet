

package domain.entities;

/**
 *
 * @author Alexander Atanasov
 */
public class DesignatedEntity implements DesignateableEntity {
    private String id;
    
    public DesignatedEntity(String id){
        this.setId(id);
    }
    
    @Override
    public final String getId(){
        return this.id;
    }
    
    private void setId(String id){
        if(id == null){
            throw new IllegalArgumentException("id cannot be null");
        } else if(id.equals("")){
            throw new IllegalArgumentException("id cannot be empty string");
        }
        
        this.id = id;
    }
}
