package sample;
import java.util.Scanner;
public class StringMethods {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String Name="  Priy  AnsHu ";  //1st method to create a string
        String Surname,result;
        int answer;
        Surname= new String("Moon");  // another method to create a string
        answer=Name.length();//String Method to find the length of strings or you can say to count the index used/occupied in the String
        System.out.println("The Length of the String is "+answer);
        result=Name.toUpperCase();
        System.out.println("The Original name is "+Name+"The name in upper case is "+result);
        result=Surname.toLowerCase();
        System.out.println(result);
        System.out.println(Name.trim());//trims the spaces befor and after the string
        System.out.println(Name.substring(4,9));//it prints the string from start indexpoint (4in this case) to last indexpoint(9in this case)
        System.out.println(Name.substring(4,5));
        System.out.println(Name.replace('u','i'));
        System.out.println(Name.replace("Priy","Sudh"));
        System.out.println(Name.startsWith(" "));//It prints the bollean value true or false(in this case true because it satisfies the condition)
        System.out.println(Name.indexOf('s'));//It prints the index of the given string value
        System.out.println(Surname.indexOf("o",0));//It will print the index value of the given string initiating from the given index(in this case it will initialize from 0)
        System.out.println(Surname.lastIndexOf('o',3));
        if(Name.startsWith(" ")){
            System.out.println(Name.indexOf("H"));
        }
        System.out.println(Name.replace(" ", "_"));
        int z=Name.indexOf("  ");
        if(z==-1) {
            System.out.println("The given string does not contain any space.");
        }else{
            System.out.println("The given string has one or more spaces, one of the space is at index "+z);
        }

    }
}
