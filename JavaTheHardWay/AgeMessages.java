import java.util.Scanner;

public class AgeMessages {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int age;

    System.out.println("How old are you?");
    age = input.nextInt();
    input.close();

    System.out.println("You are: ");
    if(age < 13) {
      System.out.println("\ttoo young to create a Facebook account");
    }
    if(age >= 13) {
      System.out.println("\told enough to create a Facebook account");
    }
    if(age < 16) {
      System.out.println("\ttoo young to get a driver's license");
    }
    if(age >= 16) {
      System.out.println("\told enough to get a driver's license");
    }
    if(age < 18) {
      System.out.println("\ttoo young to get a tattoo");
    }
    if(age >= 18) {
      System.out.println("\told enough to get a tattoo");
    }
    if(age < 21) {
      System.out.println("\ttoo young to drink alcohol");
    }
    if(age >= 21) {
      System.out.println("\told enough to drink alcohol");
    }
    if(age < 35) {
      System.out.println("\ttoo young to run for President of the U.S.");
      System.out.println("\t\t(How sad!)");
    }
    if(age >= 35) {
      System.out.println("\told enough to run for President of the U.S.");
      System.out.println("\t\t(Amazing!)");
    }
    if(age < 65) {
      System.out.println("too young to retire!");
    }
    if(age > 65) {
      System.out.println("You are old enough to retire!");
    }
    // nothing prints if you type a number higher than 35

  }
}