package com.company;
import java.util.Random;
import java.util.Scanner;

class Game{
    int num1, num2;
    int noOfGuesses =0;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }


    Game(){
        Random rand = new Random();
        this.num1= rand.nextInt(100);
    }
    void takeUserInput(){
        System.out.println("Enter you guess ");
        Scanner sc = new Scanner(System.in);
        this.num2 = sc.nextInt();
    }
    boolean isCorrectNumber(){
        noOfGuesses++;
        if(num2==num1){
            System.out.println("You guessed it in "+getNoOfGuesses()+" times");
            return true;
        }
        else if(num2>num1){
            System.out.println("Guess Something Smaller than this");
        }
        else if(num2<num1){
            System.out.println("Guess Something Bigger than this");

        }
        noOfGuesses++;
        return false;

    }

}
public class Guess_Game {
    public static void main(String[] args) {

        Game g = new Game();
        boolean b = false;
        int i =1;
        while(!b) {
            g.takeUserInput();
            b = g.isCorrectNumber();
            g.setNoOfGuesses(i);
            i++;
        }
    }
}
