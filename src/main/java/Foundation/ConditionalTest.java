package Foundation;

import java.util.Scanner;

public class ConditionalTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mark = input.nextInt();
        if(mark >= 90){
            System.out.println("Excellent");
        }
        else if(mark >= 80 && mark < 90){
            System.out.println("Good");
        }
        else if(mark >= 70 && mark < 80){
            System.out.println("Fair");
        }
        else if(mark >= 60 && mark < 70){
            System.out.println("Expected more");
        }
        else{
            System.out.println("Below par");
        }
    }
}
