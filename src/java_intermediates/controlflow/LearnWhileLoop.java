package java_intermediates.controlflow;

public class LearnWhileLoop {

    /*
    WHILE LOOP
        while a condition is true, continue looping

    DO_WHILE LOOP
        Executes the loop first ALWAYS, and then checks the condition to see if it should continue looping
     */
    public static void main(String[] args) {
         int x= 0;

       //  while (x< 10){
           //  System.out.println("LOOP" + (x+1) + ":" + "We are learning Java");
             x++;
    //     }

             do {
             System.out.println("LOOP"  + (x+1)  +  ":"  + "We are learning Java");
             x++;
             } while (x>10);




    }





}
