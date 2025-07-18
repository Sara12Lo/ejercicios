/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datospersonales;

/**
 *
 * @author leonc
 */import java.util.Scanner;
public class fibonacci {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String volver;
        
        do {
            
            System.out.print("\033[H\033[2J");
            System.out.flush();
            
          
            System.out.print("Diseñe un algoritmo que solicite la cantidad de números ");
            System.out.println("que se desea ver de la serie de Fibonacci (sucesión de Fibonacci).");

         
            int anterior = 0;
            int posterior = 1;
            int acum;
            int cant;
            
            System.out.println();
            System.out.print("Ingrese la cantidad de números de la serie Fibonacci: ");
            cant = scanner.nextInt();


            System.out.println();
            for (int i = 0; i < cant; i++) {
             
                System.out.print(anterior + " ");
              
                acum = anterior + posterior;
                posterior = anterior;
                anterior = acum;
            }

       
            System.out.println();
            System.out.print("Para repetir digite < s >, para salir cualquier tecla: ");
            volver = scanner.next();

        } while (volver.equals("s"));

        scanner.close();
    }
}

       
