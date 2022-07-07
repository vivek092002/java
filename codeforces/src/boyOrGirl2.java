
//https://codeforces.com/problemset/problem/236/A
import java.util.Arrays;
import java.util.Scanner;

public class boyOrGirl2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int count = 1;
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        for (int i = 1; i < ch.length; i++) {
            if (ch[i-1] != ch[i]){
                ++count;
            }
        }
        if (count % 2 == 0){
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }

        sc.close();
    }
}
