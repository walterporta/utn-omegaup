package OmegaUp_tarea_3;

import java.util.Scanner;

public class SumaDeLosDigitos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        sc.close();

        int sumaInput = 0;

        while (input > 0) {
            sumaInput += input % 10;
            input /= 10;
        }

        System.out.println(sumaInput);

    }
}
