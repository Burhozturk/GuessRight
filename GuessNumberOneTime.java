/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessright;

import java.util.Scanner;

public class GuessNumberOneTime {
  public static void main(String[] args) {
    // Generate a random number to be guessed
    int number = (int)(Math.random() * 101);
    int guess=0;
    //Input objekt, så vi kan tage et input
    Scanner input = new Scanner(System.in);
    //udskriver 
    System.out.println("Guess a magic number between 0 and 100");
    //While løkke, som kører så længe guess er anderledes end number
    while(guess !=number)
    {
    // Prompt the user to guess the number
    System.out.print("\nEnter your guess: ");
    //Gemmer indtastningen som guess
    guess = input.nextInt();
      
    if (guess == number)//Hvis guess er det samme number
      System.out.println("Yes, the number is " + number); //Udskriver med nummeret
    else if (guess > number)//Hvis guess er større end number
      System.out.println("Your guess is too high");//Udskriver
    else //Ellers
      System.out.println("Your guess is too low"); //Udskriver   
    }
  }
}
