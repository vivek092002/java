
//find the number if it is odd or even in binary

import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        //checks odd or even
        System.out.println(isOdd(n));

        sc.close();
    }

    // if last digit (LSB) of a boolean is 1 then it is odd otherwise even
    static boolean isOdd(int n){

        return ( n & 1) == 1;

    }
}
