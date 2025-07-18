/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datospersonales;

/**
 *
 * @author leonc
 */
import java.util.Scanner;
public class triangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char volver;

        do {
            // Declarar variables
            int menu;
            double angA = 0, angB = 0, angC = 0;
            double ladoA = 0, ladoB = 0, ladoC = 0;

            // Mostrar objetivo del programa
            System.out.println("\nDiseñe un algoritmo que encuentre el tipo de triángulo que se tiene.");
            System.out.println("El usuario debe seleccionar si ingresará ángulos o lados.");
            System.out.println("Si se ingresan ángulos, deben sumar 180°.");
            System.out.println("Si se ingresan lados, la suma de los lados más cortos debe ser mayor al más largo.");
            System.out.println("No se aceptan valores menores o iguales a cero.");

            // Mostrar menú
            System.out.println("\n---------- MENU ----------");
            System.out.println("1. Ángulos");
            System.out.println("2. Lados");
            System.out.print("Seleccione una opción del menú: ");
            menu = entrada.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("\n-------------- Triángulo por Ángulos ------------------");

                    // Validación de entrada
                    do {
                        System.out.println("\nRecuerde que los ángulos deben ser mayores a 0");
                        System.out.print("Digite el ángulo A: ");
                        angA = entrada.nextDouble();
                        System.out.print("Digite el ángulo B: ");
                        angB = entrada.nextDouble();
                    } while (angA <= 0 || angB <= 0);

                    angC = 180 - (angA + angB);

                    if (angC > 0) {
                        if (angA == 90 || angB == 90 || angC == 90) {
                            System.out.println("Es un triángulo: RECTÁNGULO");
                        } else if (angA > 90 || angB > 90 || angC > 90) {
                            System.out.println("Es un triángulo: OBTUSÁNGULO");
                        } else {
                            System.out.println("Es un triángulo: ACUTÁNGULO");
                        }
                    } else {
                        System.out.println("Ángulos Incorrectos. La suma debe ser 180° y todos deben ser mayores a 0.");
                    }
                    break;

                case 2:
                    System.out.println("\n-------------- Triángulo por Lados ------------------");

                    // Validación de entrada
                    do {
                        System.out.println("\nRecuerde que los lados deben ser mayores a 0");
                        System.out.print("Digite el lado A: ");
                        ladoA = entrada.nextDouble();
                        System.out.print("Digite el lado B: ");
                        ladoB = entrada.nextDouble();
                        System.out.print("Digite el lado C: ");
                        ladoC = entrada.nextDouble();
                    } while (ladoA <= 0 || ladoB <= 0 || ladoC <= 0);

                    if (ladoA < ladoB + ladoC && ladoB < ladoA + ladoC && ladoC < ladoA + ladoB) {
                        if (ladoA == ladoB && ladoB == ladoC) {
                            System.out.println("Es un triángulo: EQUILÁTERO");
                        } else if (ladoA == ladoB || ladoB == ladoC || ladoC == ladoA) {
                            System.out.println("Es un triángulo: ISÓSCELES");
                        } else {
                            System.out.println("Es un triángulo: ESCALENO");
                        }
                    } else {
                        System.out.println("Lados Incorrectos. No forman un triángulo válido.");
                    }
                    break;

                default:
                    System.out.println("La opción del menú no existe.");
                    break;
            }

            // Preguntar si desea repetir
            System.out.print("\nPara repetir digite < s >, para salir cualquier otra tecla: ");
            volver = entrada.next().toLowerCase().charAt(0);

        } while (volver == 's');

        System.out.println("\nGracias por usar el programa.");
    }
}
