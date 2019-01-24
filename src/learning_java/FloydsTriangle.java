package learning_java;


import java.util.Scanner;

public class FloydsTriangle {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("Enter no of rows: ");
    int count = scan.nextInt();
    scan.close();
    int num=1;
    System.out.println("Floyd's Triangle of " +count+ " rows is ");
    for (int i = 0;i <count; i ++) {

      for (int j =0;j<=i;j++) {

        System.out.print(num+ " ");
        num++;
      }
      System.out.println();
    }
  }
}
