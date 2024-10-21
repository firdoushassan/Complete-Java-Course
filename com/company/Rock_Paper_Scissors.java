package com.company;
import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissors {
    public static void main(String[] args) {
        System.out.println("Rock Paper Scissors");
        System.out.println("Enter R for Rock");
        System.out.println("Enter P for Paper");
        System.out.println("Enter S for Scissors");
        int limit = 3, c = 0, y = 0,t=0, i;
        for (i = 0; i < 5; i++) {
            Random rand = new Random();
            String choice;
            int ch = rand.nextInt(limit);
            if (ch == 0) {
                choice = "R";
            } else if (ch == 1) {
                choice = "P";
            } else {
                choice = "S";
            }
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your Choice");
            String MyChoice = sc.nextLine();
            if(MyChoice.equals("R") || MyChoice.equals("S") || MyChoice.equals("P")){
            if (choice.equals(MyChoice)) {
                System.out.println("Tied");
                t = t+1;
            } else if (choice.equals("R") && MyChoice.equals("S") || choice.equals("S") &&
                    MyChoice.equals("P") || choice.equals("P") && MyChoice.equals("R")) {
                System.out.println("Computer Won");
                c = c + 1;
            } else if (choice.equals("S") && MyChoice.equals("R") || choice.equals("P") &&
                    MyChoice.equals("S") || choice.equals("R") && MyChoice.equals("P")) {
                System.out.println("You Won");
                y = y + 1;
            }
        }else{
                System.out.println("Wrong Input! Please Enter correct one");
                i--;
            }
        }
            System.out.println("You won "+y+ " times");
            System.out.println("Computer won "+c+ " times");
            System.out.println("Tied : "+t+ " times");
            if(y>c){
                System.out.println("!!!!!!!CONGRATULATIONS!!!!!!!");
            }else{
                System.out.println("!!!!!!!HAHAHAHAhaha!!!!!!!!\nA COMPUTER IS BETTER THAN YOU");
            }
    }
    }
