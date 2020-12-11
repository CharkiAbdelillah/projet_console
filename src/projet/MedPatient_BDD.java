
package projet;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import static projet.Patient_BDD.cnx;

public class MedPatient_BDD {
    static Connection cnx;
    static Statement st;
    static ResultSet rst;
    
    public void add(int id_p,int id_m){
        try{
        String requet="insert into utilise(id_p,id_m) values('"+id_p+"','"+id_m+"')";
            cnx=Connexion.connecterDB();
            st=cnx.createStatement();
            st.executeUpdate(requet);
            System.out.println("Bien ajoute");
        
        }catch(SQLException e){
//            e.printStackTrace();
            System.out.println("Le id de Patient ou Medicament n'existe pas");
        }
    }
    public void update(int id_p,int id_m){
        try{
        int id=id_p;
        String requet="update utilise set id_p='"+id_p+"',id_m='"+id_m+"' where id_p="+id;
            cnx=Connexion.connecterDB();
            st=cnx.createStatement();
            st.executeUpdate(requet);
            System.out.println("Bien Modifier");
        
        }catch(SQLException e){
//            e.printStackTrace();
            System.out.println("Le id de Patient ou Medicament n'existe pas");
        }
    }
    public void delete( int id) {
        try{
        String requet="delete from utilise where id_p="+id;
            cnx=Connexion.connecterDB();
            st=cnx.createStatement();
            st.executeUpdate(requet);
            System.out.println("Bien supprimer");
        
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    public ArrayList<MedPatient> getMedPatient(){
        ArrayList<MedPatient> MedP=new ArrayList<>();
        MedPatient mp;
        try{
            cnx=Connexion.connecterDB();
            st=cnx.createStatement();
            rst=st.executeQuery("select * from utilise");
            while(rst.next()){
                mp=new MedPatient(
                rst.getInt("id_p"),
                rst.getInt("id_m")
                );
                MedP.add(mp);
            }
        }catch(SQLException e){
            e.printStackTrace();
        } 
    return MedP;
    }    
    
}
