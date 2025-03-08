package Arrays;

public class intro {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] list = new int[5];
        // setting values in an arr
        for(int i = 0; i < 5; i++){
            list[i] = i+1;
        }
        System.out.println(arr.length);
        System.out.println(arr[2]);
        System.out.println("Printing the value of lis arr");
        for(int i = 0; i < 5; i++){
            System.out.println(list[i]);
        }
    }
}
