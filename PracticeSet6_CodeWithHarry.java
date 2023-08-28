package sample;
        /*Write a Java program to find the maximum element in an array.
        Write a Java program to find the maximum element in a Java array.
        Write a Java program to find whether an array is sorted or not*/
import java.util.Scanner;
public class PracticeSet6_CodeWithHarry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = 0;
        float res = 0;
        float temp;
        System.out.println("Enter the range of array:");
        range = sc.nextInt();
        float a[] = new float[range];
        System.out.println("Enter the values of array: ");
        for (int i = 0; i < range; i++) {
            a[i] = sc.nextFloat();
        }
//        program to reverse an array
        System.out.println("The array in reversed order is as follows");
        for (int i = range - 1; i >= 0; i--) {
            System.out.println(a[i]);
        }
//        program to sort the single dimensional array
        for(int i=0; i<range-1; i++){
            for(int j=i+1; j<range; j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("sorted array is:");
        for(int i=0; i<range; i++){
            System.out.println(a[i]);
        }
//        program to find if the given number is present in the array
        System.out.println("Enter the number to check if it's present in the array or not: ");
        float num = sc.nextFloat();
        boolean value = false;
        for (float ele : a) {
            if (num == ele) {
                value = true;
                break;
            }
        }
        if (value) {
            System.out.println("The value is present in the array");
        } else {
            System.out.println("the value is not present in the array");
        }
//        Program to find the average of numbers present in the
        for (float ele : a) {
            res = res + ele;
        }
        res = res / a.length;
        System.out.println("The average of numbers in the array is: " + res);
//        Program to add two matrices of size 2*3
        int c = 0, r = 0;
        System.out.println("Enter the no. of rows and columns of an array");
        r = sc.nextInt();
        c = sc.nextInt();
        int x[][] = new int[100][100];
        int y[][] = new int[100][100];
        int ans[][] = new int[100][100];
        System.out.println("Enter the value of matrix x: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                x[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the value of matrix Y:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                y[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                ans[i][j] = x[i][j] + y[i][j];
            }
        }
        System.out.print("The Addition of both the matrix is: ");
        for (int i = 0; i < r; i++) {
            System.out.println("");
            for (int j = 0; j < c; j++) {
                System.out.print(" " + ans[i][j] + '\t');
            }
        }
        System.out.println("");
//        program to find maximum element in an array
        int max = ans[0][0];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (ans[i][j] > max) {
                    max = ans[i][j];
                }
            }
        }
        System.out.println("The maximum value in the addition of both the matrix is " + max);
//        Multiplication of matrices
        if(r==2&&c==2) {
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    ans[i][j] = ((x[i][j]) * (y[i][j])) + ((x[i][j]) * (y[i + 1][j]));
                }
            }
            System.out.println("The multiplication of matrices x and y of size 2*2 is: ");
            for (int i = 0; i < r; i++) {
                System.out.println("");
                for (int j = 0; j < c; j++) {
                    System.out.print(" " + ans[i][j] + '\t');
                }
            }
        }
        else{
            System.out.println("Thank you for visiting my program");
        }
    }
}
