package learning_java;

public class FibonacciSeries {

    public static void main(String[] args){

        int number = 10;
        int first = 0;
        int second = 1;
        int sum;

        System.out.print ("Fibonacci Series of " +number + " numbers is ");
        for (int i = 0; i<number; i++){
            System.out.print (first +" ");
            sum = first+second;
            first= second;
            second=sum;
        }
    }
}
