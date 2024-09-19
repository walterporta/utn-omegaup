package OmegaUp_tarea_1;
import java.util.Scanner;

public class ProgramandoFormulasRaras {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double x = entrada.nextDouble();
        double y = entrada.nextDouble();
        double z = entrada.nextDouble();

        entrada.close();

        double pi = Math.PI;

        double resultado = (x + x * (y + Math.pow(z, 2))) / ((x + pi) * (y + pi));

        System.out.printf("%.6f\n", resultado);
    }
}