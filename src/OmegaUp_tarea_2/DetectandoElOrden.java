package OmegaUp_tarea_2;
import java.util.Scanner;

public class DetectandoElOrden {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if (A == B && B == C) {
            System.out.println("I");
        } else if (A <= B && B <= C) {
            System.out.println("C");
        } else if (A >= B && B >= C) {
            System.out.println("D");
        } else {
            System.out.println("x");
        }

        sc.close();
    }
}
