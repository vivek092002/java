import java.io.Console;
import java.util.Scanner;

public class console {
    public static  void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Console cons = System.console();
        String username = cons.readLine("User name: ");
        username = sc.next();

        char[] password = cons.readPassword("Password: ");

        sc.close();
    }
}
