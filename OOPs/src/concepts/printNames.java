package concepts;

import java.util.Scanner;

public class printNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //creating string of arrays
        String[] names = new String[2];

        //taking input names
        for (int i = 0; i < 2; i++) {
            names[i] = sc.nextLine();
        }

        for (int i = 0; i < 2; i++) {
            System.out.println(names[i]);
        }

        sc.close();
    }
}
