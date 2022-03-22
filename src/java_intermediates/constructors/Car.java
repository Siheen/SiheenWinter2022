package java_intermediates.constructors;

public class Car {

    //A class is the blue-print of real-world object. what does that mean?
    //Means that classes have states (attributes) and behaviors( methods) of that real-world object.

    Car(String make, String model, int year){
            this.make=make;
            this.model=model;                       // we are assigning a value out here.
            this.year=year;

    }
    //Overloading Construct, one way to do it is to change the order of the data type as seen below

        Car(String make, int year, String color){
            this.make=make;
            this.year=year;
            this.color=color;
    }

    Car(int year, String make, String model, String color){
            this.year=year;
            this.make=make;
            this.model=model;
            this.color=color;
    }

    // what are these down there ?  if the above make, model, and int are parameters, these are Instances variables
    String make;
    String model;
    String color;
    int year;
    public static String typeOfVehicle="Car";          // this belongs to the class itself because its static





    void accelerates(){


    }

    void decelerate(){


    }

    void turnRight(){


    }
}
