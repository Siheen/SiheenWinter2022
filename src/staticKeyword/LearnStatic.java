package staticKeyword;

import testPackage.Dog;

public class LearnStatic {

    // Static= unchanging, not that doesn't mean it is unchangeable.
     static int x=1;

    public static void main(String[] args) {
        x=10;

        Dog fido= new Dog();
        Dog airBud= new Dog();

        fido.breed="German Shepard";
        airBud.breed="Golder Retriever";

        System.out.println(fido.breed);
        System.out.println(airBud.breed);
        System.out.println(fido.typeOfAnimal);
        System.out.println(airBud.typeOfAnimal);


        Dog.typeOfAnimal="Giraffe";

        System.out.println(fido.typeOfAnimal);
        System.out.println(airBud.typeOfAnimal);

    }
}
