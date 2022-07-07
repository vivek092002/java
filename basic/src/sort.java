import java.util.Arrays;
import java.util.Scanner;

public class sort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Integer[] arr = {6,2,5,1,3,4,8,9,7};

        //calling sort function
        Arrays.sort(arr,3,5);

        System.out.println(Arrays.toString(arr));


        sc.close();
    }
}
