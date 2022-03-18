package varaiblesAndDataTypes;

public class VariableScope {
    //Global or Instance
    int x;

    public static void main(String[] args) {
      printNameAge("Ravi", 20);
        String name= getName();
    }

    static void doSomething(){
        //Local
        int y;
    }

    void doSomethingElse(){
         x=5;
        System.out.println(x);
    }

    void doAnotherThing(){
        x=55;
        System.out.println(x);
    }

        // if we want it to return string

     static  String getName() {
          return "Siheen";
        }
       static void printNameAge(String name, int age) {
           System.out.println("My name is " + name + " and I am " + age + " years old ");
       }


        }


