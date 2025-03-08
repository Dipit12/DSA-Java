package Arrays;

public class NintyDegreeRotation {
    // first take transpose and then reverse arr row-wise
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        System.out.println("Original Matrix:");
        printMatrix(arr);

        // Transpose the matrix
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr[0].length; j++) { // Note: j starts from i+1
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // Reverse each row
        for(int i = 0; i < arr.length; i++){
            int si = 0, ei = arr[i].length - 1;
            while(ei > si){
                int temp = arr[i][si];
                arr[i][si] = arr[i][ei];
                arr[i][ei] = temp;
                si++;
                ei--;
            }
        }

        System.out.println("Rotated Matrix (90° Clockwise):");
        printMatrix(arr);
    }

    // Utility function to print the matrix
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}
