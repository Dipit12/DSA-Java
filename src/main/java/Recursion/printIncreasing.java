package Recursion;

import java.util.Scanner;

public class printIncreasing {
    public static void printIncreasing(int n){
        if(n==0){
          return;
        }
        printIncreasing(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        printIncreasing(n);
    }
}
