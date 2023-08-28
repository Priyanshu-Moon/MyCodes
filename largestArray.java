package sample;
import java.util.Scanner;
public class largestArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int num, larg, smal;
        num=sc.nextInt();
        int a[]=new int[num+1];
        System.out.println("Enter the value in array");
        for(int i=1; i<=num; i++){
            a[i]=sc.nextInt();
        }
        larg=a[1];
        smal=a[1];
        for(int i=1; i<num; i++) {
            if (larg < a[i]) {
                larg = a[i];
            }
            if(a[i] < smal){
                smal=a[i];
            }
        }

            System.out.println("Largest no. among the array numbers is: "+larg+" and the smallest one is "+smal);

    }
}
