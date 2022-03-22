package scanner;

import java.util.Scanner;

public class LearnScanner {

    // let's create an object of a class called scanner

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);


        System.out.print("PLEASE ENTER 1ST NUMBER:");
        int x= scanner.nextInt();

        System.out.print("PLEASE ENTER 2ND NUMBER:");
        int y= scanner.nextInt();

        System.out.println("ADDITION:" + doAddition(x,y));
        System.out.println("SUBTRACTION:" +doSubtraction(x,y));
        System.out.println("MULTIPLICATION:" +doMultiplication(x,y));
        System.out.println("DIVISION:" +doDivision(x,y));


        /*
        Advances this scanner past the current line and returns the input that was skipped.
        This method returns the rest of the current line, excluding any line  separator at the end.
        The position is set to the beginning of the next line. this is talking about the .nextLine();
         */
       // System.out.println("ENTER YOUR NAME:");
       // String name= scanner.nextLine();

        //System.out.println(name);
    }

     static  int doAddition(int num1, int num2){
       return num1 + num2;
    }
     static int doSubtraction (int num1, int num2){
         return num1-num2;
     }
     static int doMultiplication (int num1, int num2){
        return num1 * num2;
     }

     static int doDivision (int num1, int num2){
        return num1/num2;
     }
}

