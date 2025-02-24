package Foundation;

import java.util.Scanner;

public class pythagoreanTriplets {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        // find max of the 3 no's
        if(a > b && a > c){
            if(Math.pow(a,2) == Math.pow(b,2) + Math.pow(c,2)){
                System.out.println("Yes it is a pythagorean trplet");
            }else{
                System.out.println("Not a pythagorean triplet");
            }
        }
        else if(b > a && b> c){
            if(Math.pow(b,2) == Math.pow(a,2) + Math.pow(c,2)){
                System.out.println("Yes it is a pythagorean trplet");
            }else{
                System.out.println("Not a pythagorean triplet");
            }
        }
        else{
            if(Math.pow(c,2) == Math.pow(a,2) + Math.pow(b,2)){
                System.out.println("Yes it is a pythagorean trplet");
            }else{
                System.out.println("Not a pythagorean triplet");
            }
        }
    }
}
