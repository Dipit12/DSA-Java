package Patterns;

import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        /*
        if input = 5 then print
        *
        **
        ***
        ****
        *****
         */
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 1; i <=5 ; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
