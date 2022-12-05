/*Exercice 9 : Ecrire un programme qui permet de calculer la somme des N premiers entiers positifs, N
étant renseigné par l’utilisateur. Il devra utiliser la formule suivante :
SN = 1 + 2 + .... + N =
𝑁 ∗ (𝑁+1)/2 */

package Exercice_1;

import java.util.Scanner;

public class Exercice_9 {
    public static void main(String[] args) {
       
        NombrePremier();

    }
    
   public static void NombrePremier(){
        int S = 0;
        System.out.println("Entrer un nombre positive :");
        Scanner hc = new Scanner(System.in);
                int nombre = hc.nextInt();
                hc.close();
                 for(int i=1 ;i<nombre ;i++){
                    S = S+i;
                 }
                
                System.out.println(" La somme est : "+S);
    } 
}
