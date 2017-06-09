package evenodd;

import java.util.Scanner;
import java.util.Random;

public class EvenOdd {
 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Random rand = new Random();
       int numberToGuess= rand.nextInt(6);
       int numberOfTries = 0;
       Scanner input = new Scanner(System.in);
       int guess;
       boolean win = false;
       while(win = false){
           System.out.println("guess a number between 1-6");
           guess = input.nextInt();
           numberOfTries++;
          
           if(guess == numberToGuess){
               win = true;
            
           }
           else if (guess > numberToGuess){
               System.out.println("your guess is too hig");
           }
           else if (guess < numberToGuess){
           System.out.println("your guess is too low");
         }
       }
       System.out.println("you win!");
       System.out.println("im sorry but the number was " + numberToGuess);
       System.out.println("it took you " + numberOfTries +" tries");
    }
       
    
}
