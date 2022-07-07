import java.util.Locale;
//https://codeforces.com/problemset/problem/281/A

import java.util.Scanner;

public class wordCapitalization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        if (str.charAt(0)>=65 && str.charAt(0)<=90 ){
            System.out.println(str);
        } else {
            System.out.println(str.substring(0,1).toUpperCase()+str.substring(1));
        }

        sc.close();
    }
}
