package casting;

public class CastingPractice {



    public static void main(String[] args) {
        short myShort=4386;
        int convertedInt;
        long convertedLong;

        //Widening
        convertedInt=(int)myShort;
        convertedLong=(long)myShort;


        System.out.println(convertedInt);
        System.out.println(convertedLong);


        //Narrowing
        int num1= 50000;
        short shortNum=(short)num1;
        System.out.println(shortNum);

        // 50,000 is outside the range of short
        double myDouble=50.5457866972;
        float myFloat=(float)myDouble;

        System.out.println(myFloat);


        // Primitive to Non-primitive
        int age=25;
        String stringifedAge=String.valueOf(age);
        System.out.println(stringifedAge);
        
        
        //Non-primitive to Primitive---- Wrapper Class

        String myAge="25";
        int myNumbericAge=Integer.valueOf(myAge);
        short myNumbericShortAge= Short.valueOf(myAge);
        System.out.println(myNumbericAge);

        /*
        The Integer class wraps a value of the primitive type int in an object.
        An object of type Integer contains a single field whose type is int.
        In addition, this class provides several methods for converting an int to a String
        and a String to an int,as well as other constants and methods useful when dealing with an int.
         */
    }

}
