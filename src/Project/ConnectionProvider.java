package Project;
import java.sql.*;
public class ConnectionProvider {
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://node107500-rajdhanhms.cloudjiffy.net/project","root","PGXkxg11675");
            return con;
        }catch(Exception e){
            return null;
        }
    }
    
}
