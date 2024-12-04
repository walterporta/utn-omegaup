package Varios;

import java.util.Scanner;

public class Ejemplos {
    public static void main(String[] args) {
    
      Scanner scanner = new Scanner(System.in);

      // Agregaron variables

    //   int cantDiasVacaciones = scanner.nextInt();
    //   double prescupuetoMaximo = scanner.nextInt();
    //   int comidasViaje = scanner.nextInt();
    //   scanner.close();
    //   int presupuestoPorcomida = (int)(prescupuetoMaximo * 0.8) / comidasViaje;
    //   System.out.println("podes gastar por cada comida $ " + presupuestoPorcomida +  " durante los " + cantDiasVacaciones + " dias de viaje,") ;

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        scanner.close();

        System.out.println((float) x / y);
    




    }
}
