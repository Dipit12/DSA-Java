package Patterns;

import java.util.Scanner;

public class triangle_3 {
    public static void main(String[] args) {
        /*
        if input = 5, then print
                    *
                   **
                  ***
                 ****
                *****
         */
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sp = n-1;
        int st = 1;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= sp; j++){
                System.out.print("\t");
            }

            for(int j = 1; j <= st; j++){
                System.out.print("\t");
                System.out.print("*");
            }
            sp--;
            st++;
            System.out.println();
        }
    }
}
