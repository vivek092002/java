//import java.util.Scanner;

public class findUnique {
    public static void main(String[] args) {

        int[] arr = {2,3,4,5,6,2,5,3,4};
        System.out.println(answer(arr));
    }

    private static int answer(int[] arr) {

        int unique = 0;

        for (int n : arr) {
            unique ^= n;
        }

        return unique;
    }
}
