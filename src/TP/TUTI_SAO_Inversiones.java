
package TP;

import java.util.Scanner;

public class TUTI_SAO_Inversiones {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double C = scanner.nextDouble();
        int N = scanner.nextInt();

        int mejorAplicacion = -1;
        double maxInteres = -1;

        for (int i = 1; i <= N; i++) {
            double TNA = scanner.nextDouble();
            double MI = scanner.nextDouble();

            double interesDiario = calcularMayorInteresDiario(C, TNA, MI);

            if (interesDiario > maxInteres) {
                maxInteres = interesDiario;
                mejorAplicacion = i;
            }
        }

        System.out.println(mejorAplicacion);
        
        scanner.close();
    }

    public static double calcularMayorInteresDiario(double C, double TNA, double MI) {
        if (MI != -1 && C > MI) {
            return (TNA * MI) / 365;
        }
        return (TNA * C) / 365;
    }
}