import java.util.*;

public class allDistinct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- != 0){

            int n = sc.nextInt();
            Set<Integer> set = new HashSet<Integer>();

            for (int i = 0; i < n; i++) {
                set.add(sc.nextInt());
            }

            if ((n- set.size())%2!=0){
                System.out.println(set.size()-1);
            } else {
                System.out.println(set.size());
            }
            

        }
        sc.close();
    }
}
