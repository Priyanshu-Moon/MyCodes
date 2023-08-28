import java.util.Scanner;

public class Electricity {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the electricity unit: ");
        double unit=sc.nextDouble();
        if(unit<=100){
            unit=unit*0.80;
        }else if(unit>100 & unit<=200){

            unit=unit*1.20;
        }else{
            unit=unit*1.50;
        }
        System.out.println("The charge for your unit consumption is:"+unit);
    }
}
