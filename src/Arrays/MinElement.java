package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinElement {
    public static void main(String[] args) {
        int[] result = readIntegers();
        System.out.println(Arrays.toString(result));
        System.out.println(findMin(result));

    }

    public static int[] readIntegers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter comma delimited list of numbers");
        String s = sc.nextLine();
        String[] sArr = s.split(",");
        int[] arr = new int[sArr.length];
        for (int i = 0; i < sArr.length; i++) {
            arr[i] = Integer.parseInt(sArr[i].trim());
        }

        return arr;
    }

    public static int findMin(int[] a) {
        int temp = Integer.MAX_VALUE;
        for (int val : a) {
            if (val < temp) {
                temp = val;
            }
        }
        return temp;
    }
}
