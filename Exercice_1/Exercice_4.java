package Exercice_1;
import java.util.Scanner;

/*
 * Exercice 4 : Ecrire un programme qui calcule la vitesse d’un coureur. La distance (en m) et le temps
(en s) devront être renseignés par l’utilisateur.
 */
public class Exercice_4 {
    public static void main(String[] args) {
       
        Vitesse();

    }
    
  public  static void Vitesse(){
        System.out.println("Entrer la vitesse en mètre ");
        Scanner hc = new Scanner(System.in);
                double vitesse = hc.nextDouble();
                hc.close();

                System.out.println("Entrer le temps en seconde");
                Scanner bc = new Scanner(System.in);
                        double seconde = bc.nextDouble();
                        bc.close();
                double result = vitesse / seconde;
                System.out.println("La vitesse en m/s est : "+result+"m/s");
    }
}
