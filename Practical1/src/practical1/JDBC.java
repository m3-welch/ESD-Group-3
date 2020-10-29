package practical1;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Austin + Harrison
 */
public class JDBC {
    
    Connection connection = null;
    Statement statement = null;
    ResultSet rs = null;
    String query = null;
    
    
    public JDBC(String query){
        this.query = query;
    }
    
    public void connect() throws ClassNotFoundException, SQLException{
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            connection = DriverManager.getConnection("jdbc:derby://localhost/GradesDB", "Austin", "1234" );                                        
        }
        catch(SQLException e) {
            System.out.println(e);
        }
    }
    public ResultSet retrieve(String sql){
        try {
           
            statement = connection.createStatement();
            rs = statement.executeQuery(sql);
            
            return rs;
        }
        catch(SQLException e) {
            System.out.println(e);
            return rs;
        }

    }
    
    public void insert(String sql){
        try {
            statement = connection.createStatement();
            int val = statement.executeUpdate(sql);
            
            System.out.println(val+" rows added.");
        } catch (SQLException ex) {
            Logger.getLogger(JDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }
    public void update(String sql) {
        try {
            statement = connection.createStatement();
            int val = statement.executeUpdate(sql);
            System.out.println(val+" rows updated.");
        } catch (SQLException ex) {
            Logger.getLogger(JDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void closeAll(){
        try {
            rs.close();
            statement.close(); 		
            connection.close();                                         
        }
        catch(SQLException e) {
            System.out.println(e);
        }
    }
    
    public void clear(){
        try {
            statement = connection.createStatement();
            int val = statement.executeUpdate("DELETE FROM Grades");
            System.out.println(val+" rows absolutely destroyed.");
        }
        catch(SQLException e) {
            System.out.println(e);
        }
    }
            
}
