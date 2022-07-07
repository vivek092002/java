
//https://www.codechef.com/submit-v2/SNAKPROC
import java.util.Scanner;

public class snakeProc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //testcases
        int t = sc.nextInt();
        while (t-- != 0){

            //length of string
            int l = sc.nextInt();
            String str = sc.next();

            //array value
       //     int temp = 0;

            String str2 = "";

            for (int i = 0; i < l; i++) {
                if (str.charAt(i)=='H' || str.charAt(i)=='T') {
                    str2 =  str2 + str.charAt(i);
                }
            }
            for (int i = 0; i < str2.length() ; i++) {

                if ((i%2==0)&&(str2.charAt(i)=='T') || ()){

                }

            }

        }

        sc.close();
    }
}
