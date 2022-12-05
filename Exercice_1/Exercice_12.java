/*
 * Exercice 12 : Ecrire un programme qui affiche le menu du jour au client d’un restaurant avant de lui
demander de choisir. Une fois le choix effectué, il lui notifie du prix à payer. On partira du principe que
le restaurant propose les plats suivants : Yassa (2000 FCFA), Mafé (1500 FCFA) et Thièbou Dieun (1000
FCFA). Un message d’erreur devra être affiché au cas où le choix ne correspond à aucun des plats.
 */
package Exercice_1;

import java.util.Scanner;

public class Exercice_12 {
    public static void main(String[] args) {
    System.out.println("================Bienvenue voici le repas du jours====================");
    System.out.println("Taper 1 pour Yassa (2000 FCFA)");
    System.out.println("Taper 2 pour Mafé (1500 FCFA)");
    System.out.println("Taper 3 pour Thièbou Dieun (1000FCFA)");
    System.out.println("=====================================================================");
    System.out.println("Choix : ");
    Scanner sc= new Scanner(System.in);
       int choix = sc.nextInt();
       sc.close();

       if(choix== 1){
         System.out.println("vous avez choisi Yassa");
       }else if(choix==2){
        System.out.println("vous avez choisi Mafé");
       }
       else if(choix==3){
        System.out.println("vous avez choisi Thièbou Dieun ");
       }else{
        System.out.println("======================ERROR==========================================");
        System.out.println("le choix ne correspond à aucun des plats.");
        System.out.println("=====================================================================");
       }
    
    }
}
