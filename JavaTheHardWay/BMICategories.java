import java.util.Scanner;

public class BMICategories {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double bmi, m, k;

    System.out.println("Enter your height in meters: ");
    m = input.nextDouble();
    System.out.println("Enter your weight in kg: ");
    k = input.nextDouble();
    input.close();

    bmi = k / (Math.pow(m, 2));

    System.out.print("BMI category: ");
    if(bmi < 15.0) {
      System.out.println("very severely underweight");
    }
    else if(bmi <= 16.0) {
      System.out.println("severely underweight");
    }
    else if(bmi < 18.5) {
      System.out.println("underweight");
    }
    else if(bmi < 25.0) {
      System.out.println("normal weight");
    }
    else if(bmi < 30.0) {
      System.out.println("overweight");
    }
    else if(bmi < 35.0) {
      System.out.println("moderately obese");
    }
    else if(bmi < 40.0) {
      System.out.println("severely obese");
    }
    else {
      System.out.println("very severely \"morbidly\" obese");
    }
  }
}