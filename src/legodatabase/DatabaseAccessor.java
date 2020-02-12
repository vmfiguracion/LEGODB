package legodatabase;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Allows the main program to connect to the database 
 */
public class DatabaseAccessor {

    //Needed to make sure only one instance is allowed
    private static DatabaseAccessor instance = null;
    
    public static DatabaseAccessor getInstance(){
        //If an instance does not exist create one else return the current instance
        if (instance == null){
            instance = new DatabaseAccessor();
            return instance;
        }
        else{
            return instance;
        }
    }
    private DatabaseAccessor(){
        //get the driver
        try {
            Class.forName("com.mysql.jdbc.Driver");
         }
         catch(ClassNotFoundException ex) {
            System.out.println("Error: unable to load driver class!");
            System.exit(1);
         }
    }
    
    public Connection getConnection(){
        Connection conn = null;
        
        //Create a connection to be used for queries/updates/etc
        String url = "jdbc:mysql://localhost:3306/lego";
        String user = "";
        String password = "lego";
        
        try {
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseAccessor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return conn;
    }
    
    public void submitQuery(String qry, Statement stmt){
        
    }
    
    public void submitUpdate(String upd, Statement stmt){
        
    }
    
}
