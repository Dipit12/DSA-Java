package Foundation;

import java.util.Scanner;

public class primeFactors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for(int div = 2;  div * div <= num; div++){
            while(num % div == 0){
                num /= div;
                System.out.print(div + " ");
            }
        }
        if(num != 1){
            System.out.print(num);
        }
    }
}
