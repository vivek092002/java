import java.util.Scanner;

//https://codeforces.com/problemset/problem/69/A
public class youngphysicst {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][3];
        int[] sums = new int[3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
                sums[j] += arr[i][j];
            }
        }
        if (sums[0] == 0 && sums[1] == 0 && sums[2] == 0)
            System.out.println("YES");
        else
            System.out.println("NO");

        sc.close();

    }
}
