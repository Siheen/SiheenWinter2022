package java_intermediates.oops.inheritance;

public class Vehicle {

    String typeOfVehicle;
    String typeOfEngine;
    String color;
    String manufacturer;
    String model;


    void accelerate (){
        System.out.println(typeOfVehicle +  " is accelerating");
    }

    void decelerate(){
        System.out.println(typeOfVehicle +  " is decelerating");
    }

    void turnOn(){
        System.out.println(typeOfVehicle + " is turning on");
    }

    void turnOf(){

        System.out.println(typeOfVehicle + " is turning off");
    }





}
