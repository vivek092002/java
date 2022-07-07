import java.util.Scanner;

public class PROC18A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0 ) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            //input the number of girls in each kilometre
            int[] arr = new int[n];
            for (int i = 0; i < n ; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println(girlsCount(arr,n,k));

        }

        sc.close();
    }

    public static int girlsCount(int[] arr, int n, int k) {

        int max = 0;

        for(int i=0; i<=n-k; i++){
            int sum =0;
            int j=i;
            int l= k;
            while(l>0){
                sum = sum + arr[j];
                l--;
                j++;
            }
            if(max < sum){
                max= sum;
            }

        }
        return max;
    }
}
