
//https://codeforces.com/problemset/problem/112/A
import java.util.Scanner;

public class petyaAndStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next().toLowerCase();
        String str2 = sc.next().toLowerCase();

        int temp = str.compareTo(str2);

        if (temp < 0){
            System.out.println(-1);
        } else if (temp > 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        sc.close();
    }
}
