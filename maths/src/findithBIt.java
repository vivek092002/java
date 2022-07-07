import java.util.Scanner;

public class findithBIt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int pos = sc.nextInt();

        System.out.println( n & (1<<(pos-1)));

        sc.close();
    }
}
