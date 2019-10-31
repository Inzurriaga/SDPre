import java.util.Scanner;

public class SafeSquareRoot {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double x, y;
    String reply;

    System.out.println("Are you ready!");
    reply = input.next();
    
    while(!reply.equals("YES!")) {
      System.out.println("How about now?");
      reply = input.next();
    }

    System.out.print("Give me a number, and I'll find it's square root. ");
    System.out.print("(No negative, please.)");
    x  = input.nextDouble();

    while(x < 0) {
      System.out.println("I won't take the square root of a negative.");
      System.out.print("\nNew number: ");
      x = input.nextDouble();
    }

    y = Math.sqrt(x);

    System.out.println("The square root of " + x + " is " + y);
  }
}