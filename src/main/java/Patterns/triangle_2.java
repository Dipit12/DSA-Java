package Patterns;

import java.util.Scanner;

public class triangle_2 {
    public static void main(String[] args) {
        /*
        if input = 5 then
        *****
        ****
        ***
        **
        *
         */
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 1; i <= 5; i++){
            for(int k = n; k >=i; k--){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
