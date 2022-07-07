//https://codeforces.com/problemset/problem/236/A
import java.util.Scanner;

public class boyOrGirl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int totalcount = 0;
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = i+1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)){
                    count++;
                }
                //totalcount += count;
            }
            totalcount += count;
        }

        int temp = str.length() - totalcount;
        if (temp % 2 == 0){
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }

        sc.close();
    }
}
