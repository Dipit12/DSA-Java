package Arrays;

public class reverse {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        // logic to reverse the array
        int start = 0;
        int end = arr.length - 1;
        while(end > start){
            arr[start] = arr[start] ^ arr[end];
            arr[end] = arr[start] ^ arr[end];
            arr[start] = arr[start] ^ arr[end];
            start++;
            end--;
        }
        for(int i = 0; i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
