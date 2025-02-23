package Foundation;

import java.util.Scanner;

public class rotateNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int key = input.nextInt();

        int count = 0;
        int temp = n;
        while(temp > 0){
            temp /= 10;
            count++;
        }
        int div = 1;
        int mul = 1;
        for(int i = 1; i<=count; i++){
            if(i<=key){
                div = div * 10;
            }else{
                mul = mul * 10;
            }
        }
    }

}
