
package projet;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Medicament_CNTRL {
    
    Medicament_BDD m1=new Medicament_BDD();
    
    Scanner sc=new Scanner(System.in);
    
    public String nom;
    public String posologie;
    public String code_cure;
    public int id;
    
   public void ajouter(){
       System.out.println("Saisir le nom de medicament");
       nom=sc.nextLine();
       System.out.println("Saisir la posologie");
       posologie=sc.nextLine();
       System.out.println("Saisir le code cure");
       code_cure=sc.nextLine();
       m1.add(nom, posologie, code_cure);
   }
   public void modifier(){
       try{
       System.out.println("Saisir le id de medicament");
       id=sc.nextInt();
       sc.nextLine();// delete buffer
        //id=17;
       System.out.println("Saisir le nom de medicament");
       nom=sc.nextLine();
//       System.out.println(nom);
       System.out.println("Saisir la posologie");
       posologie=sc.nextLine();
       System.out.println("Saisir le code cure");
       code_cure=sc.nextLine();
       m1.update(id,nom, posologie, code_cure);
       }catch(InputMismatchException e){
           e.printStackTrace();
       }
   }
   public void supprimer(){
       System.out.println("Saisir le id de medicament");
       id=sc.nextInt();
       m1.delete(id);
   }
   public void afficher(){
       System.out.println("******\t\t*********\t\t*************\t\t*************");
       System.out.println("* Id *\t\t*  Nom  *\t\t* Posologie *\t\t* Code_cure *");
       System.out.println("******\t\t*********\t\t*************\t\t*************");
       for(int i=0;i<m1.getMedicament().size();i++){
                System.out.print(m1.getMedicament().get(i).getId()+"\t\t");
                System.out.print(m1.getMedicament().get(i).getNom()+"\t\t");
                System.out.print(m1.getMedicament().get(i).getPosologie()+"\t\t\t");
                System.out.print(m1.getMedicament().get(i).getCode_cure()+"\t");
                System.out.println("");
       }
   }
   public void rechercher(){
       int cpt=0;
       System.out.println("Saisir le id de medicament");
       id=sc.nextInt();
       for(int i=0;i<m1.getMedicament().size();i++){
                if(id==m1.getMedicament().get(i).getId()){
//                m1.getMedicament().get(8).setNom("9ard");
                System.out.println("******\t\t*********\t\t*************\t\t*************");
                System.out.println("* Id *\t\t*  Nom  *\t\t* Posologie *\t\t* Code_cure *");
                System.out.println("******\t\t*********\t\t*************\t\t*************");
                System.out.print(m1.getMedicament().get(i).getId()+"\t");
                System.out.print(m1.getMedicament().get(i).getNom()+"\t");
                System.out.print(m1.getMedicament().get(i).getPosologie()+"\t");
                System.out.print(m1.getMedicament().get(i).getCode_cure()+"\t");
//                System.out.println("");
                cpt++;
                }
       }
                if(cpt==0){
                    System.err.println("Le id n'existe pas");
                }
   }
}
