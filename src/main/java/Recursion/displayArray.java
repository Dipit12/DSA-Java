package Recursion;

public class displayArray {
    public static void displayArray(int[] arr, int i){

        if(i == arr.length){
            return;
        }

        System.out.println(arr[i]);
        displayArray(arr,i+1);

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        displayArray(arr,0);
    }
}
