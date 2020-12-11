
package projet;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {

        Patient_CNTRL p=new Patient_CNTRL();
        MedPatient_CTRL mp=new MedPatient_CTRL();
        Medicament_CNTRL m=new Medicament_CNTRL();
        boolean exit=false;
        while(!exit){
        System.out.println("Gestion de Patient: Tapez 1");
        System.out.println("Gestion de Medicament: Tapez 2");
        System.out.println("Liées le patient avec le medicament: Tapez 3");
        System.out.println("Exit :Tapez 0");
        int option=sc.nextInt();
        
        switch(option){
            case 1:
                System.out.println(" 1 - Ajouter ");
                System.out.println(" 2 - Voir les patients");
                System.out.println(" 3 - Supprimer ");
                System.out.println(" 4 - Modifier");
                System.out.println(" 5 - Rechercher");
                System.out.println(" 6 - Supprimer toutes les tables");
                System.out.println(" 0 - Retour ");
                int a=sc.nextInt();
                switch(a){
                    case 1: p.ajouter(); break;
                    case 2: p.afficher(); break;
                    case 3: p.supprimer(); break;
                    case 4: p.modifier(); break;
                    case 5: p.rechercher(); break;
                    case 6: p.supprimerT(); break;
                    case 7:  break;
                }   
                break;
            case 2:
                System.out.println(" 1 - Ajouter ");
                System.out.println(" 2 - Voir les Medicaments");
                System.out.println(" 3 - Supprimer ");
                System.out.println(" 4 - Modifier");
                System.out.println(" 5 - Rechercher");
                System.out.println(" 0 - Retour ");
                int b=sc.nextInt();
                switch(b){
                    case 1: m.ajouter(); break;
                    case 2: m.afficher(); break;
                    case 3: m.supprimer(); break;
                    case 4: m.modifier(); break;
                    case 5: m.rechercher(); break;
                    case 6:  break;
                }
                break;
            case 3:
                System.out.println(" 1 - Ajouter ");
                System.out.println(" 2 - Voir les Medicaments et patients");
                System.out.println(" 3 - Supprimer ");
                System.out.println(" 4 - Modifier");
                System.out.println(" 5 - Rechercher");
                System.out.println(" 0 - Retour ");
                int c=sc.nextInt();
                switch(c){
                    case 1: m.ajouter(); break;
                        case 2: mp.afficher(); break;
                    case 3: mp.supprimer(); break;
                    case 4: mp.modifier(); break;
                    case 5: mp.recherche(); break;
                    case 6:  break;
                }
                break;
            case 0: exit=true;
                System.out.println("L'application est exit");
                break;
            default :
                    System.out.println("Option non valide");
        }
        }
    }
}
