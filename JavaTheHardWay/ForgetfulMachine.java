import java.util.Scanner;

public class ForgetfulMachine {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("what city is the capital of France?");
    input.next();

    System.out.println("What is 6 multiplied by 7?");
    input.nextInt();

    System.out.println("Enter a number between 0.0 and 1.0");
    input.nextDouble();

    System.out.println("Is there anything else you world like to say?");
    input.next();
    input.close();
    // the second question blows up when i type in a string or character.
    // same as the second any string or character cause the profram to crash.
  }
}