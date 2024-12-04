package Varios;
import java.util.Scanner;

public class ModularMultiplicarProducto {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        scanner.close();


        System.out.println("multiplicar a x v" + multiplicar(a, b));
        
        
        
    }
    public static int multiplicar(int a, int b) {
        return a * b;
    }
}
