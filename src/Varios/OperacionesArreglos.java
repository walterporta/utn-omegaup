package Varios;
import java.util.Random;

public class OperacionesArreglos {


    static int tamLogico = 10;
    static final int N = 100;
    static int[] A = new int[N];


    public static void main(String[] args) {

        // int tamLogico = N;


        System.out.println("Inicializando el arreglo...");
        cargarArreglo(A);

        System.out.println("Imprimir arrelgo...");
        imprimirArreglo(A);

          
      

        System.out.print("Inserta al final: ");
        insertarFinal(A, 99);
        imprimirArreglo(A);


        System.out.print("Inserta al principio: ");
        insertarAlPrincipio(A, 88);
        imprimirArreglo(A);


        // System.out.print("Inserta en posicion: ");
        // insertarEnPosicion(A, 66, 3) ;
        // imprimirArreglo(A);


    }


   

    private static void cargarArreglo(int[] A) {
        Random rd = new Random();
        for (int i = 0; i < tamLogico; i++) {
            A[i] = rd.nextInt(150);
        }
    }


    private static void imprimirArreglo(int[] A) {   
       for (int i = 0; i < tamLogico; i++) {
            System.out.println(" A[" + i + "]: " + A[i]);  
        };
   }

   private static int insertarFinal(int[] A, int i ){
    if (tamLogico < N ) {
        A[tamLogico] = i;
        tamLogico++;  
        return i;
    } else {
        return 0;
    }
}


    private static int insertarAlPrincipio(int[] A, int i ){
        if (tamLogico < N ) {
            for (int j = tamLogico; j > 0; j--) {
                A[j] = A[j-1];
            }
            A[0] = i;
            tamLogico++;  
            return i;
        } else {
            return 0;
        }
    }

    private static void insertarEnPosicion(int[] arreglo, int pos, int valor) {
        if (pos >= 0 && pos <= tamLogico && tamLogico < N) {
            for (int i = tamLogico; i > pos; i--) {
                arreglo[i] = arreglo[i - 1];
            }
            arreglo[pos] = valor;
            tamLogico++;
        }
    }

    private static void eliminar( int[] arreglo, int pos) {
        if (tamLogico > 0) {
            tamLogico--;
        }
    }


// private static void mostrarArreglo(int[] arreglo) {
//     System.out.print("[ ");
//     for (int i = 0; i < tope; i++) {
//         System.out.print(arreglo[i] + " ");
//     }
//     System.out.println("]");
// }



}