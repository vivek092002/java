import java.util.Scanner;

public class numberExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //print first 5 numbers
        print(1);

        sc.close();
    }

    static void print(int n) {

        //base condition
        if (n == 5) {

            System.out.println(5);
            return;

        }

        //recursive call
        System.out.println(n);
        print(n+1);
    }
}
