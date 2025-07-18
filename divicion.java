/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datospersonales;

/**
 *
 * @author leonc
 */import java.util.Scanner;
public class divicion {
     public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        
        double num1 = 0.0;
        double num2 = 0.0;
        double res = 0.0;

       
        System.out.print("Diseñe un algoritmo que solicite dos números y los division, como resultado ");
        System.out.println("debe mostrar en pantalla (La division del número A con el número B es: resultado).");
        System.out.println();

        
        System.out.print("Digite el primer número: ");
        num1 = sc.nextDouble();

        System.out.print("Digite el segundo número: ");
        num2 = sc.nextDouble();

     
        res = num1 / num2;

        
        System.out.println();
        System.out.println("La division del número " + num1 + " con el número " + num2 + " es: " + res);
        System.out.println();

        sc.close();
    }
}


