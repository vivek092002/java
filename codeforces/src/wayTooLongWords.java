//https://codeforces.com/problemset/status?my=on
import java.util.Scanner;

public class wayTooLongWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- != 0) {

            String str = sc.next();

            if (str.length() <= 10) {
                System.out.println(str);
            } else {

                System.out.print(str.charAt(0) /*+ str.length() - 2 + str.charAt(str.length() - 1)*/);
                System.out.print(str.length()-2);
                System.out.println(str.charAt(str.length()-1));

            }

        }
        sc.close();
    }
}
