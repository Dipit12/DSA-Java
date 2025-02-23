package Foundation;

import java.util.Scanner;

public class hcf_and_lcm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int on1 = n1;
        int on2 = n2;
        while(n1 % n2 != 0){
            int rem = n1 % n2;
            n1 = n2;
            n2 = rem;
        }
        int hcf = n2;
        int lcm = (on1 * on2) / hcf;
        System.out.println(hcf);
        System.out.println(lcm);
    }

}
