package Exercice_1;
/*Exercice 3 : Ecrire un programme qui calcule la moyenne arithmétique de trois réels renseignés par
l'utilisateur.*/

import java.util.Scanner;

public class Exercice_3 {
     public static void main(String[] args) {
       
        arthmetique();

    }

  public  static void arthmetique(){
        System.out.println("Entrer le premier nombre");
        Scanner nba = new Scanner(System.in);
                int nombre1 = nba.nextInt();
               nba.close();
                
                System.out.println("Entrer une valeur pour le deuxième nombre ");
                Scanner nbb = new Scanner(System.in);
                        int nombre2 = nbb.nextInt();
                        nbb.close();
                        System.out.println("Entrer une valeur pour le troisixème nombre");
                        Scanner nbc = new Scanner(System.in);
                                int nombre3 = nbc.nextInt();
                                nbc.close();
                          int result = (nombre1 + nombre2 + nombre3) /3;  
                          System.out.println("Le résulat est : "+result); 
    }
}
