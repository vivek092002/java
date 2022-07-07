
//https://codeforces.com/problemset/problem/80/A
import java.util.Scanner;

public class paronamixPrediction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47};
        int n = sc.nextInt();
        int m = sc.nextInt();

        boolean temp = false;
        for (int i = 1; i < arr.length; i++) {

            if (arr[i-1] == n){
                if (arr[i] == m){
                    temp = true;
                    break;
                }
            }

        }
        if (temp){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}
