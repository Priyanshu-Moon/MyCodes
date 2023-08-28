import java.util.Scanner;
public class Controller{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int num=sc.nextInt();
        int a[]=new int[num+1];
        for (int i = 1; i<=num ; i++){
            System.out.println(" Enter the value ");
            a[i]=sc.nextInt();
        }
        System.out.println("The reversed values are:");
        int i;
        i = num;
        while (i!=0) {
            System.out.println(a[i]);
            i = i - 1;
        }
    }
}