
package projet;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;



public class Patient_BDD {
    
    static Connection cnx;
    static Statement st;
    static ResultSet rst;
    
    public void add( String nom, String prenom, String adresse, int age, String tel, String GS, double poids, double taill) {
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
   public void update( int id,String nom, String prenom, String adresse, int age, String tel, String GS, double poids, double taill) {
        try{
        String requet="update patient set nom='"+nom+"',prenom='"+prenom+"',adresse='"+adresse+"',age="+age+",tel="+tel+",gs="+GS+",taill="+taill+",poids="+poids+" where id_p="+id;
            cnx=Connexion.connecterDB();
            st=cnx.createStatement();
            st.executeUpdate(requet);
            System.out.println("produit bien modifier");
        
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
   public void delete( int id) {
        try{
        String requet="delete from patient where id_p="+id;
            cnx=Connexion.connecterDB();
            st=cnx.createStatement();
            st.executeUpdate(requet);
            System.out.println("medicament bien supprimer");
        
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
   public void deleteAll() {
        String []tab=new String[3];
        tab[0]="utilise";
        tab[1]="patient";
        tab[2]="medicament";
        for (int i = 0; i < 3; i++) {
            try{
        String requet="delete from "+tab[i];
            cnx=Connexion.connecterDB();
            st=cnx.createStatement();
            st.executeUpdate(requet);
            System.out.println("table "+tab[i]+" est bien supprimer");
        
        }catch(SQLException e){
            e.printStackTrace();
        }
       }
    }


    
    public ArrayList<Patient> getPatient() {
        ArrayList<Patient> patient=new ArrayList<>();
        Patient pt;
        try{
            cnx=Connexion.connecterDB();
            st=cnx.createStatement();
            rst=st.executeQuery("select * from patient");
            while(rst.next()){
                pt=new Patient(
                rst.getInt("id_p"),
                rst.getString("nom"),
                rst.getString("prenom"),
                rst.getString("adresse"),
                rst.getInt("age"),
                rst.getString("tel"),
                rst.getString("gs"),
                rst.getInt("taill"),
                rst.getInt("poids")
//                System.out.print(rst.getDate("date_c")+"\t");
//                System.out.println("");
                );
                patient.add(pt);
            }
        }catch(SQLException e){
            e.printStackTrace();
        } 
        return patient;
        }
}
