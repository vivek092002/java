import java.util.ArrayList;
import java.util.Scanner;

public class factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        factors3(n);

        sc.close();
    }

    //finding factors of the number

    //O(n)
    static void factor1(int n){

        for (int i = 1; i <= n ; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }

    }

    //O(sqrt(n))
    static void factors2(int n){
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0){
                if (n/i == i ){
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + " " + n/i + " " );
                }

            }
        }
    }

    //findng factor most efficient way
    static void factors3(int n){

        ArrayList<Integer> List = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0){
                if (n/i == i ){
                    System.out.print(i + " ");
                } else {
                    System.out.print(i + " ");
                    List.add(n/i);
                }

            }
        }

        for (int i = List.size()-1; i >= 0 ; i--) {
            System.out.print(List.get(i) + " ");
        }

    }
}
