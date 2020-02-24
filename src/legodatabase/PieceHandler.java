package legodatabase;

import java.util.List;
import java.util.ArrayList;

/**
 * Will be renamed. Builds queries/updates to be applied to database
 */
public class PieceHandler {

    //The connection and statement go here
    public PieceHandler(){
        
    }
    
    /**
     * Build an UPDATE query
     * @param piece    The lego piece to add
     */
    public void addPiece(LegoPiece piece){
        
    }
    
    /**
     * Build a SELECT query
     * @param dummy used to build the query with the search requirements to
     *              send to the database
     *              SHOULD NOT be given an empty dummy
     * @return 
     */
    public String getPieces(LegoPiece dummy){
        StringBuilder sb = new StringBuilder();
        boolean multiFilter = false;
        
        sb.append("SELECT * ");
        sb.append("FROM pieces ");
        
        //Build the query using the non empty values of dummy
        sb.append("WHERE ");
        if(!dummy.getId().isEmpty()){
            sb.append("id = " + dummy.getId());
            multiFilter = true;
        }
        
        if(!dummy.getDispName().isEmpty()){
            if(multiFilter){
                sb.append(" AND ");
            }
            sb.append("type = " + dummy.getDispName());
            multiFilter = true;
        }
        
        if(!dummy.getDispColour().isEmpty()){
            if(multiFilter){
                sb.append(" AND ");
            }
            sb.append("colour = " + dummy.getDispColour());
            multiFilter = true;
        }
        
        if(dummy.getWidth() != 0){
            if(multiFilter){
                sb.append(" AND ");
            }
            sb.append("width = " + dummy.getWidth());
            multiFilter = true;
        }
                
        if(dummy.getLength() != 0){
            if(multiFilter){
                sb.append(" AND ");
            }
            sb.append("length = " + dummy.getLength());
            multiFilter = true;
        }
            
       return sb.toString();
    }
}
