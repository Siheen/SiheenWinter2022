package objectPractice;

public class ObjectPractice {
    //Constructor - is implicit to every class, whether you explicitly declare it or not
    //What does a constructor does? is to create or CONSTRUCT objects of that class

    // This is a constructor
        ObjectPractice(){

    }
    public static void main(String[] args) {
        /*
        when we initialize a variable, the declaration includes;
        1. Data type
        2. Name od the variable
        3. Assignment operator
        4.Value we would like to assign to the variable
         */


        int age=20;

        Cat romeo=new Cat();

        romeo.name="Romeo";
        romeo.age=2;
        romeo.hasFur=true;
        romeo.gender="Male";
        romeo.numOfLegs=4;
        romeo.color="Grey";


        Cat rex= new Cat();
        rex.numOfLegs=4;
        rex.name="Rex";
        rex.gender="Male";
        rex.age=5;
        rex.color="Orange";


        System.out.println(romeo.name);
        System.out.println(rex.name);


        romeo.meows();
        rex.meows();

        System.out.println(romeo);
        System.out.println(rex);

    }
}
