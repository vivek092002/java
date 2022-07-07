
//https://codeforces.com/problemset/problem/263/A
import java.util.Scanner;

public class beautifulMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[5][5];
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {

                arr[i][j] = sc.nextInt();

                if (arr[i][j] == 1){

                    System.out.println(Math.abs((i-3)+1)+Math.abs((j-3)+1));

                }
            }
        }

        sc.close();
    }
}
