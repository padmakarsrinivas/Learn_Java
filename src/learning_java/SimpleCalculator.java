package learning_java;


import java.util.Scanner;

public class SimpleCalculator {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the 1st Number: ");
    double firstNumber = scan.nextDouble();
    System.out.print("Enter the 2nd Number: ");
    double scoundNumber = scan.nextDouble();
    System.out.print("Enter the Operator +,-,*,% : ");
    char operator = scan.next().charAt(0);
    scan.close();
    double result;

    switch(operator) {
    case '+' : 
      result = firstNumber+scoundNumber;
      System.out.println("Sum of numbers is: " + result);
      break;
    case '-' : 
      result = firstNumber-scoundNumber;
      System.out.println("Difference of numbers is: " + result);
      break;
    case '*' : 
      result = firstNumber*scoundNumber;
      System.out.println("Multiplication of numbers is: " + result);
      break;
    case '/' : 
      result = firstNumber/scoundNumber;
      System.out.println("Division of numbers is: " + result);
      break;
    default: 
      System.out.println("Wrong operator chossen");
    }
  }
}
