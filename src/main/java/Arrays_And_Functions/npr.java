package Arrays_And_Functions;

import java.util.Scanner;

public class npr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int r = input.nextInt();
        int nfact = 1;

        for(int i = 1; i <= n; i++){
            nfact *= i;
        }
        int nrfact = 1;

        for(int i = 1; i <= n- r; i++){
            nrfact *= i;
        }
        int ans = nfact / nrfact;
        System.out.println(ans);
    }
}
