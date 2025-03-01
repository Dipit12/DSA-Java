package Arrays_And_Functions;

import java.util.Scanner;

public class anyBase_To_anyBase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int givenBase = input.nextInt();
        int targetBase = input.nextInt();
        int ans = baseToBase(number,givenBase,targetBase);
        System.out.println(ans);
    }

    public static int baseToBase(int number, int givenBase, int targetBase){
        int power = 1;
        int sum = 0;
        while(number > 0){
            int digit = number % givenBase;
            number /= 10;

            sum += digit*power;
            power = power *targetBase;
        }
        return sum;
    }
}
