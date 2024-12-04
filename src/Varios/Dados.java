package Varios;
import java.util.Random;

public class Dados {
    public static void main(String[] args) {
        
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            System.out.println("Dado " + (i + 1) + ": " + (random.nextInt(6) + 1));
        }

    }

}
