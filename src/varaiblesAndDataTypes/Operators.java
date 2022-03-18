package varaiblesAndDataTypes;

public class Operators {
    // Assignment Operators
    // Comparison Operators
    // Logical Operators


      public static void main(String[] args) {
          int x = 5;
          int y = 10;
  /*
     Assignment Operators- used to assign a value to a variable
           e.g -Equal sign (=)
               - Incremental operator (+=)
               - Decremental operator (-=)
             */

//          System.out.println(x);
//          x=x+1;
//          System.out.println(x);
//          x+=1;
//          System.out.println(x);
//          x-=5;
//          System.out.println(x);
//          x*=3;
//          System.out.println(x);

        /*
        Comparison operators- used to check if 2 values are equal or not
           - Equal to (==)
           -is not Equal to (!=)
           -Greater than(>)
           -Less than (<)
           -less than or equal to (<=)
         */

          boolean isEqual;
          boolean isNotEqual;
          boolean isGreaterThan;
          boolean isGreaterThanEqual;
          boolean isGreaterThanOrEqualTo;
          boolean isLessThan;
          boolean isLessThanOrEqualTO;

          isEqual = x == y;
          System.out.println(isEqual);

          isNotEqual = x != y;
          System.out.println(isNotEqual);

          isGreaterThan = x > y;
          System.out.println(isGreaterThan);

          isGreaterThanOrEqualTo = x >= y;
          System.out.println(isGreaterThanOrEqualTo);

          isLessThan = x < y;
          System.out.println(isLessThan);

          isLessThanOrEqualTO = x <= y;
          System.out.println(isGreaterThanOrEqualTo);

    /* Logical Operators- used to logically add two conditions( And, or)
                        - And(&&)
                        -Or (||)
*/

          boolean twoConditions;
          twoConditions = isLessThan && isLessThanOrEqualTO;
          System.out.println(twoConditions);
          // if i want a new line then it will be written as
          System.out.println("\n" + twoConditions);


          boolean twoConditions2;
          twoConditions2= !isGreaterThan && isLessThanOrEqualTO;
          System.out.println("\n" + twoConditions2);


          boolean secondCondition=isLessThan || isGreaterThanOrEqualTo;
          System.out.println(secondCondition);


          boolean thirdCondition=(isGreaterThan && isLessThanOrEqualTO) ||(isLessThan && isLessThanOrEqualTO);
          System.out.println("\n" + thirdCondition);

          //expressions always evaluate to some sort of value
         // e.g. - 1+3 evaluates to 3
          //int z=1+3
      }












}
