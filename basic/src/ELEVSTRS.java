
//https://www.codechef.com/problems/ELEVSTRS


import java.util.Scanner;

public class ELEVSTRS {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0 ) {

            double n = sc.nextInt();
            double v1 = sc.nextInt();
            double v2 = sc.nextInt();

            //time for stairs
            double st = n*Math.sqrt(2)/v1;
            //time for elevator
            double ele = 2*n/v2;

            if( st < ele ) {
                System.out.println("elevator");
            } else {
                System.out.println("stairs");
            }

        }


        sc.close();
    }
}
