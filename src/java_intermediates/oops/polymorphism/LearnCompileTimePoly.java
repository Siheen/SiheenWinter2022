package java_intermediates.oops.polymorphism;

public class LearnCompileTimePoly {
    /*
     Compile time Polymorphism aka method  Overloading
        creating the same method(same name), but accepting
            1. Different number of parameters
            2. Different data types of parameters OR
            3. Different order of parameters
     */
    public static void main(String[] args) {
        int x=10,  y=5, z=2;
        short a=15, b=100;

        int sumOfTwoNumbers=addition(x,y);
        System.out.println(sumOfTwoNumbers);
    }
    static int addition (int num1, int num2){                   //method overloads by d/t # of parameters
        return num1 + num2;
    }
    static int addition(int num1, int num2,int num3){
        return num1+ num2+num3;

    }

    static int addition(int num1, short num2) {
        return num1+ num2;
                                                                // method overloading by d/t data type parameters
    }

    static int addition(short num1, int num2){       // method overloading by di/t data type order in the parameter
        return num2+num1;
    }



}




