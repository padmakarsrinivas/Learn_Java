package learning_java;


import java.util.Scanner;

public class VowelOrConsonant {

  public static void main(String[] args) {
    System.out.println("Enter Charecter: ");
    Scanner scan = new Scanner(System.in);
    char charecter = scan.next().charAt(0);
    scan.close();
    switch (charecter)
    {
    case 'a':
      System.out.println("Charecter is vowel: "+charecter);
      break;
    case 'e':
      System.out.println("Charecter is vowel: "+charecter);
      break;
    case 'i':
      System.out.println("Charecter is vowel: "+charecter);
      break;
    case 'o':
      System.out.println("Charecter is vowel: "+charecter);
      break;
    case 'u':
      System.out.println("Charecter is vowel: "+charecter);
      break;
    default: 
      System.out.println("Charecter is Consonant: "+charecter);
    }
  }
}
