package OmegaUp_tarea_1;
import java.util.Scanner;
public class SumaSimple
{
    public static void main(String[] args)
    {   int num1;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        num1 = entrada.nextInt();
        entrada.close(); 
        System.out.println("El numero ingresado + 1 es:" + (num1 + 1));
    }
}
