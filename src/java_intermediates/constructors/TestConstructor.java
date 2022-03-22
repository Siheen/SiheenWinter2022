package java_intermediates.constructors;

public class TestConstructor {

    public static void main(String[] args) {

        Car bmw=new Car("BMW", "MS CS",2022);
        Car lamborghini=new Car("Lamborghini", 2022, "red");
        Car nissan= new Car(2022,"Nissan","Nismo GTR", "White");



        System.out.println(bmw.model);
        System.out.println(bmw.make);
        System.out.println(bmw.year);
        System.out.println(Car.typeOfVehicle);

        System.out.println();
        System.out.println(lamborghini.year);
        System.out.println(lamborghini.make);
        System.out.println(lamborghini.color);
        System.out.println(Car.typeOfVehicle);

        System.out.println();
        System.out.println(nissan.year);
        System.out.println(nissan.make);
        System.out.println(nissan.model);
        System.out.println(nissan.color);
        System.out.println(Car.typeOfVehicle);
    }


}
