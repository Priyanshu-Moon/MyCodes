import java.util.Scanner;

public class oddevenSwitchCase {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        switch (num%2) {
            case 0 :
                System.out.println("the number you enter is Even");
                break;
            case 1:
                System.out.println("The number you entered is odd");
                break;
            default :
                System.out.println("not defined");


        }
    }
}
