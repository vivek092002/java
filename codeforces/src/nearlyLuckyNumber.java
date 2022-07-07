//https://codeforces.com/problemset/problem/110/A

import java.util.Scanner;

public class nearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Long n = sc.nextLong();
        int count = 0;
        while (n>0){

            Long temp = n % 10;
            if (temp==4 || temp==7){
                count++;
            }
            n = n / 10;

        }
        if (count==4 || count==7){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}
