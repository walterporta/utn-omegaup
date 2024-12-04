package Varios;

import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {

        java.util.Random rnd = new Random();
        //Ramdon rnd = new Random(100);

        System.out.println("rnd.nextInt() = " + rnd.nextInt());
        System.out.println("rnd.nextInt(10) = " + rnd.nextInt(10));
        System.out.println("rnd.nextDouble() = " + rnd.nextDouble());

    }

}
