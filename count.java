import java.util.Scanner;

public class count {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your value");
        long num = sc.nextLong();
        long dig;
        int count = 0;
        while (num != 0) {
            dig = num % 10;
            num = num / 10;
            count = count + 1;
        }
        System.out.println("Total digits you entered is " + count);
    }
}
