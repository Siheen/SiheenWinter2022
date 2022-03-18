package stringPractice;

public class StringPractice {

    static String name="Siheen";
    static String otherName= "SiheenA";

    public static void main(String[] args) {
        int length=name.length();
        System.out.println(length);

        //End index is up to, but not including
        System.out.println(name.substring(0,3));


        int index=name.indexOf("S");
        System.out.println(index);

       // Comparison using strings vs other numerical data types
       int x=5;
       int y=5;

        boolean isSame=x==y;
        System.out.println(isSame);

        isSame= name.equals(otherName);
        System.out.println(isSame);

// this is doc string~ multi line comment. they provide documentation for your methods
        /**  This method performs this action. This is just a helpful way to reference and understand
         * what methods are doing
         * @param num 1-First number to add
         * @param num 2- Second number to add
         * @return sum of num1 and num2
         */
    }
}
