package Arrays_And_Functions;

import java.util.Scanner;

public class decimal_to_any_base {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // convert 634 with base 10 to octal
        int num = input.nextInt();
        int b = input.nextInt();
        int dn = getValueInBase(num,b);
        System.out.println("Conversion of " + num + "into " + b + "is " +dn);
    }

    public static int getValueInBase(int num, int b){
        int rv = 0;
        int p = 1;
        while(num > 0){
            int dig = num % b;
            num = num/b;

            rv += dig * p;
            p *= 10;
        }
        return rv;
    }
}
