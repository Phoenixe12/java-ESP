/*
 * Exercice 13 : Ecrire un programme qui demande le numéro d’un mois de l’année avant d’afficher le
mois auquel il correspond. Par exemple, le mois de Janvier devra être affiché si jamais la valeur 1 lui
est fournie. Un message d’erreur devra être affiché au cas où le numéro ne correspond à aucun mois.
 */

package Exercice_1;

import java.util.Scanner;

public class Exercice_13 {
    public static void main(String[] args) {
        System.out.println("Entrer le numéros d'un mois de l'année");
        System.out.println("Choix : ");
        Scanner sc= new Scanner(System.in);
           int choix = sc.nextInt();
           sc.close();
           switch (choix) {
            case 1:
                System.out.println("JANVIER");
                break;
            case 2:
                System.out.println("FEVRIER");
                break;
            case 3:
                System.out.println("MARS");
                break;
            case 4:
                System.out.println("AVRIL");
                break;
            case 5:
                System.out.println("MAI");
                break;
            case 6:
                System.out.println("JUIN");
                break;
            case 7:
                System.out.println("JUILLET");
                break;
            case 8:
                System.out.println("AOUT");
                break;
            case 9:
                System.out.println("SEPTEMBRE");
                break;
            case 10:
                System.out.println("OCTOBRE");
                break;
            case 11:
                System.out.println("NOVEMBRE");
                break;
            case 12:
                System.out.println("DECEMBRE");
                break;
            default: System.out.println(" ERROR le numéro ne correspond aucun des mois ");
                break;
           }
    }
}
