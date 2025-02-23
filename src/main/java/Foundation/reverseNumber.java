package Foundation;

import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        // count the digits in the number;
        int temp = num;

        while(temp != 0){
           System.out.println(temp % 10);
           temp /= 10;
        }
    }

}
