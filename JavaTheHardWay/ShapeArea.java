import java.util.Scanner;

public class ShapeArea {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int choice;
    double area = 0;

    System.out.print("Shape Area Calculator version 0.1");
    System.out.print(" (c) 2015 LJTHW Sample Output, Inc.");

    do {
      System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-=-=-=-\n");
      System.out.println("1) Triangle");
      System.out.println("2) Circle");
      System.out.println("3) Rectangle");
      System.out.println("4) Rectangle");
      System.out.println("5) Quit");
      System.out.println("> ");
      choice = input.nextInt();

      if(choice == 1) {
        System.out.print("\n Base: ");
        int b = input.nextInt();
        System.out.print("Height: ");
        int h = input.nextInt();
        area = computeTriangle(b, h);
        System.out.println("The area is " + area);
      }
      else if (choice == 2) {
        System.out.print("\nRadiues: ");
        int r = input.nextInt();
        area = computeCircleArea(r);
        System.out.println("The area is " + area);
      }
      else if(choice == 3) {
        System.out.print("\nLength: ");
        int q = input.nextInt();
        System.out.print("Width: ");
        int w = input.nextInt();
        System.out.println("the area is " + computeRectangleArea(q, w));
      }
      else if(choice == 4) {
        System.out.print("\nSide: ");
        int s = input.nextInt();
        System.out.println("the area is " + computeSquareArea(s));
      }
      else if(choice != 4) {
        System.out.print("Error.");
      }

    } while(choice != 5);
    input.close();
  }
  public static double computeTriangle(int base, int height) {
    double A;
    A = 0.5 * base * height;
    return A;
  }
  public static double computeCircleArea(int radius) {
    double A;
    A = Math.PI * Math.pow(radius, 2);
    return A;
  }
  public static int computeRectangleArea(int length, int width) {
    return (length * width);
  }
  public static int computeSquareArea(int side) {
    return (int)(Math.pow(side, 2));
  }
}