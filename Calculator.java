import java.util.Scanner;
public class Calculator {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the two numbers :");
        float a,b,res;
        a=sc.nextFloat();
        b=sc.nextFloat();
        System.out.println("Enter which operation you want to perform(div/mul,sub,add)");
        String op;
        op=sc.next();
        switch (op){
            case "div" :
                res=a/b;
                System.out.println("Answer is "+res);
                break;
            case "mul" :
                res=a*b;
                System.out.println("Answer is "+res);
                break;
            case "add" :
                res= a+b;
                System.out.println("Answer is "+res);
                break;
            case "sub" :
                res= a-b;
                System.out.println("Answer is "+res);
                break;
            default:
                System.out.println("No match");
            }
        }

    }

