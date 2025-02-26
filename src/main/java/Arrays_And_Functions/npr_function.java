package Arrays_And_Functions;

import java.util.Scanner;

public class npr_function {
    public static int f(int x){
        int xsquare = x*x;
        return xsquare;
    }

    public static int fact(int n){
        int fact_value = 1;
        for(int i = 1; i<=n;i++){
            fact_value *= i;
        }
        return fact_value;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        System.out.println(f(x));
        System.out.println(fact(x));
        int n = input.nextInt();
        int r = input.nextInt();
        int ans = fact(n)/fact(n-r);
        System.out.println(ans);
    }
}
