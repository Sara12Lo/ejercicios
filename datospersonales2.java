/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datospersonales;

import java.util.Scanner;

public class datospersonales2 {

    public static void main(String[] args) {
        // Crear el objeto Scanner para entrada de datos
        Scanner sc = new Scanner(System.in);

        // Declarar variables
        String nombre;
        char sexo;
        int edad;
        double salario;
        boolean transporte;

        // Entrada de datos
        System.out.print("Digite su nombre: ");
        nombre = sc.nextLine();

        System.out.print("Digite su sexo (H, M): ");
        sexo = sc.next().charAt(0);

        System.out.print("Digite su edad: ");
        edad = sc.nextInt();

        System.out.print("Digite su salario (con centavos): ");
        salario = sc.nextDouble();

        System.out.print("¿Tiene vehículo? (1 = Sí, 0 = No): ");
        int tieneVehiculo = sc.nextInt();
        transporte = (tieneVehiculo == 1);

        // Salida de datos
        System.out.println();
        System.out.println("    Su nombre es : " + nombre);
        System.out.println("        Usted es : " + sexo);
        System.out.println("     Usted tiene : " + edad + " años");
        System.out.println("      Usted gana : " + salario + " pesos");
        System.out.println("¿Tiene vehículo? : " + (transporte ? "Sí" : "No"));
        System.out.println();

        sc.close();
    }
}
