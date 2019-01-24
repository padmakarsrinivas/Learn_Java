package learning_java;


import java.util.Scanner;

public class SumOfNaturalNumbers {

  public static void main(String[] args) {

    int sum = 0;
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter the starting number: ");
    int startNumber = scan.nextInt();
    System.out.print("Enter the last number: ");
    int lastNumber = scan.nextInt();
    scan.close();

    //    while (lastNumber >=startNumber) {
    //      sum = sum+startNumber;
    //      startNumber++;
    //    }
    //    System.out.println("Sum of the numbers is: " + sum);

    for(int i =startNumber; i<=lastNumber; i++) {
      sum = sum+startNumber;
      startNumber++;
    }
    System.out.println("Sum of the numbers is: " + sum);
  }
}
