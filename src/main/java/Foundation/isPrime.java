package Foundation;

import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 0; i <n; i++){
            int num = input.nextInt();
            int count = 0;
            for(int div = 1; div <= num; div++){
                if(num % div == 0){
                    count++;
                }
            }
            if(count == 2){
                    System.out.println("prime");
            }else{
                System.out.println("not prime");
            }
        }
    }
}
