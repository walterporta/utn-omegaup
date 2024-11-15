package OmegaUp_tarea_3;
import java.util.Scanner;

public class LaSecuenciaInfinita {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numerosPredefinidos = {1, 2, 3, 4, 5, 4, 3, 2, 1, 2, 3, 4, 5, 4, 3, 2, 1, 2, 3, 4, 5};

        int n = sc.nextInt();
        sc.close();

        for (int i = 0; i < n && i < numerosPredefinidos.length; i++) {
            System.out.print(numerosPredefinidos[i] + " ");
        }
        System.out.println();
    }
}