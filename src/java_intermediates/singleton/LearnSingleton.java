package java_intermediates.singleton;

public class LearnSingleton {

    static LearnSingleton learnSingleton;               //this is a global variable

    private LearnSingleton() {                          // this is the constructor, and it doesn't have a return type

    }

    /*
    A singleton is a class. Singleton design allows ONLY ONE object to be created of that class
        Steps:
            1. Declare a static instance of the class, as a global var
            2. Declare the constructor as PRIVATE
            3. Create getInstance() method
     */

    public static LearnSingleton getInstance() {
        if (learnSingleton == null) {                           // this is a conditional statement
            learnSingleton = new LearnSingleton();
        }

        return learnSingleton;
    }


}
