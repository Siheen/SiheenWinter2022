package staticKeyword;

public class Immutability {
    public static void main(String[] args) {
        String name="Siheen";
        String studentID="234987";

        String anotherStudent="Siheen";
        String thirdStudent= new String("siheen");

        boolean isSame=name.equals(thirdStudent);

        System.out.println(isSame);
    }
}
