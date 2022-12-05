/*Exercice 7 : Ecrire un programme qui permet de convertir une vitesse en Km/h (renseigné par
l'utilisateur) en une vitesse en m/s. Par exemple, 180 Km/h = 50 m/s */
package Exercice_1;

import java.util.Scanner;

public class Exercice_7 {
    public static void main(String[] args) {
       
        Vitesse();

    }
    
  public  static void Vitesse(){
        System.out.println("Entrer la vitesse en kilomètre heure");
        Scanner hc = new Scanner(System.in);
                int vitesse = hc.nextInt();
                hc.close();

                int result = (vitesse*1000)/3600;
                System.out.println("La vitesse en m/s est : "+result+"m/s");
    } 
}
