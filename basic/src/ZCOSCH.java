import java.util.Scanner;

public class ZCOSCH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if( n>=1 || n<=50 ) {
            System.out.println(100);
        } else
            if ( n>50 || n<= 100 ) {
                System.out.println(50);
            } else {
                System.out.println(0);
            }


        sc.close();
    }
}
