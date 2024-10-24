package OmegaUp_tarea_2;

import java.util.Scanner;

public class CalculosCondicionales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        int modificaciones = 0;

        if (N % 2 == 0) {
            N /= 2;
            modificaciones++;

        } else {
            N += 1;
            modificaciones++;

        }

        int numDigits = String.valueOf(N).length();

        if (numDigits >= 3) {
            N /= 100;
            modificaciones++;

        } else if (numDigits == 2) {
            N /= 10;
            modificaciones++;

        }

        if (N % 3 == 0) {
            N -= 1;
            modificaciones++;

        }

        System.out.println(N + " " + modificaciones);

    }
}