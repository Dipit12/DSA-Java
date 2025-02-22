package Foundation;

import java.util.Scanner;

public class primeInRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int low = input.nextInt();
        int high = input.nextInt();
        for(int i = low; i <=high;i++){
            // check if the number is prime, if yes, print it or else leave it
            int count = 0;
            for(int j = 1; j <=i;j++){
                if(i % j == 0){
                    count++;
                }
            }
            if(count == 2){
                System.out.println(i);
            }
        }
    }
}
