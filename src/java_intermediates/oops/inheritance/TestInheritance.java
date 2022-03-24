package java_intermediates.oops.inheritance;

import java_intermediates.oops.inheritance.bad_inheritance.Bird;

public class TestInheritance {

    public static void main(String[] args) {

        Car astonMartin = new Car();

        astonMartin.manufacturer=" Aston Martin";
        astonMartin.model="V12 vantage";
        astonMartin.color=" Forest green";
        astonMartin.horsePower= 700;
        astonMartin.numOfCylinders=12;
        astonMartin.numOfDoors=2;
        astonMartin.numOfSeats=4;
        astonMartin.typeOfVehicle="Car";


        astonMartin.turnOn();
        astonMartin.turnOf();
        astonMartin.accelerate();
        astonMartin.decelerate();

        Boat sliceOfLife= new Boat();
        sliceOfLife.typeOfVehicle="Boat";
        sliceOfLife.turnOn();
        sliceOfLife.turnOf();
        sliceOfLife.accelerate();
        sliceOfLife.decelerate();




        Train cta= new Train();
        MotorCycle harely= new MotorCycle();


//        Bird penguin= new Bird();
//        penguin.eat();        //JAVA WILL NOT KNOW WHICH( from which class) WE ARE CALLING. IS IT FROM THE ANIMAL CLASS OR
                                // THE MAMMAL CLASS
        



    }
}
