import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int ans = Factorial(n);
        System.out.println(ans);

        sc.close();
    }

    public static int Factorial(int n){

        //base class
        if(n<=1) {
            return 1;
        } else {

            //recursive class: checks for n-1 factorial
            return n*Factorial(n-1);
        }
    }
}
