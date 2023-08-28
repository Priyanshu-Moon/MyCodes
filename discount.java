import java.util.Scanner;

public class discount {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("This is a discount calculator!!!");
        System.out.println("Enter the origial price:");
        float ori= sc.nextFloat();
        System.out.println("Enter discount figure: ");
        float dis= sc.nextFloat();
        float dp= (ori/100)*dis;
        dp= ori-dp;
        System.out.println("The discounted price is "+dp);

    }
}
