//https://codeforces.com/problemset/problem/266/B

import java.util.Scanner;

public class queueAtSchool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int time = sc.nextInt();
        String str = sc.next();
        StringBuilder string = new StringBuilder(str);

        while (time-- != 0){

            for (int i = 1; i < n; i++) {
                if (string.charAt(i-1)=='B' && string.charAt(i)=='G'){
                    string.setCharAt(i-1,'G');
                    string.setCharAt(i,'B');
                    ++i;
                }
            }

        }
        System.out.println(string);

        sc.close();
    }
}
