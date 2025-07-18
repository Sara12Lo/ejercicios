/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datospersonales;

/**
 *
 * @author leonc
 */import java.util.Scanner;
public class cilindro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char volver;

        do {
            // Limpiar variables
            double radio = 0.0;
            double altura = 0.0;
            double area;
            double perimetro;
            double volumen;

            System.out.println("Diseñe un algoritmo que encuentre el área y perímetro del material");
            System.out.println("necesario para construir un cilindro con tapa, también qué volumen");
            System.out.println("ocupará, con sus respectivas unidades y restricciones");

            // Validación de entrada: radio y altura mayores a 0
            do {
                System.out.println("\nRecuerde que el radio de la tapa y la altura no pueden ser menores o iguales a 0");

                System.out.print("Digite el radio: ");
                radio = entrada.nextDouble();

                System.out.print("Digite la altura: ");
                altura = entrada.nextDouble();

            } while (radio <= 0 || altura <= 0);

            // Calcular perímetro de la base (circunferencia)
            double circunferencia = 2 * Math.PI * radio;

            // Calcular área de las dos bases circulares
            area = 2 * (Math.PI * Math.pow(radio, 2));

            // Calcular área lateral (rectángulo)
            area += circunferencia * altura;

            // Calcular perímetro exterior total (según lógica original)
            perimetro = (4 * circunferencia) + (2 * altura);

            // Calcular volumen
            volumen = Math.PI * Math.pow(radio, 2) * altura;

            // Mostrar resultados
            System.out.println("\nLa figura es un:   Cilindro");
            System.out.printf("Su perímetro es:   %.2f metros\n", perimetro);
            System.out.printf("Su área es:        %.2f metros cuadrados\n", area);
            System.out.printf("Su volumen es:     %.2f metros cúbicos\n", volumen);

            // Preguntar si desea repetir
            System.out.print("\nPara repetir digite < s >, para salir cualquier otra tecla: ");
            volver = entrada.next().toLowerCase().charAt(0);

        } while (volver == 's');

        System.out.println("\nGracias por usar el programa.");
    }
    }

    