import java.util.Scanner;
public class greater {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the five random numbers : ");
        int a,b,c,d,e;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        e=sc.nextInt();

        int max;
        max=a;
        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }
        if(d>max){
            max=d;
        }
        if (e>max){
            max=e;
        }
System.out.println("The Greatest among all the number is : "+max);
    }
}
