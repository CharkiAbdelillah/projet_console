/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class Medicament_BDD {
    
    static Connection cnx;
    static Statement st;
    static ResultSet rst;
    

    
    public void ajouter( String nom, String posologie, String code_cure) {
        try{
        String requet="insert into medicament(nom,posologie,code_cure) values('"+nom+"','"+posologie+"','"+code_cure+"')";
            cnx=Connexion.connecterDB();
            st=cnx.createStatement();
            st.executeUpdate(requet);
            System.out.println("medicament bien ajoute");
        
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

//    @Override
//    public void afficher() {
//        try{
//            cnx=Connexion.connecterDB();
//            st=cnx.createStatement();
//            rst=st.executeQuery("select * from medicament");//where id_m=1
//            while(rst.next()){
//                System.out.print(rst.getInt("id_m")+"\t");
//                System.out.print(rst.getString("nom")+"\t");
//                System.out.print(rst.getString("posologie")+"\t");
//                System.out.print(rst.getString("code_cure")+"\t");
//                System.out.println("");
//            }
//        }catch(SQLException e){
//            e.printStackTrace();
//        }
//    }
    static ArrayList<Medicament> getMedicament(){
        ArrayList<Medicament> medicament=new ArrayList<>();
        Medicament med;  
        try{
            cnx=Connexion.connecterDB();
            st=cnx.createStatement();
            rst=st.executeQuery("select * from medicament");//where id_m=1
            while(rst.next()){
                med=new Medicament(
                rst.getInt("id_m"),
                rst.getString("nom"),
                rst.getString("posologie"),
                rst.getString("code_cure")
                );
                medicament.add(med);
//                System.out.println("");
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return medicament;
    }
}
