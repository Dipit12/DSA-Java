package Foundation;

import java.util.Scanner;

public class numOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int count = 0;
        while(num != 0){
            num /= 10;
            count++;
        }
        System.out.println(count);
        int num1 = input.nextInt();
        while(num1 != 0){
            int rem = num1 % 10;
            System.out.println(rem);
        }
    }

}
