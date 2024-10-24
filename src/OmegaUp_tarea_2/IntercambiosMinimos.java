package OmegaUp_tarea_2;

import java.util.Scanner;

public class IntercambiosMinimos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

       if (C >=B && B >=A){
        System.out.println(0);
        } else if ((C>=A && A>=B) || (B>=C && C>=A) || (A>=B && B>=C)){ 
        
        System.out.println(1);
        } else   {
        System.out.println(2);
       }
    }

}
