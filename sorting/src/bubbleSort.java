import java.util.Arrays;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        sort(arr);

        System.out.println(Arrays.toString(arr));

    }

    //function for sorting
    public static void sort(int[] arr) {

        //for sorted array
        boolean swapped;

        int temp;

        // run the steps n-1 times
        for (int i = 0; i < arr.length ; i++) {

            swapped = false;
            //for each step max item will come at last index
            for (int j = 1 ; j < arr.length - i ; j++) {

                //swap if item is small than the adjacent
                if(arr[j] < arr[j-1]) {
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            // if you did not swap for a particular value of i, it means the array is sorted hence stop the program
            if (!swapped) { // !false = true
                break;
            }
        }
    }
}
