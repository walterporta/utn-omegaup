package OmegaUp_tarea_3;
import java.util.Scanner;

public class CicloMientrasNoCero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int num;

        while(true){
            num = scanner.nextInt();
            if(num == 0){
                break;
            }
            suma += num;
        }
        scanner.close();
        System.out.println(suma);


    }

}
