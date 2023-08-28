
import java.util.Scanner;
public class Swap {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of a: ");
        int a= sc.nextInt();
        System.out.println("Enter the value of b:");
        int b= sc.nextInt();
        b=b-a;
        a=a+b;
        b=a-b;
        System.out.println("Value of a is "+a);
        System.out.println("Value of b is "+b);
    }
}
