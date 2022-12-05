package Exercice_1;
import java.util.Scanner;

public class Exercice_15 {


    public static void main(String[] args) {
        System.out.println("==========================================");

        System.out.println("Taper C pour convertir en CFA ");
        System.out.println("Taper E pour convertir en EURO");
        System.out.println("Choix : ");
        Scanner sc= new Scanner(System.in);
           String choix = sc.nextLine();
        System.out.println("==========================================");
        switch (choix) {
            case "C":
            float Cfa = (float)655.957;
            System.out.println("Entrer le montant en Euro :");
            Scanner ec = new Scanner(System.in);
                    float montantCfa= ec.nextFloat();
                   float  resultCfa = montantCfa * Cfa;
                   System.out.println("le montant en euro est  : "+resultCfa+"Cfa");
                break;
                    case "E":
                    float Euro = (float)655.957;
                    System.out.println("Entrer le montant en FCFA :");
                    Scanner hc = new Scanner(System.in);
                            float montantEuro= hc.nextFloat();
                            float  resultEuro = (montantEuro * 1)/Euro;
                            System.out.println("le montant en euro est  : "+resultEuro+ "Euro");
                    break;
            default:
                break;
        }
        sc.close();
              
    }
    
    

}
