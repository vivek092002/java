import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class arrayListHackerrank {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        //declaring main arraylist
        List<ArrayList<Integer>> colList = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < n ; i++) {

            int d = sc.nextInt();

            ArrayList<Integer> row = new ArrayList<Integer>();
            for (int j = 0; j < d ; j++) {

                //taking row input
                row.add(sc.nextInt());
            }

            colList.add(row);

        }

        //printing desire queries
        int q = sc.nextInt();
        for (int i = 0; i < q ; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            int ans = colList.get(x-1).get(y-1);

            if(colList.contains(ans)) {
                System.out.println(ans);
            } else {
                System.out.println("ERROR!");
            }
        }

        sc.close();
    }
}
