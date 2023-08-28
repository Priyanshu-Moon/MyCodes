import java.util.Scanner;

public class reverse {public static void main(String args[]){
    System.out.println("Enter the three digit number:");
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int dig;
    dig=num%10;
    num=num/10;
    int n1,n2,n3;
    n1=dig*100;
    dig=num%10;
    num=num/10;
    n2=dig*10;
    dig=num%10;
    num=num/10;
    n3=dig;
    int ans;
    ans=n1+n2+n3;
    System.out.println("The reversed number is : "+ans);
}

}
