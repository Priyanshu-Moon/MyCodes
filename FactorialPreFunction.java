package com.company;
import java.util.Scanner;
public class FactorialPreFunction {
    public static float Fact(int num){
        int i;
        float fact=1;
        for(i=1;i<=num;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        float res=Fact(num);
        System.out.println("Factorial is "+res);

    }
}
