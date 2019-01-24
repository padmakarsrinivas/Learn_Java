package learning_java;


import java.util.Scanner;

public class LargestOfThreeNumbers {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter 1st number:");
    int firstNumber = scan.nextInt();
    System.out.println("Enter 2nd number:");
    int secondNumber = scan.nextInt();
    System.out.println("Enter 3rd number:");
    int thirdNumber = scan.nextInt();
    scan.close();
    int temp, result;
    temp = (firstNumber>secondNumber ? firstNumber:secondNumber);
    result = (thirdNumber>temp ? thirdNumber:temp);
    System.out.println("Largest Number is: " + result);
  }
}
