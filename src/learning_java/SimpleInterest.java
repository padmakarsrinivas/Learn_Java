package learning_java;

public class SimpleInterest {

    public static void main(String[] args){

        int Principal = 1000;
        int Rate_of_Interest = 5;
        int Time_Period = 2;
        int SI;

        SI = (Principal * Rate_of_Interest * Time_Period)/100;

        System.out.println("Simple Interest for the amount "+Principal+" with interest at "
                +Rate_of_Interest+ "% for time period "+Time_Period+" year(s) is " +SI);
    }
}
