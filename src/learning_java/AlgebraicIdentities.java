package learning_java;

public class AlgebraicIdentities {

    public static void main(String[] arg){
        int a = 1;
        int b = 2;
        int result;

        /*A + B Whole Square */
        result =(a*a)+(b*b)+2*a*b;

        System.out.println("A + B Whole Square is " +result);

        /*A - B Whole Square */
        result =(a*a)+(b*b)-2*a*b;

        System.out.println("A - B Whole Square is " +result);

        /* A Square - B Square */
        result =(a+b)*(a-b);

        System.out.println("A Square - B Square is " +result);

        /*(A + B) Cube */
        result =(a*a*a)+(b*b*b)+(3*a*b*(a+b));

        System.out.println("A + B Whole Cube is " +result);
    }
}
