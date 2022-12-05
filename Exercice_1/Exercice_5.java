package Exercice_1;
import java.util.Scanner;
 import java.text.DecimalFormat;
/*Exercice 5 : Écrire un programme qui acquiert un nombre décimal (« à virgule »), censé représenter
un prix hors taxes, et qui affiche le prix TTC correspondant.
Le taux de la TVA est de 18,5%. Le résultat
devra être affiché sur deux chiffres après la virgule. */
public class Exercice_5 {
    public static void main(String[] args) {
        TTC();     
    }
  public  static void TTC(){
        float TVA = (float) 18.5;
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Entrer le montant HT :");
        Scanner sc = new Scanner(System.in);
                float hT = sc.nextFloat();
                sc.close();

                float result = hT+(1+(TVA*1)/100);
                System.out.println("LE TTC est : "+df.format(result)+"TTC");
    }
}
