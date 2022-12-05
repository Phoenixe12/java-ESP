/*Exercice 2 : Ecrire un programme qui calcule la surface d'un triangle. La base et la hauteur devront
être fournies par l'utilisateur. Pour rappel, l’aire d’un triangle = (base * hauteur) / 2 */

package Exercice_1;

import java.util.Scanner;

    public class  Exercice_2 {
        public static void main(String[] args) {
        AirTriangle();  
    }

  public  static void AirTriangle(){
           System.out.println("Entrer une valeur pour la hauteur du triangle");
             Scanner hc = new Scanner(System.in);
                int hauteur = hc.nextInt();
                hc.close();
                System.out.println("Entrer une valeur pour la base du triangle");
                Scanner bc = new Scanner(System.in);
                        int base = bc.nextInt();
                        bc.close();
                int result = (base * hauteur)/ 2;
                System.out.println("L'Air de surface de du triangle est : "+result+"cm²");
    }
}
