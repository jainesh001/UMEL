package ArrayE;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] resultReverse = reverseArray2(new int[]{3, 9, 24, 38, 41, 42});
        System.out.println(Arrays.toString(resultReverse));
    }

    public static int[] reverseArray(int[] intArray) {
        int[] resultArray = Arrays.copyOf(intArray, intArray.length);
        for (int i = 0; i < intArray.length; i++) {
            resultArray[i] = intArray[intArray.length - 1 - i];
        }
        return resultArray;
    }

    public static int[] reverseArray2(int[] intArray) {
        int temp = 0;
        for (int i = 0; i < intArray.length / 2; i++) {
            temp = intArray[i];
            intArray[i] = intArray[intArray.length - 1 - i];
            intArray[intArray.length - 1 - i] = temp;
        }
        return intArray;
    }
}
