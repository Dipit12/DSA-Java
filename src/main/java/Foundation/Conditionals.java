//import java.util.*;
package Foundation;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int number = input.nextInt();
       if(number % 2 == 0){
           System.out.println(number + " is an even number");
       }else{
           System.out.println("Given number is an odd number");
       }
    }
}
