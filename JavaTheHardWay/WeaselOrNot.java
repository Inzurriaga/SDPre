import java.util.Scanner;

public class WeaselOrNot {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String word;
    boolean yep, nope;

    System.out.println("Type the word \"weasel\", please.");
    word = input.next();

    yep = "weasel".equals(word);
    nope = !word.equals("weasel");

    System.out.println("You Typed was requested: " + yep);
    System.out.println("You ignored polite instructions: " + nope);
  } 
}