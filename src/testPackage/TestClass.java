package testPackage;


import methods.accessModifiers.AccessModifiers;
import org.w3c.dom.ls.LSOutput;

/* What is a class?
    - A class is a blueprint or representation of a real-world object.
    -Any object can be described using its attributes/characteristics, and the methods that object can perform

 */
public class TestClass {

// Global( Instance variables- accessible by all methods of the class
    static int a=15;
    static int b=5;
    static int y=5;
    static int x=100;

    public static void main(String[] args) {
        methodOne();
        AccessModifiers.printName();

    }
 static void methodOne(){
//Local Variable- restricted to just the method that it is declared inside of
     int x=40;
     System.out.println(a+TestClass.x);
 }
 static void methodTwo(){

     System.out.println(b);
 }

 static void methodThree(){
     System.out.println(a);
 }
 static void methodFour(){
    System.out.println(b);
}
}