package sample;

import java.util.Scanner;

public class PracticeSet4_CodeWithHarry {
    public static void main(String args[]){
//        Program to print the following pattern:
//        *****
//        ****
//        ***
//        **
//        *
        for(int i=5;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
//        Program to take the number from user and print the sum of all the even numbers from 0 to the given number
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int res=0;
        for(int i=num; i>=0; i--){
            if(i%2==0){
                res=res+i;
            }
        }
        System.out.println("The sum of all the even numbers from 0 to"+num+" is: "+res);
//        Write a program to print a multiplication table of n:\
        for(int i=1;i<=10;i++){
            System.out.println(num*i);
        }
//        Program to print a reverse multiplication table of number given:
        for(int i=10; i>=1; i--){
            System.out.println(num*i);
        }
//        factorial of the given number
        int fact=1;
        for(int i=1; i<=num; i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+num+" is "+fact);
//        creation of array and introduction of for each loop
        int a[]={1,2,3,4,5};
        for (int ele: a){
            System.out.println(ele);
        }
    }
}
