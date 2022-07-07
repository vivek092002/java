//https://codeforces.com/problemset/problem/272/A

import java.util.Scanner;

public class dimaAndFriends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

            sum += arr[i];
        }

        for (int i = 1; i <= 5; i++) {
            if ((sum + i) % (n + 1) != 1)
            {
                ans += 1;
            }
        }
        System.out.println(ans);

        sc.close();
    }
}
