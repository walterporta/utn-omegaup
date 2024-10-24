package OmegaUp_tarea_2;
import java.util.Scanner;

public class TomaDeDecisiones {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();

        if (A + B == 5) {
            B += 3;  
            System.out.println(2 * A + B);  
        } 
        
        else if ((7 * (A-=1) + B) % 2 == 0) {
            System.out.println(A - B); 
        } 
        else {
            System.out.println(A * B);
        }
    }
}
