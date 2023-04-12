package List;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ArrChallenge {
    public static void main(String[] args) {
        getInput();
    }

    public static void getInput() {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Available actions\n" +
                "0 shutdown\n" +
                "1 add item\n" +
                "2 remove item");
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter action->:");
            int action = sc.nextInt();
            if (action == 0) {
                break;
            }
            System.out.print("Enter number you want to add/remove ->:");
            int value = sc.nextInt();
            addRemoveValue(list, action, value);
        }
    }

    private static void addRemoveValue(ArrayList<Integer> list, int action, int value) {
        if (action == 1) {
            if (!list.contains(value)) {
                list.add(value);
                printArrayList(list);
            } else {
                System.out.println("Duplicates not allowed " + value);
            }
        } else if (action == 2) {
            list.remove(value);
            printArrayList(list);
        } else {
            System.out.println("Please select proper selection");
        }
    }

    private static void printArrayList(ArrayList<Integer> list) {
        list.sort(Comparator.naturalOrder());
        System.out.println(list);
    }


}
