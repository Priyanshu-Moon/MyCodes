package com.company;
import java.util.Scanner;
public class primeUserFunction {
    public static int Prime(int x){
        int i,d=1;
        for (i=2;i<x;i++){
            d=i%x;
        }
        if(d!=0){
            System.out.println("number is prime");

        }
        else{
            System.out.println("number is not prime");

        }
        return Prime(x);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int res=Prime(num);
    }
}
