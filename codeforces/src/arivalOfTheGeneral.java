//https://codeforces.com/problemset/problem/144/A
//incomplete

import java.util.Scanner;

public class arivalOfTheGeneral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i-1]){
                int temp = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = temp;
                count++;
            }
        }
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i-1]){
                int temp = arr[i];
                arr[i] = arr[i-1];
                arr[i-1] = temp;
                count++;
            }
        }


        System.out.println(count);
        sc.close();
    }
}
