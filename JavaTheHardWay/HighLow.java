import java.util.Scanner;

public class HighLow {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int secret, guess;

    secret = 1 + (int)(100 * Math.random());

    System.out.println("I'm thinking of a number between 1-100");
    System.out.println("Try to guess it!");
    System.out.print("> ");
    guess = input.nextInt();

    while(secret != guess) {
      if(guess < secret) {
        System.out.print("Sorry your guess is too low.");
      } 
      else {
        System.out.print("Sorry your guess is too High. ");
      }
      System.out.print("try again. \n>");
      guess = input.nextInt();
    }
    input.close();
    System.out.println("Yout guessed it! What are the odds?!?");
  }
}