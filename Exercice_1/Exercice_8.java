/*Exercice 8 : Ecrire un programme qui convertit un nombre de secondes renseigné par l'utilisateur en
nombre d'heures, minutes et secondes. Par exemple, 35000 secondes = 9 heures 43 minutes et 20
secondes. */
package Exercice_1;

import java.util.Scanner;

public class Exercice_8 {
    public static void main(String[] args) {
       
        convertisseur();

    }
    
public static void convertisseur(){
        int H, M, S, R;
        System.out.println("Entrer votre seconde pour la connaitre en format HH:MM:SS");
        Scanner sc = new Scanner(System.in);
                int seconde = sc.nextInt();
                sc.close();

                H=seconde/3600;
                R=seconde-(H*3600);
                M=R/60;
                S=R-(M*60);

              
                System.out.println("On a : "+H+" heures "+M+" minutes "+S+" secondes ");
                
    } 
}