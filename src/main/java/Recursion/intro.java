package Recursion;

import java.util.Scanner;

public class intro {
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        int smallSum = sum(n-1);
        return smallSum + n;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(sum(n));
    }
}
