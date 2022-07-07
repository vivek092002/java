
//https://www.codechef.com/submit-v2/MISSP

package beginner1;

import java.util.Arrays;
import java.util.Scanner;

public class missp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);

            for (int i = n-1 ; i >= 0; i=i-2) {
                if (arr[i-1] != arr[i]){
                    System.out.println(arr[i]);
                    break;
                }
            }
        }

        sc.close();
    }
}
