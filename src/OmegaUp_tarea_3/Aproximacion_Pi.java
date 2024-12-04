package OmegaUp_tarea_3;
import java.util.Scanner;

public class Aproximacion_Pi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double pi = 0;
        int n = scanner.nextInt();
        scanner.close();
        
        for (int i = 0; i < n; i++) {
            pi += Math.pow(-1, i) / (2 * i + 1);
        }
        pi *= 4;
        System.out.printf("%.8f%n", pi);
    }

}
