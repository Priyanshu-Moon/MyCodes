
public class EvenSum {
    public static void main(String rgs[]) {
        int i, num=0;
        for (i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                num=num+i;
            }
        }
        System.out.println("Sum of all the odd numbers between 1 to 100 including 100 is: " + num);
    }
}
