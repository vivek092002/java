import java.util.Scanner;

public class diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n,i,j, space = 1;
        System.out.println("enter the number of rows ");
        n = sc.nextInt();
        space = n - 1;
        for (j=1 ; j<=n ; j++ ){

            for (i=1 ; i<=space ; i++ ){
                System.out.print(" ");
            }
            space--;
            for (i = 1; i <= 2*j-1 ; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        space = 1;
        for ( j = 1; j <= n-1 ; j++) {
            for ( i = 1; i <=space ; i++) {
                System.out.print(" ");
            }
            space++;
            for (i = 1; i <= 2*(n-j) - 1 ; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        sc.close();
    }
}
