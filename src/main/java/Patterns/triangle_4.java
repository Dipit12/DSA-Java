package Patterns;

import java.util.Scanner;

public class triangle_4 {
    public static void main(String[] args) {
        /*
        given an input 5, we have to print
        *****
         ****
          ***
           **
            *
         */
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sp = 0;
        int st = n;
        for(int i =1; i<=5;i++){
          for(int j = 1; j <= sp; j++){
              System.out.print("\t");
          }
            for(int j = 1; j <= st; j++){
                System.out.print("\t");
                System.out.print("*");
            }
           sp++;
           st--;
           System.out.println();
        }
    }

}
