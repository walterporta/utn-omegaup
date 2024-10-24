package Ejercicios_01;
import java.util.Scanner;

public class Pregunta_01 {

    public static void main(String[] args) {

      Scanner entrada = new Scanner(System.in);
      System.out.print("Ingrese la valoracion de la pelicula:  ");
      int puntuajePeli = entrada.nextInt();

      switch (puntuajePeli) {
        case 0: 
            System.out.println("Calificaste la pelicula como MUY MALA. Lo lamenentamos mucho ");        
            break;        
        case 1:
            System.out.println("Calificaste la pelicula como MALA. Lo lamentamos ");        
            break;        
        case 2:
            System.out.println("Calificaste la pelicula como MEDIOCRE. Lo recomendamos ");        
            break;        
        case 3:
            System.out.println("Calificaste la pelicula como BUENA. Lo recomendamos ");        
            break;        
        case 4:
            System.out.println("Calificaste la pelicula como MUY BUENA. Lo recomendamos ");        
            break;        
        default:
            System.out.println("La calificacion debe estar entre 0 y 4");
            break;
            
      }

    }

}
