//https://codeforces.com/problemset/problem/59/A

import java.util.Scanner;

public class word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int upper = 0;
        int lower = 0;
        String str = sc.next();
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) >=65 && str.charAt(i) <=90){
                upper++;
            } else {
                lower++;
            }

        }
        if (upper > lower){
            System.out.println(str.toUpperCase());
        } else {
            System.out.println(str.toLowerCase());
        }

        sc.close();
    }
}
