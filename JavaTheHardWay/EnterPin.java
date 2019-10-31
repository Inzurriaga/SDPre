import java.util.Scanner;

public class EnterPin {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int pin, entry;
    String password;

    pin = 12345;

    System.out.println("WELCOME TO THE BANK OF JAVA.");
    System.out.print("ENTER YOUR PASSWORD: ");
    password = input.next();

    while(!password.equals("hello")) {
      System.out.println("\nINCORRECT PASSWORD. TRY AGAIN.");
      System.out.print("ENTER YOUR PASSWORD: ");
      password = input.next();
    }

    System.out.print("ENTER YOUR PIN: ");
    entry = input.nextInt();

    while(entry != pin) {
      System.out.println("\nINCORRECT PIN. TRY AGAIN.");
      System.out.print("ENTER YOUR PIN: ");
      entry = input.nextInt();
    }
    input.close();

    System.out.println("\nPIN ACCEPTED. YOUR ACCOUNT BALANCE IS $1.00");
  } 
}