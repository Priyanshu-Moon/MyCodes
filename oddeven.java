package sample;
import java.util.Scanner;
public class oddeven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num, j=0, k=0, countE=0, countO=0;
        System.out.println("Enter the size of array: ");
        num=sc.nextInt();
        int a[]=new int[num];
        int eve[]=new int[10];
        int odd[]=new int[10];
        System.out.println("Enter the values in array: ");
        for(int i=0; i<num; i++){
            a[i]=sc.nextInt();
        }
        for(int i=0; i<num; i++){
            if(a[i]%2==0){
                eve[j]=a[i];
                j=j+1;
                countE=countE+1;
            }
            else{
                odd[k]=a[i];
                k=k+1;
                countO=countO+1;
            }
        }
        System.out.println("Even array is: ");
        for(j=0;j<countE;j++){
            System.out.println(eve[j]);
        }
        System.out.println("Odd array is:");
        for(k=0;k<countO;k++){
            System.out.println(odd[k]);
        }

    }
}
