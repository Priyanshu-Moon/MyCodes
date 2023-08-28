package sample;
import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        int upperbound=3, value=0, c=0, u=0;
        String user, name;
        System.out.println("welcome to the Game "+'\n'+"The Game will be of @3 rounds");
        System.out.println('\t'+ "Let the Game begins!!!! "+'\n' +'\t'+"*_*");
        System.out.println("Enter your name Champ: ");
        name=sc.nextLine();
        System.out.println("Rock, Paper, Scissors 123 go");
        for(int i=0; i<3; i++) {
            System.out.println('\t'+"Play your chance, Type what you wish to throw towards the oponent: ");
            user=sc.nextLine();
            if(user.equalsIgnoreCase("Rock")){
                value=0;
            }
            else if(user.equalsIgnoreCase("Paper")){
                value=1;
            }else if(user.equalsIgnoreCase("Scissors")){
                value=2;
            }
            else{
                System.out.println("Warning!! Please throw the proper element...");
            }
            int bot = r.nextInt(upperbound);
            switch(bot){
                case 0:
                {
                    System.out.println("Rock");
                    break;
                }
                case 1:
                {
                    System.out.println("Paper");
                    break;
                }
                case 2:
                {
                    System.out.println("Scissors");
                    break;
                }
                default:
                {
                    System.out.println("I gave up");
                }
            }
        if(value==bot){
            System.out.println("It's a tie");
        }
            if (value == 1 && bot == 0) {
                System.out.println("The winner of this round is " + name + "You've got the point");
                u = u + 1;
                System.out.println("Bot=" + c + " " + name + "=" + u);
            } else if (bot == 1 && value == 0) {
                System.out.println("ooh! you've lose the point");
                c = c + 1;
                System.out.println("Bot=" + c + " " + name + "=" + u);
            } else if (value == 1 && bot == 2) {
                System.out.println("ooh! you've lose the point");
                c = c + 1;
                System.out.println("Bot=" + c + " " + name + "=" + u);
            } else if (bot == 1 && value == 2) {
                System.out.println("The winner of this round is " + name + "You've got the point");
                u = u + 1;
                System.out.println("Bot=" + c + " " + name + "=" + u);
            } else if (value == 0 && bot == 2) {
                System.out.println("The winner of this round is " + name + "You've got the point");
                u = u + 1;
                System.out.println("Bot=" + c + " " + name + "=" + u);
            } else if (bot == 0 && value == 2) {
                System.out.println("ooh! you've lose the point");
                c = c + 1;
                System.out.println("Bot=" + c + " " + name + "=" + u);
            } else if (value == 0 && bot == 1) {
                System.out.println("ooh! you've lose the point");
                c = c + 1;
                System.out.println("Bot=" + c + " " + name + "=" + u);
            } else if (bot == 0 && value == 1) {
                System.out.println("The winner of this round is " + name + "You've got the point");
                u = u + 1;
                System.out.println("Bot=" + c + " " + name + "=" + u);
            } else if (value == 2 && bot == 1) {
                System.out.println("The winner of this round is " + name + "You've got the point");
                u = u + 1;
                System.out.println("Bot=" + c + " " + name + "=" + u);
            } else if (bot == 2 && value == 1) {
                System.out.println("ooh! you've lose the point");
                c = c + 1;
                System.out.println("Bot=" + c + " " + name + "=" + u);
            } else if (value == 2 && bot == 0) {
                System.out.println("ooh! you've lose the point");
                c = c + 1;
                System.out.println("Bot=" + c + " " + name + "=" + u);
            } else if (bot == 0 && value == 2) {
                System.out.println("The winner of this round is " + name + "You've got the point");
                u = u + 1;
                System.out.println("Bot=" + c + " " + name + "=" + u);
            }
        }

        if(u>c){
            System.out.println("Congrotulation you're the man of the match, The Unbeatable...");
        }
        else if(u<c){
            System.out.println("Hey Looser..");
        }else if (u==c){
            System.out.println("We got a tie here!!");
        }
    }
}
