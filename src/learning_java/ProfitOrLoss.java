package learning_java;

public class ProfitOrLoss {

    public static void main(String[] args){

        int CP = 100;
        int SP = 100;


        if (CP > SP){
            System.out.println("Loss ");
        }
        else if (CP < SP){
            System.out.println("Profit ");
        }
        else {
            System.out.println("No Profit No Loss ");
        }
    }
}
