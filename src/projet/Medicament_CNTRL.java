
package projet;

import java.util.Scanner;

public class Medicament_CNTRL {
    
    Medicament_BDD m1=new Medicament_BDD();
    
    Scanner sc=new Scanner(System.in);
    
    public String nom;
    public String posologie;
    public String code_cure;
    
   public void ajouter(){
       System.out.println("Saisir le nom de medicament");
       nom=sc.nextLine();
       System.out.println("Saisir la posologie");
       posologie=sc.nextLine();
       System.out.println("Saisir le code cure");
       code_cure=sc.nextLine();
       m1.ajouter(nom, posologie, code_cure);
   }
   public void afficher(){
       for(int i=0;i<m1.getMedicament().size();i++){
                System.out.print(m1.getMedicament().get(i).getId()+"\t");
                System.out.print(m1.getMedicament().get(i).getNom()+"\t");
                System.out.print(m1.getMedicament().get(i).getPosologie()+"\t");
                System.out.print(m1.getMedicament().get(i).getCode_cure()+"\t");
                System.out.println("");
       }
   }
   public void rechercher(int id){
       for(int i=0;i<m1.getMedicament().size();i++){
                if(id==m1.getMedicament().get(i).getId()){
//                m1.getMedicament().get(8).setNom("9ard");
                System.out.print(m1.getMedicament().get(i).getId()+"\t");
                System.out.print(m1.getMedicament().get(i).getNom()+"\t");
                System.out.print(m1.getMedicament().get(i).getPosologie()+"\t");
                System.out.print(m1.getMedicament().get(i).getCode_cure()+"\t");
//                System.out.println("");
                }
       }
   }
}
