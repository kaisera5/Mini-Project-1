
/*
Mini Project 1
Group #1: Tommy Sanker, Molly Campbell, Andrew Kaiser, Dom Dalessandro. Date: 9/29/2020
*/ 

import java.util.Scanner; 
import java.util.Random; 


class Main {
  public static void main(String[] args) {
    Random r = new Random();
    Scanner initial = new Scanner(System.in);
    int userNum; 

    System.out.println("Welcome to the Guessing Game!");
    System.out.println("Please enter any positive whole number: "); 
    userNum = initial.nextInt();

    int randomNum = r.nextInt(userNum);

    System.out.println("A random number to guess has been generated");
    playGame(userNum, randomNum);
  }

  static void playGame(int theInitial, int theNum) {
    System.out.println("Please guess a number between 0 and " + theInitial);
    int userGuess;

    int attempts;

    attempts = 0;

    while (true) {
      Scanner guess = new Scanner(System.in); 
      userGuess = guess.nextInt(); 

      attempts++; 

      if (userGuess == theNum)  {
        System.out.println("You got it!");
        System.out.println("it took you " + attempts + "attempts to guess the number"); 
        break; 
      }
      if (userGuess < theNum) {
        System.out.println("It's higher than that!");
      }
      if (userGuess > theNum) {
        System.out.println("It's lower than that!");
      }

      System.out.println("Please enter your new guess: ");
    }
  }
}