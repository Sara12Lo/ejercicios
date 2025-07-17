/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datospersonales;

/**
 *
 * @author leonc
 */ import java.util.Scanner;
public class areayperimetro {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int menu = 0;
        double ladoA = 0.0, ladoB = 0.0, ladoC = 0.0, radio = 0.0;
        double area = 0.0, perimetro = 0.0;

        System.out.println("Diseñe un algoritmo que muestre un menú para la selección (1. Triángulo, 2. Rectángulo y 3. Círculo); ");
        System.out.println("Luego pida los datos necesarios para la solución y muestre en pantalla el nombre de la figura, su área ");
        System.out.println("en unidades cuadradas y su perímetro en unidades simples.");
        System.out.println("Recuerde que no existen áreas o perímetros menores o iguales a cero.\n");

        // Mostrar Menú
        System.out.println("---------- MENÚ ----------");
        System.out.println("1. Triángulo");
        System.out.println("2. Rectángulo");
        System.out.println("3. Círculo");
        System.out.print("Seleccione una opción del menú: ");
        menu = scanner.nextInt();

        switch (menu) {
            case 1:
                System.out.println("\n-------------- Triángulo ------------------");

                // Base
                System.out.print("Digite la base: ");
                ladoA = scanner.nextDouble();
                while (ladoA <= 0) {
                    System.out.println("\nLa base debe ser mayor que 0.");
                    System.out.print("Digite nuevamente la base: ");
                    ladoA = scanner.nextDouble();
                }

                // Altura
                System.out.print("Digite la altura: ");
                ladoB = scanner.nextDouble();
                while (ladoB <= 0) {
                    System.out.println("\nLa altura debe ser mayor que 0.");
                    System.out.print("Digite nuevamente la altura: ");
                    ladoB = scanner.nextDouble();
                }

                // Área y perímetro del triángulo rectángulo
                area = (ladoA * ladoB) / 2;
                ladoC = Math.sqrt(Math.pow(ladoA, 2) + Math.pow(ladoB, 2));
                perimetro = ladoA + ladoB + ladoC;

                // Resultados
                System.out.println("\nLa Figura es un:   Triángulo");
                System.out.println("Su área es:        " + area + " metros cuadrados");
                System.out.println("Su perímetro es:   " + perimetro + " metros");
                break;

            case 2:
                System.out.println("\n-------------- Rectángulo ------------------");

                System.out.print("Digite el lado A: ");
                ladoA = scanner.nextDouble();
                System.out.print("Digite el lado B: ");
                ladoB = scanner.nextDouble();

                while (ladoA <= 0 || ladoB <= 0) {
                    System.out.println("\nLos lados deben ser mayores que 0.");
                    System.out.print("Digite nuevamente el lado A: ");
                    ladoA = scanner.nextDouble();
                    System.out.print("Digite nuevamente el lado B: ");
                    ladoB = scanner.nextDouble();
                }

                area = ladoA * ladoB;
                perimetro = 2 * (ladoA + ladoB);

                System.out.println("\nLa Figura es un:   Rectángulo");
                System.out.println("Su área es:        " + area + " metros cuadrados");
                System.out.println("Su perímetro es:   " + perimetro + " metros");
                break;

            case 3:
                System.out.println("\n-------------- Círculo ------------------");

                System.out.print("Digite el radio: ");
                radio = scanner.nextDouble();

                while (radio <= 0) {
                    System.out.println("\nEl radio debe ser mayor que 0.");
                    System.out.print("Digite nuevamente el radio: ");
                    radio = scanner.nextDouble();
                }

                area = Math.PI * Math.pow(radio, 2);
                perimetro = 2 * Math.PI * radio;

                System.out.println("\nLa Figura es un:        Círculo");
                System.out.println("Su área es:             " + area + " metros cuadrados");
                System.out.println("Su circunferencia es:   " + perimetro + " metros");
                break;

            default:
                System.out.println("\nLa opción del menú no existe.");
        }

        scanner.close();
    }
}
    
