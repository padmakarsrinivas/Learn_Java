package learning_java;


import java.util.Scanner;

public class AreaOfTriangle {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter Width: ");
    double width = scan.nextDouble();
    System.out.println("Enter Length: ");
    double lenght = scan.nextDouble();
    scan.close();
    double area = (width*lenght)/2;
    System.out.println("Area of Triangle is : " +area);
  }
}
