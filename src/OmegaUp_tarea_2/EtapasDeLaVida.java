package OmegaUp_tarea_2;

import java.util.Scanner;

public class EtapasDeLaVida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        sc.close();

        if (L >= 0 && L <= 3) {
            System.out.println("BEBE");
        } else if (L >= 4 && L <= 14) {
            System.out.println("NINO");
        } else if (L >= 15 && L <= 18) {
            System.out.println("JOVEN");
        } else if (L >= 19 && L <= 65) {
            System.out.println("ADULTO");
        } else if (L >= 66) {
            System.out.println("ADULTO 3RA");
        }

    }
}
