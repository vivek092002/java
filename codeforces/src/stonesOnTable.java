
//https://codeforces.com/problemset/problem/266/A

import java.util.Scanner;

public class stonesOnTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String str = sc.next();
        int count = 0;
        if (n != str.length() ){
            System.out.println(-1);
        } else {

            for (int i = 1; i < n; i++) {

                if (str.charAt(i-1) == str.charAt(i)){
                    count++;
                }
            }

            System.out.println(count);


        }

        sc.close();
    }
}
