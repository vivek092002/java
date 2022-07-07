
//https://codeforces.com/contest/1692/problem/F

import java.util.Scanner;

public class threeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- != 0){

            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int flag = 0;
            for (int i = 0; i < n; i++) {
                for (int j = i+1; j < n; j++) {
                    for (int k = j+1; k < n; k++) {
                        if ((arr[i]+arr[j]+arr[k])%10==3){
                            //System.out.println("YES");
                            flag++;
                            break;
                        }
                    }
                }
            }
           // System.out.println("NO");

            if (flag>=1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
