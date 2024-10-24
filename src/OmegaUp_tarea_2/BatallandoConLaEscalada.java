package OmegaUp_tarea_2;
import java.util.Scanner;

public class BatallandoConLaEscalada {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        sc.close();

        if ( a < b && b < c){
            System.out.println("ascenso");
        } else if ( a > b && b > c){
            System.out.println("descenso");
        } else if (a < b && b > c){
            System.out.println("pico");
        }else if (a>b && b < c){
            System.out.println("abismo");}




    }

}
