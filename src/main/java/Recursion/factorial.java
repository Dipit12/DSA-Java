package Recursion;

import java.util.Scanner;

public class factorial {

    public static int fact(int n){
        if(n==1){
            return 1;
        }
        return n * fact(n-1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(fact(n));
    }
}
