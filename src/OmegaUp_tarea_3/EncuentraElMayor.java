package OmegaUp_tarea_3;

import java.util.Scanner;

public class EncuentraElMayor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N, num, mayor=0;

        N = sc.nextInt();

        for(int i=0; i<N; i++) {
            num = sc.nextInt();
            if(num > mayor){
                mayor = num;
            }
        }
        
        sc.close();
        System.out.println(mayor);
    }
}
