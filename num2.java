import java.util.Scanner;

public class num2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any two numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        if (a>b)
        {
            System.out.println("the Greater number is "+a);
        }
        else {
            System.out.println("the Greater number is "+b);
        }
    }
}
