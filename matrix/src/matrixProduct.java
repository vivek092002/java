import java.util.Arrays;

public class matrixProduct {
    public static void main(String[] args) {

        int[][] arr = {{1,1,1},{2,2,2},{3,3,3}};
        int[][] arr2 = {{1,1,1},{2,2,2},{3,3,3}};

        int len = arr.length;

        multiply(arr ,arr2);


    }

    public static void multiply(int[][] arr, int[][] arr2 ) {

        int len = arr.length;
        int[][] temp = new int[len][len];

        for (int i = 0; i < len ; i++) {
            for (int j = 0; j < len ; j++) {

                temp[i][j] = 0;
                for (int k = 0; k < len ; k++) {
                    temp[i][j] += arr[i][k] * arr2[k][j];
                }
            }
        }

        for (int i = 0; i < len ; i++) {
            for (int j = 0; j < len ; j++) {
                System.out.print(temp[i][j] + " ");
            }
            System.out.println();
        }
    }
}
