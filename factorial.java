/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datospersonales;

/**
 *
 * @author leonc
 */ import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String volver;

        do {
            // Limpiar pantalla (no se puede hacer directamente en consola, pero se puede simular)
            System.out.print("\033[H\033[2J");
            System.out.flush();

            // Objetivo del Algoritmo
            System.out.print("Encuentre el factorial de un número del 0 al 12, ");
            System.out.println("si lo supera, el factorial es infinito.");

            // Iniciar Variables
            int factorial = 1;
            int cant;

            // Entrada de Datos: Solicitar el número factorial
            System.out.println();
            System.out.print("Ingrese el número factorial: ");
            cant = scanner.nextInt();

            // Proceso2: la cantidad es menor o igual a 12, entonces imprimir el factorial
            //          Si no, el factorial es infinito
            if (cant <= 12) {
                // Proceso3: Se repite hasta el número indicado por el usuario
                for (int i = 1; i <= cant; i++) {
                    // Proceso 3: Se calcula el número factorial
                    factorial *= i;
                }
                // Salida de Datos: Muestra en pantalla el factorial
                System.out.println();
                System.out.println("El factorial de " + cant + " es: " + factorial);
            } else {
                System.out.println();
                System.out.println("El factorial es infinito");
            }

            // Entrada de Datos: Volver al Menú
            System.out.println();
            System.out.print("Para repetir digite < s >, para salir cualquier tecla: ");
            volver = scanner.next();

        } while (volver.equals("s"));

        scanner.close();
    }
}

    

