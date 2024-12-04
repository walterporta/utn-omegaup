package Varios;
import java.util.Random;
import java.util.Scanner;

public class DobleNada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // int intento = random.nextInt(2);
        // int valorInicial = scanner.nextInt();
        // int tiadasMAximas = 50;
        // int valorMinimo= 1;
        // int tiradas = 0;

        double dineroApuesta;
        int cantidadTiradas = 1;
        dineroApuesta  = scanner.nextDouble();

        while (dineroApuesta > 1 && cantidadTiradas <= 50) {
            String resultadoTirar = tirarMoneda();
            if(resultadoTirar == "Cara") {
                dineroApuesta *= 2.0;


            }else{ dineroApuesta /= 2.0;
            }
            cantidadTiradas++;

            System.out.println("Tirada: " + cantidadTiradas + " Resultado " + resultadoTirar + " Dinero: " + dineroApuesta);

        }
       
     
       
    }

    public static String tirarMoneda (){
        Random rnd = new Random();
        if (rnd.nextBoolean()){
            return "Cara";
        }else{
            return "Cruz";
        }
    };

}
