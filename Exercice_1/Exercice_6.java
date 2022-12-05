package Exercice_1;

import java.util.Scanner;

public class Exercice_6 {
    public static void main(String[] args) {
        convertisseur();     
    }
   
    
    
   public static void convertisseur(){
        float Euro = (float)655.957;
        System.out.println("Entrer le montant en FCFA :");
        Scanner sc = new Scanner(System.in);
                float MHT= sc.nextFloat();
                sc.close();

                float result = (MHT * 1)/Euro;
                System.out.println("le montant en euro est  : "+result+" euro");
    }
}
