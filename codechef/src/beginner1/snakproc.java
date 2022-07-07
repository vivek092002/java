package beginner1;

import java.util.Scanner;

public class snakproc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- != 0){

            int l = sc.nextInt();
            String str = sc.next();

            if (str.length() != l){
                System.out.println(-1);
                System.exit(0);
            } else {
                String str2 = "";
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) != '.') {

                        str2 += str.charAt(i);

                    }
                }
                int count = 0, count2 = 0;
                for (int i = 0; i < str2.length(); i++) {
                    if (str2.charAt(i) == 'H') {
                        count++;
                    } else {
                        count2++;
                    }
                }
                if (count != count2) {
                    System.out.println("INVALID");
                } else {

                    for (int i = 0; i < str2.length(); i = i + 2) {
                        if (str2.charAt(i) != 'H' || str2.charAt(i + 1) != 'T') {
                            System.out.println("INVALID");
                        } else {
                            System.out.println("VALID");
                        }
                    }

                }
            }
        }

        sc.close();
    }
}
