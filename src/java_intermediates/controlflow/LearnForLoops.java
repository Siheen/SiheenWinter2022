package java_intermediates.controlflow;

public class LearnForLoops {

    public static void main(String[] args) {
    /*
    FOR LOOP
        Used when we know how many iterations we need to loop. Iterations just means, how many times
     */

        String name = "Tsega";
        //Print name 5 times

        for (int i=0; i<5; i++) {
            System.out.println(name);
        }

        /*
       FOR EACH LOOP
            Used typically with data structures.Typically, used when we don't know the number the iterations needed
         */

         int[] myIntArray={5,87689, 213, 201, -20, 390, -4883, 9329, 9999, 10192, 475};

                 for(int x: myIntArray){

                     System.out.println(x);
                 }


    }
}
