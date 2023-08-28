package sample;
import java.util.Scanner;
public class addition_matrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, col, row;
        System.out.println("what operation do you want to perform: ");
        String operation = sc.nextLine();
        System.out.println("Enter the row and column of matrix a: ");
        row = sc.nextInt();
        col = sc.nextInt();
        int a[][] = new int[row][col];
        int b[][] = new int[row][col];
        int res[][] = new int[row][col];
        System.out.println("Enter the values of matrix A: ");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the row and column of matrix B: ");
        row = sc.nextInt();
        col = sc.nextInt();
        System.out.println("Enter the values of matrix b: ");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        if(operation.equalsIgnoreCase("Addition")) {
            for (i = 0; i < row; i++) {
                for (j = 0; j < col; j++) {
                    res[i][j] = a[i][j] + b[i][j];
                }
            }
            System.out.println("Addition of both the matrices is: ");
            for (i = 0; i < row; i++) {
                System.out.print('\n');
                for (j = 0; j < col; j++) {
                    System.out.print(" " + res[i][j]);
                }
            }
        }
        if(operation.equalsIgnoreCase("Subtraction")){
            for (i = 0; i < row; i++) {
                for (j = 0; j < col; j++) {
                    res[i][j] = a[i][j] - b[i][j];
                }
            }
            System.out.println("Subtraction of both the matrices is: ");
            for (i = 0; i < row; i++) {
                System.out.print('\n');
                for (j = 0; j < col; j++) {
                    System.out.print(" " + res[i][j]);
                }
            }
        }
    }
}
