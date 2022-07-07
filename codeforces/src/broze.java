//https://codeforces.com/problemset/problem/32/B
import java.util.Scanner;

public class broze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str2 = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '.'){
                str2 += '0';

            } else
            if (str.charAt(i) == '-' && str.charAt(i+1) == '.'){
                str2 += '1';
                ++i;
            } else {
                str2 += '2';
                ++i;
            }

        }
        System.out.println(str2);

        sc.close();
    }
}
