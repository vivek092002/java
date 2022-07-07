//https://codeforces.com/problemset/problem/141/A
import java.util.Arrays;
import java.util.Scanner;

public class amusingJoke {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        String str2 = sc.next();
        String str3 = sc.next();
        String str4 = "";
        str4 = str + str2;

        if (str3.length() != str4.length()){
            System.out.println("NO");
            System.exit(0);
        }

        char ch[] = str4.toCharArray();
        char ch2[] = str3.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch2);

        int flag = 0;
        for (int i = 0; i < str3.length(); i++) {
            if (ch[i] != ch2[i]){
                flag = 1;
                break;
            }
        }

        if (flag==0){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


        sc.close();
    }
}
