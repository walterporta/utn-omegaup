package OmegaUp_tarea_1;
import java.util.Scanner;

public class LaHoraEnUnPlanetaLejano {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int S = scanner.nextInt();

        scanner.close();

        int segundosPorMinuto = 50;
        int minutosPorHora = 70;
        int horasPorDia = 12;

        int segundosPorDia = horasPorDia * minutosPorHora * segundosPorMinuto;
        int segundosPorHora = minutosPorHora * segundosPorMinuto;

        int dias = S / segundosPorDia;
        S %= segundosPorDia;

        int horas = S / segundosPorHora;
        S %= segundosPorHora;

        int minutos = S / segundosPorMinuto;

        int segundos = S % segundosPorMinuto;

        System.out.printf("%d %d %d %d\n", dias, horas, minutos, segundos);
    }
}
