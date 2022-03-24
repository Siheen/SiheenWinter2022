package java_intermediates.oops.inheritance;

public class Car extends Vehicle{

    int numOfWheels;
    int numOfDoors;
    String typeOfTransmission;
    int numOfCylinders;
    int numOfSeats;
    int horsePower;


    void turnLeft(){
        System.out.println("Car is turning left");
    }

    void turnRight(){
        System.out.println("Car is turning right");
    }

    void turnOnHeadLight(){
        System.out.println("Car's headlights turns on");
    }

    void turnOffHeadLight(){
        System.out.println("Car's headlight turns off");
    }

    void indicateRightTurn(){
        System.out.println("Car's right indicator is blinking");
    }

    void indicateLeftTurn(){
        System.out.println("Car's left indicator is blinking");
    }
}
