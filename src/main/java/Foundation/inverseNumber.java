package Foundation;

import java.util.Scanner;

public class inverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int sum = 0;
        int originalPlace = 1;

        while(num != 0){
            int originalDigit = num % 10;
            int invertedDigit = originalPlace;
            int invertedPlace = originalDigit;

            // make change to inv using ip and id
            invertedDigit =(int) Math.pow(10,invertedPlace-1);
            sum = sum + invertedDigit * (int)Math.pow(10,invertedPlace-1);
            num /= 10;
            originalPlace++;
        }
        System.out.println(sum);
    }
}
