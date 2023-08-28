import java.util.Scanner;

public class day {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the day:");
        String day= sc.next();
        int d=0;
        if(day.equalsIgnoreCase("Sunday")){
            d=1;
        }
        if(day.equalsIgnoreCase("Monday")){
            d=2;
        }
        if(day.equalsIgnoreCase("Tuesday")){
            d=3;
        }
        if(day.equalsIgnoreCase("Wednesday")){
            d=4;
        }
        if(day.equalsIgnoreCase("Thursday")){
            d=5;
        }
        if(day.equalsIgnoreCase("Friday")){
            d=6;
        }
        if(day.equalsIgnoreCase("Saturday")){
            d=7;
        }
        System.out.println("Enter the value:");
        int date=sc.nextInt();
        int temp;
            temp = d + date;
            int i = temp % 7;
            if (temp % 7 != 0) {
                d = i;
            }

        switch (d){
            case 1:
                System.out.println("After "+date+" days the upcoming day will be Sunday");
                break;
            case 2:
                System.out.println("After "+date+" days the upcoming day will be Monday");
                break;
            case 3:
                System.out.println("After "+date+" days the upcoming day will be Tuesday");
                break;
            case 4:
                System.out.println("After "+date+" days the upcoming day will be Wednesday");
                break;
            case 5:
                System.out.println("After "+date+" days the upcoming day will Thursday");
                break;
            case 6:
                System.out.println("After "+date+" days the upcoming day will be Friday");
                break;
            case 7:
                System.out.println("After "+date+" days the upcoming day will be Saturday");
                break;
            default:
                System.out.println("wrong value");
        }

    }
}
