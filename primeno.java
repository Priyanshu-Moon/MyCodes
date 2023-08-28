package com.company;
import java.util.Scanner;
public abstract class primeno {

    public static int Prime(int x) {
        int i = 2, d = 0;
        for (i = 2; i < x; i++) {
            if (x % i == 0) {
                d++;
            }
        }
        if (d != 0) {
            System.out.println("" + x + " is not Prime");
        }
        else {
            System.out.println("" + x + " is Prime");
        }

        return x;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int res = Prime(num);
    }
}


