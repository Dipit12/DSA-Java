package Foundation;

import java.util.Scanner;

public class benjaminBulbs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 1;   i * i <= n; i++){
            System.out.println(i*i);
        }
    }
}
