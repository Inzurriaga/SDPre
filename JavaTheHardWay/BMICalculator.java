import java.util.Scanner;

public class BMICalculator {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double f, i, p, bmi;

    System.out.println("Your height (feet only): ");
    f = input.nextDouble();

    System.out.println("Your height (inches): ");
    i = input.nextDouble();

    System.out.println("Your weight in pounds: ");
    p = input.nextDouble();

    bmi = (p / Math.pow((f*12)+i, 2))*703;

    System.out.println("Your BMI is " + bmi);
    input.close();
  }
}