//https://codeforces.com/problemset/problem/318/A
//wrong

import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
       // int[] arr = new int[n];
       // int count = 0;

        if (k <= (n + 1) / 2)
        {
            System.out.println(k * 2 - 1);
        }
        else
        {
            System.out.println((k - (n + 1) / 2) * 2);
        }

        sc.close();
    }
}
