package sample;
import java.util.Scanner;
public class matrix {
    public static void main(String array[]){
        Scanner sc= new Scanner(System.in);
        int i,num=1;
        int a[]= new int [9];
        System.out.println("Enter the dimension of the matrix: ");
        num=sc.nextInt();
        if(num>3){
            System.out.println("Sorry dimension exceeded: ");
        }
        if(num==1){
            System.out.println("Enter the value: ");
            a[0]= sc.nextInt();
            System.out.println(a[0]);
        }
        if(num==2){
            System.out.println("Enter the values:");
            for(i=0;i<4;i++){
                a[i]=sc.nextInt();
            }
            System.out.println("Values in dimension are:");
            System.out.println(" "+a[0]+" "+a[1]);
            System.out.println(" "+a[2]+" "+a[3]);
        }
        if(num==3){
            System.out.println("Enter the values:");
            for(i=0;i<9;i++){
                a[i]=sc.nextInt();
            }
            System.out.println("Values in dimension are:");
            for(i=0;i<3;i++){
                System.out.print(" "+a[i]);
            }
            System.out.println(" ");
            for(i=3;i<6;i++){
                System.out.print(" "+a[i]);
            }
            System.out.println(" ");
            for(i=6; i<9; i++){
                System.out.print(" "+a[i]);
            }

        }
    }

}
