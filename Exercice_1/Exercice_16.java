package Exercice_1;

import java.util.Scanner;

public class Exercice_16 {
    public static void main(String[] args) {
  System.out.println("====================================================");
  System.out.println("Entrer votre moyenne");
  System.out.println("Moyenne: ");
  Scanner sc= new Scanner(System.in);
  int moyenne = sc.nextInt();
  sc.close();
  System.out.println("====================================================");

  if (moyenne<=10) {
    System.out.println("Faible");
  } else 
     if(moyenne > 10 && moyenne <= 14){
        System.out.println(" BON ");
  }else 
  if(moyenne >= 14 && moyenne <= 17 || moyenne >= 17 && moyenne <= 20){
     System.out.println("EXCELLENT");

    }
 }
}
