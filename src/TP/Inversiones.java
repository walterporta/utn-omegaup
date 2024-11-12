package TP;

import java.util.Scanner;

public class Inversiones {

    // Función para calcular el interés diario
    public static double calcularInteresDiario(double tna, double importe) {
        return (tna * importe) / 365;
    }

    public static int mejorAplicacion(double importe, int cantidadAplicaciones, double[] tnas, double[] maximos) {
        double maxInteres = 0;
        int mejorOpcion = -1;

        for (int i = 0; i < cantidadAplicaciones; i++) {
            double maximoInversion = maximos[i];
            double tna = tnas[i];

            double importeAInvertir;
            if (maximoInversion == -1) {
                // Sin límite de inversión, usa el importe completo
                importeAInvertir = importe;
            } else if (importe > maximoInversion) {
                // La inversión excede el máximo permitido, descarta esta opción
                continue;
            } else {
                importeAInvertir = importe;
            }

            double interesDiario = calcularInteresDiario(tna, importeAInvertir);

            if (interesDiario > maxInteres) {
                maxInteres = interesDiario;
                mejorOpcion = i + 1; // +1 porque los índices de aplicaciones comienzan en 1
            }
        }

        return mejorOpcion;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada
        System.out.print("Ingrese el importe a invertir: ");
        double importe = scanner.nextDouble();
        
        System.out.print("Ingrese la cantidad de aplicaciones a evaluar: ");
        int cantidadAplicaciones = scanner.nextInt();

        double[] tnas = new double[cantidadAplicaciones];
        double[] maximos = new double[cantidadAplicaciones];

        for (int i = 0; i < cantidadAplicaciones; i++) {
            System.out.print("Ingrese la TNA de la aplicación " + (i + 1) + ": ");
            tnas[i] = scanner.nextDouble();
            
            System.out.print("Ingrese el monto máximo de inversión de la aplicación " + (i + 1) + " (o -1 si no tiene tope): ");
            maximos[i] = scanner.nextDouble();
        }

        // Procesamiento
        int mejorOpcion = mejorAplicacion(importe, cantidadAplicaciones, tnas, maximos);

        // Salida
        System.out.println("La mejor aplicación para invertir es la número: " + mejorOpcion);
        
        scanner.close();
    }
}
