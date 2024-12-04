package Varios;
import java.util.Random;

public class OperacionesArreglos {
    public static void main(String[] args) {

        final int N = 100;
        int[] A = new int[N];
        int tamLogico = N;


        System.out.println("Inicializando el arreglo...");
        cargarArreglo(A, tamLogico);

        System.out.println("Imprimir arrelgo...");
        imprimirArreglo(A, tamLogico);

          
         //System.out.println (mayor(A, i, i0);); 
        // System.out.println (mayorArreglo(A, pocicion1, tamLogico);); 


    }


    // private static int mayor(int[] A, int i, int i0) {
    //     if (i == i0) {
    //         return A[i];
    //     } else {
    //         return Math.max(A[i], mayor(A, i + 1, i0));
    //     }
    // }


    private static void cargarArreglo(int[] A, int tamLogico) {
        Random rd = new Random();
        for (int i = 0; i < tamLogico; i++) {
            A[i] = rd.nextInt(150);
        }
    }


    private static void imprimirArreglo(int[] A, int tamLogico) {   
       for (int i = 0; i < tamLogico; i++) {
            System.out.println(" A[" + i + "]: " + A[i]);    };
    
    
}

}