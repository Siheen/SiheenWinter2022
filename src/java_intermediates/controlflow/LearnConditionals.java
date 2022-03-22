package java_intermediates.controlflow;

public class LearnConditionals {


    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        System.out.println(doSubtraction(x, y));

    }
    static int doSubtraction(int num1, int num2) {
        int difference;

        if (num1 >= num2) {
            return num1 - num2;
        }

            return num2 - num1;


    }

}





