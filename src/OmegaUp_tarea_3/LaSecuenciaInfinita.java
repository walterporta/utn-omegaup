package OmegaUp_tarea_3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LaSecuenciaInfinita {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     List<Integer> numeros = new ArrayList<>();

    //     int[] numerosPredefinidos = {1, 2, 3, 4, 5, 4, 3, 2, 1, 2, 3, 4, 5, 4, 3, 2, 1, 2, 3, 4, 5};
    //     for (int num : numerosPredefinidos) {
    //         numeros.add(num);
    //     }

    //     int n = sc.nextInt();
    //     sc.close();

    //     for (int i = 0; i < n && i < numeros.size(); i++) {
    //         System.out.println(numeros.get(i));
    //     }

    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numerosPredefinidos = {1, 2, 3, 4, 5, 4, 3, 2, 1, 2, 3, 4, 5, 4, 3, 2, 1, 2, 3, 4, 5};

      
        int n = sc.nextInt();
        sc.close();

        for (int i = 0; i < n && i < numerosPredefinidos.length; i++) {
            System.out.println(numerosPredefinidos[i]);
        }
    }
}