import java.util.Scanner;
public class WhatDay {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the date, month and year:");
        int date,month,yr;
        date=sc.nextInt();
        month=sc.nextInt();
        yr=sc.nextInt();
        int d;
        if(month>12){
            System.out.println("Please Enter valid month");
        }
        int mc=0, dc, cc=0, Ans, Val;
        if(month==1 || month==10)
        {
            mc=1;
        }
        if(month==2||month==3||month==11){
            mc=4;
        }
        if(month==4||month==7){
            mc=0;
        }
        if(month==5){
            mc=2;
        }
        if(month==6){
            mc=5;
        }
        if(month==8){
            mc=3;
        }
        if(month==9|| month==12){
            mc=6;
        }
        int d1, d2, yc;
        d1=yr%10;
        yr=yr/10;
        d2=yr%10;
        yr=yr/10;
        yc=d2*10+d1;

        if(yr==19||yr==31||yr==27||yr==23||yr==15||yr==11||yr==07||yr==03){
            cc=0;
        }
        if (yr==20||yr==32||yr==28||yr==24||yr==16||yr==12||yr==8||yr==04){
            cc=6;
        }
        if (yr == 21||yr==33||yr==29||yr==25||yr==17||yr==13||yr==9||yr==5||yr==1) {

            cc=4;
        }
        if(yr==22||yr==34||yr==30||yr==26||yr==18||yr==14||yr==10||yr==6||yr==2){
            cc=2;
        }
        int quotient;
        quotient=yc/4;
        Ans=date+mc+cc+yc+quotient;
        if(yr/400==0&& month==1||month==2){
            Ans=Ans-1;
            System.out.println("It's a leap year");
        }
        else if(yr%4==0&&month==1||month==2){
            Ans=Ans-1;
            System.out.println("It's a leap year");
        }
        else{

        }
        Val=Ans%7;
        switch (Val){
            case 0:
                System.out.println(" It's a Saturday");
                break;
            case 1:
                System.out.println("It's a Sunday");
                break;
            case 2:
                System.out.println("It's a Monday");
                break;
            case 3:
                System.out.println("It's a Tuesday");
                break;
            case 4:
                System.out.println("It's a Wednesday");
                break;
            case 5:
                System.out.println("It's a Thursday");
                break;
            case 6:
                System.out.println("It's a Friday");
                break;
            default:
                System.out.println("wrong value");
        }


    }
}
