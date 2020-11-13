
package projet;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
    static Connection cnx;
    static Statement st;
    static ResultSet rst;
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {

//        Connexion.connecterDB(); 

        Patient p=new Patient(); 
//        p.ajouter("haha", "kaka", "hello", 19, "067373", "Ga", 12, 16);
//        p.afficher();
        
        Medicament_CNTRL m1=new Medicament_CNTRL();
//        m1.ajouter();
        m1.afficher();
        System.out.println("Svp saisir le id de medicament");
        int id=sc.nextInt();
        m1.rechercher(id);
    }
}
