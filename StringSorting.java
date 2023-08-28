package sample;
import java.util.Scanner;
public class StringSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Name;
        int countv=0,countc = 0, length=0, space=0,total,num=0;
        System.out.println("Type something here: ");
        Name=sc.nextLine();
        length=Name.length();
        String vowel[]=new String[length];
        for(int i=0; i<length; i++){
            if(Name.substring(i,i+1).equalsIgnoreCase("a")||Name.substring(i,i+1).equalsIgnoreCase("e")||Name.substring(i,i+1).equalsIgnoreCase("i")||Name.substring(i,i+1).equalsIgnoreCase("o")||Name.substring(i,i+1).equalsIgnoreCase("u")){
                countv=countv+1;
                vowel[num]=Name.substring(i,i+1);
                num++;
            }else if(Name.substring(i,i+1).equals(" ")){
                space++;
            }else{
                countc=countc+1;
            }
        }
        total=countc+countv;
        System.out.println("The Lenght of the String is: "+length+" and the total alphabets used in the string are: "+total);
        System.out.println("The total number of vowels used in the string are: "+countv);
        System.out.println("The vowels used in the string are: "+vowel);//something's wrong here! yet to find out what's wrong in it..
        System.out.println("The total number of consonents used in the string are: "+countc);
        System.out.println("The total number of spaces used in the string are: "+space);
        space=space+1;
        System.out.println("The Total of words used in the string are: "+space);

    }
}
