/*
 * Exercice 11 : Ecrire un programme qui demande l’âge d’un utilisateur et lui notifie s’il est mineur (a
moins de 18 ans) ou pas.
 */

package Exercice_1;

import java.util.Scanner;

public class Exercice_11 {
     public static void main(String[] args) {
        System.out.println("Entrez votre age");
        Scanner sc = new Scanner(System.in);
                int nombre =sc.nextInt();
               sc.close();

                if(nombre<=18){
                    System.out.println("Vous etes encore mineur");
                }else{
                    System.out.println("Vous etes majeur");
                }
    }
}