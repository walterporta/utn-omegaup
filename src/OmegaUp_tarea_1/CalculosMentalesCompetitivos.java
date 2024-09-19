package OmegaUp_tarea_1;
import java.util.Scanner;

public class CalculosMentalesCompetitivos  {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double R = entrada.nextDouble();

        entrada.close();

        double resultado1 = R + 5;

        double resultado2 = Math.pow(resultado1, 2);

        double resultado3 = resultado2 / (R / 3);

        double resultado4 = Math.pow(resultado3, 3);

        System.out.printf("%.6f %.6f %.6f %.6f %.6f\n", R, resultado1, resultado2, resultado3, resultado4);
    }
}
