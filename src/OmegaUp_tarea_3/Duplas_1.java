package OmegaUp_tarea_3;
import java.util.Scanner;

public class Duplas_1 {
    public static void main(String[] args) {
        int x, y , difencia, diferenciaMinima, contadorDuplasPares = 0;
        Scanner scanner = new Scanner(System.in);
        
        x = scanner.nextInt();
        y = scanner.nextInt();

        diferenciaMinima = Math.abs(x - y);

        if (x % 2 == 0 && y % 2 == 0) contadorDuplasPares++;

        x = scanner.nextInt();

        while (x != -1) {
            y = scanner.nextInt();
            difencia = Math.abs(x - y);

            if (difencia < diferenciaMinima) diferenciaMinima = difencia;

            if (x % 2 == 0 && y % 2 == 0) contadorDuplasPares++;

            x = scanner.nextInt();
        }
        scanner.close();
        
        System.out.println(contadorDuplasPares);
        System.out.println(diferenciaMinima);
        
        


    
    
    }
}
