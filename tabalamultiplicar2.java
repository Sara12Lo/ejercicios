/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datospersonales;

/**
 *
 * @author leonc
 */import java.util.Scanner;
public class tabalamultiplicar2 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String volver;
        int res;

        do {
            
            System.out.print("\033[H\033[2J");
            System.out.flush();

            
            System.out.print("Diseñe un algoritmo que imprima todas ");
            System.out.println("las tablas de multiplicar (1-10).");

            System.out.println();
            for (int i = 1; i <= 10; i++) {
                for (int j = 1; j <= 10; j++) {
                    
                    res = i * j;
                    System.out.println(i + " x " + j + " = " + res);
                }
                System.out.println(); // Espacio entre tablas
            }

           
            System.out.println();
            System.out.print("Digite < s > para repetir. Para salir, cualquier tecla: ");
            volver = scanner.next();

        } while (volver.equals("s"));

        scanner.close();
    }
}

    

