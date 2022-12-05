/*
 * Exercice 14 : Ecrire un programme qui détermine le nombre de jours correspondant au numéro du
mois fourni. Par exemple, les mois de Janvier (1) et de Décembre (12) font 31 jours là où Mars (3) en
fait 30.
 */
package Exercice_1;

import java.util.Scanner;

public class Exercice_14 {
    
   public static void main(String[] args) {
    System.out.println("Entrer le numéros d'un mois de l'année");
    System.out.println("Choix : ");
    Scanner sc= new Scanner(System.in);
       int choix = sc.nextInt();
       sc.close();
       switch (choix) {
        case 1:
            System.out.println("31");
            break;
        case 2:
            System.out.println("28");
            break;
        case 3:
            System.out.println("31");
            break;
        case 4:
            System.out.println("30");
            break;
        case 5:
            System.out.println("31");
            break;
        case 6:
            System.out.println("30");
            break;
        case 7:
            System.out.println("31");
            break;
        case 8:
            System.out.println("31");
            break;
        case 9:
            System.out.println("30");
            break;
        case 10:
            System.out.println("31");
            break;
        case 11:
            System.out.println("31");
            break;
        case 12:
            System.out.println("31");
            break;
        default: System.out.println(" ERROR le numéro ne correspond aucun des mois ");
            break;
   }
       
}
  
    
 }


