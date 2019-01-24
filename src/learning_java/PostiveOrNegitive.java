package learning_java;


import java.util.Scanner;

public class PostiveOrNegitive {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a Number");
    int number = scan.nextInt();
    scan.close();
    if (number !=0) {
      if(number > 0) {
        System.out.println("Number is positive");
      }else 
        System.out.println("Number is Negitive");
    }else 
      System.out.println("Number is Zero");
  }
}
