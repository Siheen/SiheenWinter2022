package java_intermediates.data_structures;

public class LearnArrays {


    public static void main(String[] args) {
        int[]myArray;                                                       //declaration
        myArray=new int [5];                                                 //initialising
        int l=myArray.length;
        int myArrayMaxIndex= myArray.length-1;


        //Indexing is a way of traversing/accessing a data structure

        myArray[0]=1;
        myArray[4]=5;
        myArray[1]=2;
        myArray[2]=3;
        myArray[3]=4;

        System.out.println(myArray[0]);
        System.out.println(myArray[1]);
        System.out.println(myArray[2]);
        System.out.println(myArray[3]);
        System.out.println(myArray[4]);

        int[] myNewArray={ 15,22,31,14,75,68,70,38,79};
        int length= myNewArray.length;
        int myNewArrayMaxIndex= myNewArray.length-1;

        System.out.println("myArray" + l);
        System.out.println("myArrayMaxIndex" + myArrayMaxIndex);
        System.out.println("myNewArray" + length);
        System.out.println("myNewArrayMaxIndex" + myNewArrayMaxIndex);


    }


}
