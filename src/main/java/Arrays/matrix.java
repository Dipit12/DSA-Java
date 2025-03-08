package Arrays;

public class matrix {
    public static void main(String[] args) {
        int[][] arr = new int[5][6];
        // set an element
        arr[1][3] = 10;
        // get element
        System.out.println(arr[1][1]);
        System.out.println(arr[1][3]);
        // row count
        System.out.println(arr.length);
        // column count
        System.out.println(arr[0].length);
        // traversal on 2D array
        for(int i = 0; i < arr.length;i++){
            for(int k = 0; k < arr[0].length;k++){
                System.out.print(arr[i][k]);
            }
            System.out.println();
        }
    }
}
