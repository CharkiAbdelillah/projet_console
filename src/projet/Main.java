
package projet;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    static Connection cnx;
    static Statement st;
    static ResultSet rst;
    
    public static void main(String[] args) {
        Connexion cnx=new Connexion();
        cnx.connecterDB();
    }
}
