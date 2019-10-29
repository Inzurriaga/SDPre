public class CreatingVariables {
  public static void main(String[] args) {
    int x, y, age, year;
    double seconds, e, checking, pi;
    String firstName, lastName, title, middleName, month;

    x = 10;
    y = 400;
    age = 39;
    year = 2019;

    seconds = 4.71;
    e = 2.71882882828282828;
    checking = 1.89;
    pi = 3.14;

    firstName = "Gabriel";
    lastName = "Inzurriaga";
    title = "Mr.";
    middleName = "John";
    month = "October";

    System.out.println("The Variables x contains " + x);
    System.out.println("The value " + y + " is stored in the variable y.");
    System.out.println("The experiment took " + seconds + " seconds");
    System.out.println("A favorite irrational # is Euler's number: " + e);
    System.out.println("Hopefully you have more than $" + checking + "!");
    System.out.println("My name's " + title + firstName + " " + lastName);
    System.out.println("The month is " + month + " and the year is " + year);
    System.out.println("My middle name is " + middleName);
    System.out.println("The value of pi is " + pi);
  }
}