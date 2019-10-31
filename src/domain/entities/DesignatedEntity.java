

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
    
    public void setId(String id){
        if(id == null){
            throw new IllegalArgumentException("id cannot be null");
        } else if(id.equals("")){
            throw new IllegalArgumentException("id cannot be empty string");
        }
        
        this.id = id;
    }
    
    @Override
    public String getId(){
        return this.id;
    }
}
