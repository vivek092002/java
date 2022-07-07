//https://codeforces.com/problemset/problem/133/A

import java.util.Scanner;

public class HQ9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='H' || str.charAt(i)=='Q' || str.charAt(i)=='9'){
                System.out.println("YES");
                System.exit(0);
            }
        }
        System.out.println("NO");

        sc.close();
    }
}
