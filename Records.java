import java.sql.Savepoint;
import java.util.Scanner;

public class Records {
    public static void main(String args[]) {
        System.out.println("Welcome!!!");
        Scanner sc = new Scanner(System.in);
        Savepoint savepoint;
        String usrid, pswrd;
        System.out.println("Are you a new user or an existing user ?");
        String user = sc.nextLine();
        System.out.println("Create your profile here.");
        System.out.println("Enter your User id:");
        usrid = sc.nextLine();
        System.out.println("Enter your password:");
        pswrd = sc.nextLine();
        System.out.println("Congratulations you have successfully registered.");
    }
}

