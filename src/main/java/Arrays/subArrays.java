package Arrays;

public class subArrays {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        for(int si = 0; si < arr.length;si++){
            for(int ei = si; ei < arr.length;ei++){
                for(int k =si; si<=ei;k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }
}
