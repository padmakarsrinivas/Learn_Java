package learning_java;


import java.util.Scanner;

public class ReadInteger {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter integer:");
    int num =scan.nextInt();
    scan.close();
    System.out.println("The number entered by user: "+num);
  }
}
