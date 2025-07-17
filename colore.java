/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datospersonales;

/**
 *
 * @author leonc
 */import java.util.Scanner;
public class colore {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Declarar variables
        int color1 = 0;
        int color2 = 0;
        String resultado = "";

        // Objetivo del Algoritmo
        System.out.print("Diseñe un algoritmo que muestre un menú: Amarillo = 1, azul = 2, rojo = 3. ");
        System.out.print("Luego solicite al usuario digitar dos de estos números para descifrar la combinación. ");
        System.out.print("Ejemplo: 1 y 3, el resultado mostrado en pantalla (su combinación es naranja). ");
        System.out.println("Recuerde que el usuario puede colocar el mismo número dos veces y números fuera del rango.");
        System.out.println();

        // Menú
        System.out.println("----- MENU -----");
        System.out.println("1. Amarillo");
        System.out.println("2. Azul");
        System.out.println("3. Rojo");
        System.out.println();

        // Entrada de datos
        System.out.print("Seleccione el primer número de color: ");
        color1 = sc.nextInt();
        System.out.print("Seleccione el segundo número de color: ");
        color2 = sc.nextInt();

        // Validar que los colores estén en el rango
        if ((color1 >= 1 && color1 <= 3) && (color2 >= 1 && color2 <= 3)) {
            if (color1 != color2) {
                if ((color1 == 1 && color2 == 2) || (color1 == 2 && color2 == 1)) {
                    resultado = "Verde";
                }
                if ((color1 == 1 && color2 == 3) || (color1 == 3 && color2 == 1)) {
                    resultado = "Naranja";
                }
                if ((color1 == 2 && color2 == 3) || (color1 == 3 && color2 == 2)) {
                    resultado = "Violeta";
                }
            } else {
                if (color1 == 1) {
                    resultado = "Amarillo";
                }
                if (color1 == 2) {
                    resultado = "Azul";
                }
                if (color1 == 3) {
                    resultado = "Rojo";
                }
                resultado += ". Seleccionó el mismo color.";
            }

            // Mostrar resultado
            System.out.println();
            System.out.println("El color es: " + resultado);
        } else {
            System.out.println();
            System.out.println("En el Menú no existe el color.");
        }

        System.out.println();
        sc.close();
    }
}

