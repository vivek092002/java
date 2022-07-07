//https://codeforces.com/problemset/problem/271/A

import java.util.Arrays;
import java.util.Scanner;


public class beautifullYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

        while(true)
        {
            year++;
            String str = Integer.toString(year);

            if(str.charAt(0)!=str.charAt(1) && str.charAt(0)!=str.charAt(2)&&str.charAt(0)!=str.charAt(3)&&str.charAt(1)!=str.charAt(2)&&str.charAt(1)!=str.charAt(3)&&str.charAt(2)!=str.charAt(3))
            {
                System.out.println(str);
                break;
            }
        }

        sc.close();
    }
}
