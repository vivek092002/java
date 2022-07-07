import java.util.Scanner;

public class matches {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            sum(a,b);
        }
        sc.close();
    }

    public static void sum(int first, int second) {

        int s = first + second;
        int ans = count(s);

        System.out.println(ans);
    }

    public static int count(int num) {

        int sum = 0;

        while(num>0) {
            int temp = num % 10;

            switch(temp) {
                case 0 : sum += 6;
                num = num / 10;
                continue;
                case 1 : sum += 2;
                    num = num / 10;
                    continue;
                case 2 : sum += 5;
                    num = num / 10;
                    continue;
                case 3 : sum += 5;
                    num = num / 10;
                    continue;
                case 4 : sum += 4;
                    num = num / 10;
                    continue;
                case 5 : sum += 5;
                    num = num / 10;
                    continue;
                case 6 : sum += 6;
                    num = num / 10;
                    continue;
                case 7 : sum += 3;
                    num = num / 10;
                    continue;
                case 8 : sum += 7;
                    num = num / 10;
                    continue;
                case 9 : sum += 6;
                    num = num / 10;
                    continue;
            }


        }
        return sum;
    }


}
