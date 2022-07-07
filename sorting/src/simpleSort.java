import java.util.Arrays;
import java.util.Scanner;

public class simpleSort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("enter the array");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        //calling sort function
        sort(arr);

        sc.close();
    } //Driver code end

    public static void sort(int[] arr) {

        Arrays.sort(arr);

        System.out.println("sorted array is");
        System.out.println(Arrays.toString(arr));
    }
}
