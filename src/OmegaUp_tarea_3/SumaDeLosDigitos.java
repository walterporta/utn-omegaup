package OmegaUp_tarea_3;
import java.util.Scanner;

public class SumaDeLosDigitos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        sc.close();

        int sumaInput= 0;
        String inputString = Integer.toString(input);
        
        
        for (int i = 0; i < inputString.length(); i++) {
            sumaInput += Character.getNumericValue(inputString.charAt(i));
        }
        
        System.out.println(sumaInput);
        
    }
}
