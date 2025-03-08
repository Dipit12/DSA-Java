package Arrays;

import java.util.Scanner;

public class maxOfArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];

        // taking input of the array
        for(int i = 0; i < n; i++){
            System.out.println("Enter the value");
            int element = input.nextInt();
            arr[i] = element;
        }
        // find max of array logic
        int max = arr[0];
        for(int i = 1; i < arr.length;i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max);
        // another method
        int max_1 = Integer.MIN_VALUE;
        // perform the same logic by comparing with this max and start the loop from index 0
    }
}
