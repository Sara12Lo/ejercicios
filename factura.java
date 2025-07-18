/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datospersonales;

/**
 *
 * @author leonc
 */import java.util.Scanner;
public class factura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String volver, otroPrd;
        String[] encabezado = new String[8];
        String[][] factura = new String[20][8];
        int i = 0, cant = 0;
        double IVA = 0.19, ivaAcm = 0.0, total = 0.0;

        // Inicializar encabezado
        encabezado[0] = "Item        |";
        encabezado[1] = "nombre      |";
        encabezado[2] = "precio      |";
        encabezado[3] = "cantidad    |";
        encabezado[4] = "canst (s/n) |";
        encabezado[5] = "IvaProd     |";
        encabezado[6] = "Parcial     |";
        encabezado[7] = "SubTotal    |";

        do {
            // Variables para cada producto
            double ivaParc, totalParc, subtotal;

            do {
                ivaParc = 0.0;
                totalParc = 0.0;
                subtotal = 0.0;

                // Introducir datos del producto
                System.out.println();
                for (int j = 0; j < 8; j++) {
                    if (j == 0) {
                        factura[i][j] = String.valueOf(i + 1);
                    } else if (j > 0 && j < 5) {
                        System.out.print("[" + i + "," + j + "]. " + encabezado[j] + ": ");
                        factura[i][j] = scanner.nextLine();
                    }

                    // Calcular IVA y subtotal
                    if (j == 5) {
                        subtotal = Double.parseDouble(factura[i][2]) * Double.parseDouble(factura[i][3]);
                        if (!factura[i][4].equals("s")) {
                            ivaParc = subtotal * IVA;
                            factura[i][5] = String.valueOf(ivaParc);
                            factura[i][4] = "19 %";
                        } else {
                            factura[i][5] = "0";
                            factura[i][4] = " 0 %";
                        }
                        ivaAcm += Double.parseDouble(factura[i][5]);
                    }

                    // Calcular total parcial
                    if (j == 6) {
                        totalParc = subtotal - ivaParc;
                        factura[i][6] = String.valueOf(totalParc);
                        total += totalParc;
                    }

                    // Almacenar subtotal
                    if (j == 7) {
                        factura[i][7] = String.valueOf(subtotal);
                    }
                }

                // Mostrar resultados del producto
                System.out.println("      IVA Producto |: > " + ivaParc);
                System.out.println("     Total Parcial |: > " + totalParc);
                System.out.println(" Subtotal Producto |: > " + subtotal);
                System.out.println();
                System.out.println("         Total IVA |: > " + ivaAcm);
                System.out.println("   SubTotal Compra |: > " + total);
                System.out.println("     Total a Pagar |: > " + (total + ivaAcm));
                System.out.println();

                // Preguntar si desea agregar otro producto
                System.out.print("¿Desea agregar otro articulo? ( s / n ) ");
                otroPrd = scanner.nextLine();
                if (otroPrd.equals("s")) {
                    cant++;
                }

                i++;
                cant = i;

            } while (i == cant);

            // Imprimir encabezado
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------|");
            for (String s : encabezado) {
                System.out.print("     " + s);
            }
            System.out.println();
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------|");

            // Imprimir productos
            for (int j = 0; j < i; j++) {
                for (int k = 0; k < 8; k++) {
                    System.out.print("     " + factura[j][k]);
                }
                System.out.println();
            }

            // Imprimir totales
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------|");
            System.out.println();
            System.out.println("                                                                                                                   Total IVA :     " + ivaAcm);
            System.out.println("                                                                                                             SubTotal Compra :     " + total);
            System.out.println("                                                                                                               Total a Pagar :     " + (total + ivaAcm));
            System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------|");

            // Preguntar si desea repetir el programa
            System.out.print("Para repetir digite < s >, para salir cualquier tecla: ");
            volver = scanner.nextLine();

        } while (volver.equals("s"));

        scanner.close();
    }
}
