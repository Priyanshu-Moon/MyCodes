import java.util.Scanner;

public class LeapYear {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year: ");
        int yr= sc.nextInt();
        if(yr/400==0){
            System.out.println("The year you enter is a leap year");
        }
        else if(yr%4==0){
            System.out.println("The year you entered is a leap year");
        }
        else{
            System.out.println("The year you entered is not a leap year");
        }
    }
}
