package Arrays_And_Functions;

import java.util.Scanner;

public class anyBase_Addition {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();;
        int base = input.nextInt();
        int ans = anyBaseAdd(num1,num2,base);
        System.out.println((ans));
    }

    public static int anyBaseAdd(int num1, int num2, int base){
        int sum = 0;
        int c = 0;
        int p = 1;
        while(num1 > 0 || num2 > 0 || c > 0){
            int d1 = num1 % 10;
            int d2 = num2 % 10;
            num1/=10;
            num2/=10;
            int d  = d1+d2+c;
            c = d/base;
            d = d % base;
            sum += d * p;
            p = p * 10;

        }

        return sum;
    }
}
