package OmegaUp_tarea_3;
import java.util.Scanner;
import static java.lang.Math.abs;

public class LaSecuenciaInfinita {
  
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

    //     int n = sc.nextInt();
    //     sc.close();

    //     for (int i = 0; i < n; i++) {
    //         System.out.print(generarNumero(i) + " ");
    //     }
    // }

    // public static int generarNumero(int i) {
    //     int[] patron = {1, 2, 3, 4, 5, 4, 3, 2, 1};
    //     return patron[i % patron.length];
    // }

    public static void main(String[] args) {
        int entrada, secuencia, i;
        Scanner scan = new Scanner(System.in);
        scan.close();
        entrada = scan.nextInt();
            for (i = 0; i < entrada; i++) {
                secuencia = 5 - abs(4 - (i % 8));
                System.out.print(secuencia + " ");
            }

    }

}