
package projet;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.InputMismatchException;
import java.util.Scanner;
;


public class Patient_CNTRL extends Operation{
    
    Patient_BDD m1=new Patient_BDD();
    
    Scanner sc=new Scanner(System.in);
    
    private String nom;
    private String prenom;
    private String adresse;
    private int age;
    private String tel;
    private String GS;
    private double poids;
    private double taill;
   public void ajouter(){
       System.out.println("Saisir le nom de patient");
       nom=sc.nextLine();
       System.out.println("Saisir le prenom de patient");
       prenom=sc.nextLine();
       System.out.println("Saisir le adresse de patient");
       adresse=sc.nextLine();
       System.out.println("Saisir l'age de patient");
       age=sc.nextInt();
       System.out.println("Saisir le numero de telephone de patient");
       sc.nextLine();
       tel=sc.nextLine();
       System.out.println("Saisir le group de patient");
       GS=sc.nextLine();
       System.out.println("Saisir le poids de patient");
       poids=sc.nextDouble();
       System.out.println("Saisir l'ataille de patient");
       taill=sc.nextDouble();
       m1.add(nom, prenom, adresse, age, tel, GS, poids, taill);
   }
   public void modifier(){
       try{
       System.out.println("Saisir le id de patient");
       id=sc.nextInt();
        System.out.println("Saisir le nom de patient");
       nom=sc.nextLine();
       System.out.println("Saisir le prenom de patient");
       prenom=sc.nextLine();
       System.out.println("Saisir le adresse de patient");
       adresse=sc.nextLine();
       System.out.println("Saisir l'age de patient");
       age=sc.nextInt();
       System.out.println("Saisir le numero de telephone de patient");
       tel=sc.nextLine();
       System.out.println("Saisir le group de patient");
       GS=sc.nextLine();
       System.out.println("Saisir le poids de patient");
       poids=sc.nextDouble();
       System.out.println("Saisir l'ataille de patient");
       taill=sc.nextDouble();
       m1.update(id, nom, prenom, adresse, age, tel, GS, poids, taill);
       }catch(InputMismatchException e){
           e.printStackTrace();
       }
   }
   public void supprimer(){
       System.out.println("Saisir le id de patient");
       id=sc.nextInt();
       m1.delete(id);
   }
   public void afficher(){
       System.out.println("******\t\t*********\t\t************\t\t*************\t\t\t*******\t\t*******************\t\t*********\t\t*********\t\t**********");
       System.out.println("* Id *\t\t*  Nom  *\t\t*  Prenom  *\t\t*  Adresse  *\t\t\t* Age *\t\t* Nu de Telephone *\t\t* Group *\t\t* Poids *\t\t* Taille *");
       System.out.println("******\t\t*********\t\t************\t\t*************\t\t\t*******\t\t*******************\t\t*********\t\t*********\t\t**********");
       for(int i=0;i<m1.getPatient().size();i++){
                System.out.print(m1.getPatient().get(i).getId()+"\t\t");
                System.out.print(m1.getPatient().get(i).getNom()+"\t\t\t");
                System.out.print(m1.getPatient().get(i).getPrenom()+"\t\t\t");
                System.out.print(m1.getPatient().get(i).getAdresse()+"\t\t\t");
                System.out.print(m1.getPatient().get(i).getAge()+" ans\t\t");
                System.out.print(m1.getPatient().get(i).getTel()+"\t\t\t");
                System.out.print(m1.getPatient().get(i).getGS()+"\t\t\t");
                System.out.print(m1.getPatient().get(i).getPoids()+" kg\t\t\t");
                System.out.print(m1.getPatient().get(i).getTaill()+" m\t\t\t");
                System.out.println("");
       }
   }
   public void supprimerT(){
       char a;
       System.out.println("Êtes-vous sûr de vouloir supprimer toutes Oui/Non (o/n)");
       a=sc.next().charAt(0);
       if(a=='o'||a=='O') m1.deleteAll();
       else System.out.println("la suppression est annulé");
   }
   public void rechercher(){
       int cpt=0;
       System.out.println("Saisir le id de medicament");
       id=sc.nextInt();
       for(int i=0;i<m1.getPatient().size();i++){
                if(id==m1.getPatient().get(i).getId()){
//                m1.getMedicament().get(8).setNom("9ard");
                System.out.println("******\t\t*********\t\t************\t\t*************\t\t\t*******\t\t*******************\t\t*********\t\t*********\t\t**********");
       System.out.println("* Id *\t\t*  Nom  *\t\t*  Prenom  *\t\t*  Adresse  *\t\t\t* Age *\t\t* Nu de Telephone *\t\t* Group *\t\t* Poids *\t\t* Taille *");
       System.out.println("******\t\t*********\t\t************\t\t*************\t\t\t*******\t\t*******************\t\t*********\t\t*********\t\t**********");
                System.out.print(m1.getPatient().get(i).getId()+"\t\t");
                System.out.print(m1.getPatient().get(i).getNom()+"\t\t\t");
                System.out.print(m1.getPatient().get(i).getPrenom()+"\t\t\t");
                System.out.print(m1.getPatient().get(i).getAdresse()+"\t\t\t");
                System.out.print(m1.getPatient().get(i).getAge()+" ans\t\t");
                System.out.print(m1.getPatient().get(i).getTel()+"\t\t\t");
                System.out.print(m1.getPatient().get(i).getGS()+"\t\t\t");
                System.out.print(m1.getPatient().get(i).getPoids()+" kg\t\t\t");
                System.out.print(m1.getPatient().get(i).getTaill()+" m\t\t\t");
//                System.out.println("");
                cpt++;
                }
       }
                if(cpt==0){
                    System.err.println("Le id n'existe pas");
                }
   }
}
