import java.util.Scanner;

public class tablet {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //number of testcase
        int t = sc.nextInt();

        while(t-- > 0) {


            //number of tablets available
            int n = sc.nextInt();
            //admins budget
            int b = sc.nextInt();

            int[] area = new int[n];
            for (int i = 0; i < n ; i++) {

                //weight
                int w = sc.nextInt();
                //height
                int h = sc.nextInt();
                //tablet price
                int p = sc.nextInt();
                if( p < b ) {
                    area[i] = w*h ;
                } else {
                    area[i] = 0 ;
                }

            }

            int max = 0;
            for (int i = 0; i < n ; i++) {
                if( area[i] > max ) {
                    max = area[i];
                }
            }

            if(max == 0 ) {
                System.out.println("no tablet");
            } else {
                System.out.println(max);
            }


        }

        sc.close();

    }
}
