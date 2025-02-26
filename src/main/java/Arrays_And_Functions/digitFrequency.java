package Arrays_And_Functions;

import java.util.Scanner;

public class digitFrequency {

    public static int getDigitFrequency(int n, int d){
        int count = 0;
        while(n != 0){
            int digit = n % 10;
            if(digit == d){
                count++;
            }
            n /= 10;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int d = input.nextInt();
        System.out.println(getDigitFrequency(n,d));
    }
}
