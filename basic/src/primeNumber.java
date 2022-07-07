import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //number of test cases
        int t = sc.nextInt();

        while (t-- > 0) {

            int m = sc.nextInt();
            int n = sc.nextInt();
            int flag ;
            for (int i = m ; i <= n ; i++) {
                if ( i==0 || i==1 ) {
                    continue;
                }

                flag = 1;
                for (int j = 2 ; j <= Math.sqrt(i) ; j++) {
                    if (i%j==0) {
                        flag=0;
                        break;
                    }
                }



                if ( flag == 1) {
                    System.out.println(i);
                }
            }
            System.out.println();

        }




        sc.close();
    }
}
