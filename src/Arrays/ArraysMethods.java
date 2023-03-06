package Arrays;

import java.util.Arrays;
import java.util.Random;

public class ArraysMethods {
    public static void main(String[] args) {
        int[] firstArray = getRandomArray(10);
        System.out.println(Arrays.toString(firstArray));
        Arrays.sort(firstArray);
        System.out.println(Arrays.toString(firstArray));

        int[] secondArray = new int[10];
        System.out.println(Arrays.toString(secondArray));
        Arrays.fill(secondArray, 5);
        System.out.println(Arrays.toString(secondArray));

        int[] thirdArray = getRandomArray(10);
        System.out.println(Arrays.toString(thirdArray));

        int[] fourthArray = Arrays.copyOf(thirdArray, thirdArray.length);
        System.out.println(Arrays.toString(fourthArray));

        Arrays.sort(fourthArray);
        System.out.println(Arrays.toString(thirdArray));
        System.out.println(Arrays.toString(fourthArray));

        int[] smallArray = Arrays.copyOf(thirdArray, 5);
        System.out.println(Arrays.toString(smallArray));

        int[] largerArray = Arrays.copyOf(thirdArray, 20);
        System.out.println(Arrays.toString(largerArray));

        String[] sArray = {"Able", "Jane", "Mark", "Ralph", "David"};
        Arrays.sort(sArray);
        System.out.println(Arrays.toString(sArray));
        if (Arrays.binarySearch(sArray, "Mark") >= 0) {
            System.out.println("Found Mark in the list");
        }

        int[] s1 = {1, 2, 3, 4, 5};
        int[] s2 = {1, 2, 3, 4, 5};

        if (Arrays.equals(s1, s2)) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }

        int[] rsArray = getRandomArray(10);
        System.out.println(Arrays.toString(rsArray));
        Arrays.sort(rsArray);
        System.out.println(Arrays.toString(rsArray));
        int[] reverseArray = new int[10];
        for (int i = 0; i < rsArray.length; i++) {
            reverseArray[i] = rsArray[rsArray.length - 1 - i];
        }
        System.out.println(Arrays.toString(reverseArray));

        Arrays.toString(sortedArray(new int[]{17, 31, 46, 50}));


    }


    public static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] newInt = new int[len];
        for (int i = 0; i < len; i++) {
            //includes 0
            //doesn't include 100
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }

    public static int[] sortedArray(int[] array) {
        System.out.println(Arrays.toString(array));
        int[] sortedArray = Arrays.copyOf(array, array.length);
        int temp;
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    flag = true;
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    System.out.println("---->" + Arrays.toString(sortedArray));
                }
            }
            System.out.println("*" + Arrays.toString(sortedArray));
        }

        return sortedArray;
    }
}
