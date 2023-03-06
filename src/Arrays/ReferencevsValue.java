package Arrays;

import java.util.Arrays;

public class ReferencevsValue {
    public static void main(String[] args) {

        //myIntArray is variable/reference
        int[] myIntArray = new int[5];

        //another reference to the same array in the memory
        int[] anotherArray = myIntArray;

        System.out.println("myIntArray= " + Arrays.toString(myIntArray));
        System.out.println("anotherArray= " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;
        modifyArray(myIntArray);
        System.out.println("after change myIntArray= " + Arrays.toString(myIntArray));
        System.out.println("after change anotherArray= " + Arrays.toString(anotherArray));

    }

    public static void modifyArray(int[] array) {
        array[1] = 2;
    }
}