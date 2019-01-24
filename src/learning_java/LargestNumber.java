package learning_java;


public class LargestNumber {
  public static void main(String[] args) {
    int firstNumber = 100;
    int secondNumber = 50;
    int thirdNumber = 30;
    if (firstNumber>secondNumber && firstNumber >thirdNumber) {
      System.out.println("First Number is the largest");
    }else if (secondNumber>firstNumber && secondNumber >thirdNumber) {
      System.out.println("Second Number is the largest");
    }else 
      System.out.println("Third Number is the largest");
  }
}
