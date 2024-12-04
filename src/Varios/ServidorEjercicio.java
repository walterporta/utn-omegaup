package Varios;


 import java.util.Scanner;
 
 public class ServidorEjercicio {
 
     // Dimensiones de la matriz como constantes
     public static final int FILAS = 5;
     public static final int COLUMNAS = 5;
 
     public static void main(String[] args) {
         // Matriz predefinida
         int[][] correo = {
             {10, 20, 30, 40, 50},
             {5, 15, 25, 35, 45},
             {2, 4, 6, 8, 10},
             {12, 24, 36, 48, 60},
             {7, 14, 21, 28, 35}
         };
 
         // Mostrar la matriz
         System.out.println("Matriz de tráfico de correo (5x5):");
         for (int i = 0; i < FILAS; i++) {
             for (int j = 0; j < COLUMNAS; j++) {
                 System.out.print(correo[i][j] + "\t");
             }
             System.out.println();
         }
 
         // a) Total de correo enviado por cada servidor
         System.out.println("\nTotal de correo enviado por cada servidor:");
         calcularTotalEnviado(correo);
 
         // b) Servidor que ha enviado mayor cantidad de kb
         int servidorMayor = servidorMasEnvio(correo); // Cálculo basado en la matriz
         System.out.println("\nServidor que ha enviado más correo: Servidor " + servidorMayor);
 
         // c) Servidores que recibieron correo por encima de una cota M
         Scanner scanner = new Scanner(System.in);
         System.out.print("\nIngrese la cota M para filtrar los servidores que recibieron más correo: ");
         int cotaM = scanner.nextInt();
         mostrarServidoresRecibieronMasDeM(correo, cotaM);
 
         scanner.close();
     }
 
     // Función para calcular e imprimir el total de correos enviados por cada servidor
     public static void calcularTotalEnviado(int[][] correo) {
         for (int i = 0; i < FILAS; i++) {
             int totalEnviado = 0; // Inicializa el contador para cada servidor
             for (int j = 0; j < COLUMNAS; j++) {
                 totalEnviado += correo[i][j]; // Suma los correos enviados por el servidor i
             }
             // Muestra el total de correos enviados por el servidor i
             System.out.println("Servidor " + i + ": " + totalEnviado + " kb");
         }
     }
 
     // Función para encontrar el servidor que más correos envió
     public static int servidorMasEnvio(int[][] correo) {
         int maxEnvio = 0; // Máxima cantidad de correos enviados
         int servidor = 0; // Índice del servidor que envió más
         for (int i = 0; i < FILAS; i++) {
             int totalEnviado = 0;
             for (int j = 0; j < COLUMNAS; j++) {
                 totalEnviado += correo[i][j];
             }
             if (totalEnviado > maxEnvio) {
                 maxEnvio = totalEnviado;
                 servidor = i;
             }
         }
         return servidor;
     }
 
     // Función para mostrar servidores que recibieron más correo de lo establecido por la cota M
     public static void mostrarServidoresRecibieronMasDeM(int[][] correo, int cotaM) {
         System.out.println("\nServidores que recibieron más de " + cotaM + " kb:");
         for (int j = 0; j < COLUMNAS; j++) {
             int totalRecibido = 0;
             for (int i = 0; i < FILAS; i++) {
                 totalRecibido += correo[i][j];
             }
             if (totalRecibido > cotaM) {
                 System.out.println("Servidor " + j + ": " + totalRecibido + " kb");
             }
         }
     }
 }
 