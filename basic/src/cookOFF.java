
//https://www.codechef.com/problems/C00K0FF

import java.util.Objects;
import java.util.Scanner;

public class cookOFF {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //number of test cases
        int t = sc.nextInt();

        while(t-- > 0) {

            int N = sc.nextInt();

            if( count(N) ) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

        }


        sc.close();
    }//Driver's code end

    public static boolean count(int n) {

        Scanner sc = new Scanner(System.in);

        int temp1 = 0, temp2 = 0, temp3 = 0, temp4 = 0, temp5 = 0;
        for (int i = 0; i < n ; i++) {

            String str = sc.next();

            if(str.equals("cakewalk")) {
                temp1++;
            }
            if (str.equals("simple")) {
                temp2++;
            }
            if ( str.equals("easy") ) {
                temp3++;
            }
            if (str.equals("easy-medium") || str.equals("medium") ) {
                temp4++;
            }
            if ( str.equals("medium-hard") || str.equals("hard") ) {
                temp5++;
            }


        }
        if(temp1+temp2+temp3+temp4+temp5 == 5) {
            return true;
        }
        sc.close();
        return false;
    }
}
