import java.util.Scanner;

public class Objective4Lab3 {
  public static void main(String[] args) {
    int num;
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter a number: ");
    num = input.nextInt();
    input.close();
    if(num > 0) {
      System.out.println("The number is positive");
    }else if(num < 0) {
      System.out.println("The number is negative");
    }else {
      System.out.println("The number is 0");
    }
  }
}