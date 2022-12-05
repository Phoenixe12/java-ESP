/*Exercice 10 : Écrire un programme qui affiche la différence entre la moyenne arithmétique et la
moyenne géométrique de deux réels renseignés par l’utilisateur.
Vous pouvez utiliser la fonction sqrt pour le calcul de la racine carré. Par exemple, pour mettre la
racine carré de 9 dans une variable dénommée resultat, il faudra faire : resultat = Math.sqrt(9);
Pour rappel, ces différentes moyennes se calculent comme suit :


moyenne arithmétique : MA = (a + b) / 2 et
moyenne géométrique : Mg = √𝑎 ∗ 𝑏 */
package Exercice_1;

import java.util.Scanner;

public class Exercice_10 {
    
    public static void main(String[] args)  
    {
        System.out.print("Entrez un nombre a :");
        Scanner sc = new Scanner(System.in);
        int nba = sc.nextInt(); 
        sc.close();

        System.out.print("Entrez un nombre b :");
        Scanner hc = new Scanner(System.in);
        int nbb = hc.nextInt(); 
        hc.close();

          int result;
          int racine;
          racine=nba+nbb;
          result = (int) (Sommme(nba, nbb) - Math.sqrt(racine));
       System.out.println("Le resultat est : "+ result);

    }

    public static int Sommme(int a, int b) {
        int c;
        c =(int)(a + b) / 2 ;
        return c;
    }
}



