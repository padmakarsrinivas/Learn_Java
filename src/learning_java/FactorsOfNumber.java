package learning_java;

public class FactorsOfNumber {
    public static void main(String[] args){

        int number = 12;

        System.out.println("Factors of the number are ");

        for (int i=1; i <=number; i++){

            if (number%i == 0){
                System.out.print(i +", ");
            }
        }

    }
}
