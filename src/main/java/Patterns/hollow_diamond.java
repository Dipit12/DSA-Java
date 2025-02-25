package Patterns;

import java.util.Scanner;

public class hollow_diamond {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sp = (n / 2) + 1;
        int st = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= st; j++) {
                System.out.print("*\t");
            }
            if (i <= n / 2) {
                st--;
                sp += 2;
            } else {
                st++;
                sp -= 2;
            }
            System.out.println();
        }
    }
}
