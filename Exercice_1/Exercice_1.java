/*Exercice 1 : Ecrire un programme qui calcule le périmètre ainsi que
 la surface d'un carré. L'utilisateur devra renseigner la longueur du côté.*/

 package Exercice_1;

import java.util.Scanner;
 // on vas lui demander quelle opération aimerait t'il effectuée 
// si choix fait égale surface on lui demande d'entrer la longeur du carrée
 //sinon si choix fait égale périmètre on lui demande d'entrer la longeur du carrée

public class Exercice_1{
    public static void main(String[] args) {
  
       System.out.println("--------------------Bienvenu---------------------");

       System.out.println("Taper 1 pour calculer le périmètre");
       System.out.println("Taper 2 pour calculer la surface");
       Scanner sc = new Scanner(System.in);
                    int choix = sc.nextInt();
                    sc.close();
        switch (choix) {
            case 1: perimetre(); 
                    
                break;
            case 2: surface(); 
                    
                break;
            default:
                break;
        }
       System.out.println("-------------------------------------------------");
    } 
    
  

            static void perimetre(){
                int longeur;
                
                System.out.println("Entrez la longeur");
                Scanner sc = new Scanner(System.in);
                            longeur = sc.nextInt();
                            sc.close();
                        int perimetre = longeur * 4;
                    System.out.println("le perimètre du carée est : "+ perimetre + "cm");
                }
            
    
    public static void surface(){
            int longeur;
            System.out.println("Entrez la longeur");
            Scanner sc = new Scanner(System.in);
                        longeur = sc.nextInt();
                        sc.close();
                int surface = longeur * 2;
                System.out.println("la surface du carée est : "+ surface + "cm²");
            }
        }

