package datospersonales;

public class constantedatospersonales {

    public static void main(String[] args) {
        System.out.println("Diseñe un algoritmo que muestre en pantalla su nombre, sexo, edad, ");
        System.out.println("salario (incluyendo centavos) y si tiene o no vehículo de transporte.");
        System.out.println();

        final String NOMBRE = "Albeiro Ramos";
        final char SEXO = 'H';
        final int EDAD = 40;
        final double SALARIO = 1356488.35;
        final boolean TRANSPORTE = true;

        System.out.println("    Su nombre es : " + NOMBRE);
        System.out.println("        Usted es : " + SEXO);
        System.out.println("     Usted Tiene : " + EDAD + " años");
        System.out.println("      Usted gana : " + SALARIO + " pesos");
        System.out.println("¿Tiene vehículo? : " + TRANSPORTE);
        System.out.println();
    }
}

