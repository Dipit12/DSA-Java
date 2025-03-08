package Arrays;

public class transposeOfMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,15}};
        // printing the original arr;
        System.out.println("Before Swapping");
        for(int i =0; i < arr.length;i++){
            for(int j = 0; j<arr[0].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        // swapping logic
        for(int i =0; i < arr.length;i++){
            for(int j = 0; j<i;j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        System.out.println("After Swapping");
        for(int i =0; i < arr.length;i++){
            for(int j = 0; j<arr[0].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
