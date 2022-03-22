package staticKeyword;

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
  /*
  NOTE: We should always call a static member of classes by using ClassName, and not using references,
        such as we see below. The correct way to call 'typeOfAnimal' would be 'Dog.typeOFAnimal', since it is static
        and belongs to the class, and not to the instance of the class.
   */
    }
}
