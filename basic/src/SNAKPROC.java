
//https://www.codechef.com/problems/SNAKPROC

import java.util.Scanner;

public class SNAKPROC {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt();

        while (R-- > 0) {

            //string length
            int L = sc.nextInt();
            //string value
            String str = sc.next();
            String str2 = "";
            for (int i = 0; i < L ; i++) {

                char ch = str2.charAt(i);
                if( ch=='H') {
                    str2+=ch;
                } else if (ch=='T') {
                    str2+=ch;
                }
            }

            boolean ans = true;
           // for finding string length
            if (str2.length() % 2 != 0) {
                ans = false;
            } else {
                for (int i = 0; i < str2.length(); i++) {
                    if (i % 2 == 0) {
                        if (str2.charAt(i) == 'T') {
                            ans = false;
                        }
                    } else {
                        if (str2.charAt(i) == 'H') {
                            ans = false;
                        }
                    }
                }

            }

            if (ans) {
                System.out.println("VALID");
            } else {
                System.out.println("INVALID");
            }
        }


        sc.close();
    }
}
