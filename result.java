import java.util.Scanner;

public class result {
    public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
           System.out.println("Enter how  your marks of each subject: ");
            float m1, m2, m3;
            m1=sc.nextFloat();
            m2=sc.nextFloat();
            m3=sc.nextFloat();
            float prcnt= ((m1+m2+m3)/300)*100;
            if (prcnt>=80 & prcnt<=100){
                System.out.println("Congratulations you have passed with detention.");
            }
            else if (prcnt>=60 & prcnt<80){
                System.out.println("Congrats you've passed with first class.");
            }
            else if (prcnt>= 35 & prcnt<60){
                System.out.println("You have passed in second class.");
            }
            else{
                System.out.println("Sorry, You have failed in the exam");
            }
            float cgpa= (m1+m2+m3)/30;
            System.out.println("Your percentage is "+prcnt +" and your cgpa is "+cgpa);
    }

}
