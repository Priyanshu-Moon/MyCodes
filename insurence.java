import java.util.Scanner;
public class insurence {
    public static void main(String args[]) {
        String gender, place;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your gender: ");
        gender = sc.nextLine();
        System.out.println("Enter your place: ");
        place = sc.nextLine();
        if (gender.equalsIgnoreCase("Male") & place.equalsIgnoreCase("Village")) {
            System.out.println(" You will get 2 lakhs");
        }
        else if (gender.equalsIgnoreCase("Male") & place.equalsIgnoreCase("City")){
            System.out.println("You will get 5 lakhs");
        }
        else if (gender.equalsIgnoreCase("Female") & place.equalsIgnoreCase("Village")){
            System.out.println("You will get a husband form city with 50000 inr");
        }
        else
        {
            System.out.println("You will get only get 10000 inr");
        }
    }
}