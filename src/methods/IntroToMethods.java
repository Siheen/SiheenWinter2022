package methods;

public class IntroToMethods {


    /* Methods
        -There are 2 types of methods
            1. Methods that perform an action and don't return anything.
            2. Methods that perform some sort of operation/action and return some sort of value
      -Method signatures or method declarations contain certain things:
            1. Access Modifier(Optional)
            2. Static (Optional)
            3. Return type (mandatory)
            4. Method Name (mandatory)
            5. Parenthesis/Parameters (mandatory)
            6. Code Block (Mandatory)


        */
    public static void main(String[] args) {
            doSomething();
            doSomethingElse();
            String z =doSomethingElse();
        System.out.println(z +5);


    }
    static void doSomething(){
        System.out.println("This method is doing something");
    }

    static String doSomethingElse(){
        String x="5";
        String y="10";

        return x+y;
    }
}
