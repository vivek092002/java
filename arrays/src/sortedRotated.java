//https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/

import java.util.Scanner;

public class sortedRotated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i-1] > arr[i]){
                count++;
            }
        }
        if (arr[n-1] > arr[0]){
            count++;
        }

        if (count==1){
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }

        sc.close();
    }
}
