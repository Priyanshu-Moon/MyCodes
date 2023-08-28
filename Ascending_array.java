package sample;
import java.util.Scanner;
public class Ascending_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, temp;
        System.out.println("Enter the size of an array:");
        num = sc.nextInt();
        int a[] = new int[num];
        int b[] = new int[num];
        System.out.println("Enter the values in the array: ");
        for (int i = 0; i < num; i++) {
            a[i] = sc.nextInt();
        }
        for(int i=0; i<num; i++){
            for(int j=i+1; j<num; j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }for(int i=0; i<num; i++) {
            System.out.println(a[i]);
        }
    }
}
