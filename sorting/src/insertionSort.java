import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {


        int[] arr = {5 , 3 , 4 , 1 , 2};

        //calling for function
        sort(arr);
        System.out.println(Arrays.toString(arr));


    }  //driver code end

    public static void sort(int[] arr) {

        for (int i = 0; i < arr.length - 1 ; i++) {
            for (int j = i+1 ; j > 0 ; j-- ) {
                if(arr[j] < arr[j-1]) {
                    swap(arr , j , j-1 );
                } else {
                    break;
                }
            }
        }
    }

    //swapping the value of each other
    public static void swap(int[] arr , int a , int b ) {

        int temp;
        temp = arr[a] ;
        arr[a] = arr[b] ;
        arr[b] = temp ;
    }
}
