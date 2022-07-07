import java.util.Scanner;

public class primeNumber2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println( i + " " + isPrime(n));
        }


        sc.close();
    }

    public static boolean isPrime(int n){

        if (n<=1){
            return false;
        }

        //to check for only till square root
        int temp = 2;

        while (temp*temp <= n){

            if (n % temp == 0){
                return false;
            }
            temp++;

        }
        return true;

    }
}
