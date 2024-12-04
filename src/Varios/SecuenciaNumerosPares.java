package Varios;
import java.util.Scanner;

public class SecuenciaNumerosPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        scanner.close();

        if(esMultiplo(n1, n2)){
            System.out.println(n1+n2);
        } else {
            System.out.println(potencia(n1, n2));

        }

       
    
    
    
    }

    public static boolean esMultiplo(int a, int b){
        return a % b == 0;
    }


    public static double potencia(int a, int b){
        return Math.pow(a, b);
    }

}
