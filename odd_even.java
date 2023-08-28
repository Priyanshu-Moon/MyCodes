import java.util.Scanner;

public class odd_even {
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number:");
    int num=sc.nextInt();
    if(num%2==1){
        System.out.println("Your number is Odd ");
    }else{
        System.out.println("The number you have entered is even ");
    }
}
    }