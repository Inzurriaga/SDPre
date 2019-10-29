import java.util.Scanner;

public class RudeQuestions {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String name, color;
    int age;
    double weight, income;

    System.out.println("Hello. What is your name?");
    name = input.next();

    System.out.println("Hi, " + name + "! How old are you?");
    age = input.nextInt();

    System.out.println("So you're " + age + ", eh? That's not very old.");
    System.out.println("How much do you weigh, " + name + "?");
    weight = input.nextDouble();

    System.out.println(weight + "! Better keep that quiet!!");
    System.out.println("Finally what's your income, " + name + "?");
    income = input.nextDouble();

    System.out.print("Hopefully that is " + income + " per hour");
    System.out.println(" and not per year!");
    System.out.print("Well, thanks for answering my rude questions, ");
    System.out.println(name + ".");

    System.out.println("what is your favorite color?");
    color = input.next();
    System.out.println(color + " is an ugly color.");
    input.close();


    // doubles can accept integers because it just view it having decimals just there zeros
    // numbers can be characters and a string a just multiple characters put together
    // for the number data any string or character cause the program to crash but for string i dont know
  }
}