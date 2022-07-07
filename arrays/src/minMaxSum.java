import java.util.Scanner;

public class minMaxSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < 5 ; i++) {
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        int max = arr[0];
        int sum = 0;

        for (int i = 0; i < 5 ; i++) {

            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
            sum += arr[i];
        }

        System.out.println((sum - max )+ " " + (sum - min));

        sc.close();
    }
}
