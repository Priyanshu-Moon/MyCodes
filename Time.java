import java.util.Scanner;
public class Time {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your time and see the magic:");
        int h,m,s;
        h=sc.nextInt();
        m=sc.nextInt();
        s=sc.nextInt();
        if(s==59){
            s=00;
            if(m==59){
                m=0;
                if(h==23){
                    h=00;
                }
                else{
                    h=h+1;
                }
            }
            else{
                m=m+1;
            }
        }
        else{
            s=s+1;
        }
        System.out.println("Congratulation you have wasted your 1 second ;) ");
        System.out.println("Now your time is :\n"+h+"hour " +m+ "minute and" +s+"second");
    }
}
