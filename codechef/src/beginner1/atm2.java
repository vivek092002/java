package beginner1;
//https://www.codechef.com/submit/ATM2
import java.util.Scanner;

public class atm2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- != 0){

            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                if (arr[i] <= k ){
                    System.out.print(1);
                    k = k - arr[i];
                } else {
                    System.out.print(0);
                }
            }
            System.out.println();


        }

        sc.close();
    }
}
