/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datospersonales;

/**
 *
 * @author leonc
 */import java.util.Scanner;
public class tabllamultiplicacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String volver;
        int tabla, res;

        do {
            // Limpiar pantalla (no se puede hacer directamente en consola, pero se puede simular)
            System.out.print("\033[H\033[2J");
            System.out.flush();

            // Objetivo del Algoritmo
            System.out.print("Diseñe un algoritmo que Muestre en pantalla la tabla de ");
            System.out.println("multiplicar del número indicado por el usuario (del 1 al 10)");

            // Iniciar variables
            volver = "";
            tabla = 0;
            res = 0;

            // Entrada de Datos: Digitar el número de la tabla de multiplicar a visualizar
            System.out.println();
            System.out.print("Digite la tabla de multiplicar que desea visualizar: ");
            tabla = scanner.nextInt();

            // Proceso2: Se repite del 1 al 10
            System.out.println();
            for (int i = 1; i <= 10; i++) {
                // Proceso3: Calcula la tabla de multiplicar 
                res = i * tabla;
                // Salida de Datos: Muestra en pantalla la tabla de multiplicar
                System.out.println(tabla + " X " + i + " = " + res);
            }

            // Entrada de Datos: Volver al Menú
            System.out.println();
            System.out.print("Para repetir digite < s >, para salir cualquier tecla: ");
            volver = scanner.next();

        } while (volver.equals("s"));

        scanner.close();
    }
}
