
package projet;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
;


public class Patient_BDD extends Operation{
    
    static Connection cnx;
    static Statement st;
    static ResultSet rst;
    
    public void ajouter( String nom, String prenom, String adresse, int age, String tel, String GS, int poids, int taill) {
        try{
        String requet="insert into patient(nom,prenom,adresse,age,tel,gs,taill,poids) values('"+nom+"','"+prenom+"','"+adresse+"','"+age+"','"+tel+"','"+GS+"','"+taill+"','"+poids+"')";
            cnx=Connexion.connecterDB();
            st=cnx.createStatement();
            st.executeUpdate(requet);
            System.out.println("produit bien ajoute");
        
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

//    @Override
//    public void modifier() {
//    }

    @Override
    public void supprimer() {
    }

//    @Override
//    public void rechercher(){
//    }

//    @Override
//    public public void ajouter() {
//    }

    @Override
    public void afficher() {
        try{
            cnx=Connexion.connecterDB();
            st=cnx.createStatement();
            rst=st.executeQuery("select * from patient");
            while(rst.next()){
                System.out.print(rst.getInt("id_p")+"\t");
                System.out.print(rst.getString("nom")+"\t");
                System.out.print(rst.getString("prenom")+"\t");
                System.out.print(rst.getString("adresse")+"\t");
                System.out.print(rst.getInt("age")+"\t");
                System.out.print(rst.getString("tel")+"\t");
                System.out.print(rst.getString("gs")+"\t");
                System.out.print(rst.getInt("taill")+"\t");
                System.out.print(rst.getInt("poids")+"\t");
//                System.out.print(rst.getDate("date_c")+"\t");
                System.out.println("");
            }
        }catch(SQLException e){
            e.printStackTrace();
        }    }
}
