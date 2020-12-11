
package projet;

import java.util.Scanner;

public class MedPatient_CTRL {
   MedPatient_BDD m1=new MedPatient_BDD();
    
    Scanner sc=new Scanner(System.in);
    
    private int id_p;
    private int id_m;
    
    public void ajouter(){
        System.out.println("Saisir le id de patient");
        id_p=sc.nextInt();
        System.out.println("Saisir le id de Medicament");
        id_m=sc.nextInt();
        m1.add(id_p, id_m);
    }
    
    public void modifier(){
        System.out.println("Saisir le id de patient");
        id_p=sc.nextInt();
        System.out.println("Saisir le nouveaux id de Medicament");
        id_m=sc.nextInt();
        m1.add(id_p,id_m);
    }
    public void supprimer(){
       System.out.println("Saisir le id de patient");
       id_p=sc.nextInt();
       m1.delete(id_p);
   }
   public void afficher(){
       System.out.println("************\t\t***************");
       System.out.println("*Id_Patient*\t\t*Id_Medicament*");
       System.out.println("************\t\t***************");

       for(int i=0;i<m1.getMedPatient().size();i++){
           System.out.print(m1.getMedPatient().get(i).getId_p()+"\t\t\t");
           System.out.print(m1.getMedPatient().get(i).getId_m()+"\t");
           System.out.println("");
       }
   } 
   public void recherche(){
       System.out.println("Saisir le id de patient");
       id_p=sc.nextInt();
       int cpt=0;
       for(int i=0;i<m1.getMedPatient().size();i++){
            if(id_p==m1.getMedPatient().get(i).getId_p()){
                System.out.println("************\t\t***************");
                System.out.println("*Id_Patient*\t\t*Id_Medicament*");
                System.out.println("************\t\t***************");
                System.out.print(m1.getMedPatient().get(i).getId_p()+"\t");
                System.out.print(m1.getMedPatient().get(i).getId_m()+"\t");
                System.out.println("");
                cpt++;
            }
       }
       if(cpt==0) System.out.println("Le id n'existe pas");
   } 
}
