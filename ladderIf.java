import java.util.Scanner;

public class ladderIf {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter any four numbers: ");
        int a, b, c, d;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        if (a > b & a > c & a > d) {
            System.out.println("the greatest number is " + a);
        }
        else if (b > a & b > c & b > d) {
            System.out.println("The Greatest number is " + b);

        }
        else if (c > b & c > a & c > d) {
            System.out.println("the greatest number is " + c);
        }
        else{
            System.out.println("the Greatest number is "+d);
        }
    }
}
