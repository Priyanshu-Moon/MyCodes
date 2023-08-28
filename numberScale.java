import java.util.Scanner;

public class numberScale {
    public static void main(String argsf[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int a=sc.nextInt();
        if(a>0){
            System.out.println("The number you've entered is positive.");
        }
        else if(a<0){
            System.out.println("The number you've entered is negative.");
        }
        else{
            System.out.println("The number is zero.");
        }
    }
}
