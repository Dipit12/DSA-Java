package Arrays_And_Functions;

import java.util.Scanner;

public class anyBase_to_Decimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int base = input.nextInt();
        int ans = baseToDecimal(number,base);
        System.out.println(ans);
    }

    public static int baseToDecimal(int number, int base){
        int power = 1;
        int sum = 0;
        while(number > 0){
            int digit = number % 10;
            number /= 10;

            sum += digit*power;
            power = power *base;
        }
        return sum;
    }
}
