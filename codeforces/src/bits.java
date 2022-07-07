
//https://codeforces.com/problemset/problem/282/A?csrf_token=35168c5d411f9600c328cf3435ce1999&f0a28=1

import java.util.Scanner;

public class bits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

       //String str;
       int x = 0;

        while (n-- != 0) {

            String str = sc.next();
            if (str.charAt(0)=='+') {
                ++x;
            } else {
                --x;
            }

            System.out.println(x);



        }

        sc.close();
    }
}
