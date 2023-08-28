import java.util.Scanner;

public class Eligiblity {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Are you married? Type yes or no: ");
        String status = sc.nextLine();
        if (status.equalsIgnoreCase("Yes")) {
            System.out.println("Congratualtions you're eligible for the Insurance.");
        } else {
            System.out.println("Enter your Gender and your age: ");
            String Gender=sc.nextLine();
            int age=sc.nextInt();
            if (Gender.equalsIgnoreCase("Male") & age > 30) {
                System.out.println("Congrats you're eligible for the Insurance. ");
            } else if (Gender.equalsIgnoreCase("Female") & age > 25) {
                System.out.println("Congrats Girl you're eligible for the Insurance.");
            } else {
                System.out.println("Sorry you are not eligible.");
            }

        }
    }
}


