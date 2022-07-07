public class Fibonacci {
    public static void main(String[] args) {

        int ans = fibo(4);
        System.out.println(ans);
    }


    static int fibo(int n) {

        //base condition
        if (n < 2) {

            return n;
        }

        //recursive class
        return fibo(n-1) + fibo(n-2);
    }
}
