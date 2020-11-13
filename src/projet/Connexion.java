
package projet;

import java.sql.*;
import com.mysql.jdbc.Connection;

public class Connexion{
public static Connection connecterDB(){
        try{
        Class.forName("com.mysql.jdbc.Driver");
//        System.out.println("Driver oki");
        String dbname="cabinet";
        String url="jdbc:mysql://localhost/"+dbname+"?user=root&password=root";
        Connection cnx=(Connection) DriverManager.getConnection(url);
//        System.out.println("Connexion bien etablie");
        return cnx;
        }
        catch(Exception ex){
            ex.printStackTrace();
            return null;
        }
    }

}