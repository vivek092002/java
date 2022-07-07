import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {

        int[] arr = {3, 5, 1, 4, 2};

        sort(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr) {

        for (int i = 0; i < arr.length ; i++) {

            //find the maximum item in the remaining array and swap with the correct index
            int last = arr.length - i - 1;
            int maxIndex = getMax(arr,0,last) ;
            swap(arr, maxIndex, last);
        }
    }

    public static int getMax(int[] arr, int start, int end) {

        int max = start;

        for (int i = start ; i <= end ; i++) {
            if (arr[i] > arr[max] ) {
                max = i;
            }
        }
        return max;
    }

    public static void swap(int[] arr, int a, int b) {
        int temp;
        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
