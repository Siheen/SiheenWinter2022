package methods;

public class MethodeChallenge {
    /*
    Challenge- create  a class called "Calculator". Within the class, you need to define 4 methods
        - one for addition
        - one for subtraction
        - one for multiplication
        Each of these methods need to be parameterized and do what they say. you can choose to have the methods return a value or just
        perform the operation and printout the result.
                    Lastly, call those 4 methods from another class, in the main method.
     */


    public static void main(String[] args) {
        Calculator obj1= new Calculator();

        obj1.addition();
        obj1.subtraction();
        obj1.multiplication();
        obj1.division();
    }
}
