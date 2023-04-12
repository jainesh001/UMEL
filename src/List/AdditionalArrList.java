package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AdditionalArrList {
    public static void main(String[] args) {
        String[] items = {"apple", "bananas", "milk", "eggs"};
        //Generates immutable list
        List<String> list = List.of(items);
//        System.out.println(list.getClass().getName());
//        cannot manipulate error
//        list.add("yogurt");
        ArrayList<String> groceries = new ArrayList<>(list);
        groceries.add("yogurt");
        System.out.println(groceries);

        //support variable argument
        ArrayList<String> nextList = new ArrayList<>(List.of("pickles", "mustard", "cheese"));
        System.out.println(nextList);

        //add one list to another list with addAll
        groceries.addAll(nextList);
        System.out.println(groceries);

        System.out.println("Third item = " + groceries.get(2));

        if (groceries.contains("mustard")) {
            System.out.println("List contains mustard");
        }
        groceries.add("apple");
        System.out.println(groceries);
        System.out.println(groceries.containsAll(List.of("apple", "bananask")));
        groceries.add("yogurt");
        System.out.println("first = " + groceries.indexOf("yogurt"));
        System.out.println("last = " + groceries.lastIndexOf("yogurt"));

        System.out.println(groceries);
        groceries.remove(1);
        System.out.println(groceries);
        groceries.remove("yogurt");
        System.out.println(groceries);
        groceries.add("yogurt");
        System.out.println(groceries);
        groceries.removeAll(List.of("apple", "yogurt"));
        System.out.println(groceries);

        groceries.retainAll(List.of("pickles"));
        System.out.println(groceries);

        groceries.clear();
        System.out.println(groceries);
        System.out.println("isEmpty = " + groceries.isEmpty());

        groceries.addAll(List.of("apple", "bananas", "milk", "eggs"));
        groceries.addAll(Arrays.asList("bat, racket, stump"));

        System.out.println(groceries);
        groceries.sort(Comparator.naturalOrder());
        System.out.println(groceries);
        groceries.sort(Comparator.reverseOrder());
        System.out.println(groceries);

        var groceryArray = groceries.toArray(new String[2]);
        System.out.println(Arrays.toString(groceryArray));
        System.out.println(groceryArray.length);

        var groceryArrayN = groceries.toArray(new String[10]);
        System.out.println(Arrays.toString(groceryArrayN));
        System.out.println(groceryArrayN.length);
//        String[] originalArray= new String[] {"First","Second","Third"};
//        var originalList=Arrays.asList(originalArray);
//        originalList.set(0,"one");
//        System.out.println("List: "+originalList);
//        System.out.println("Array: "+Arrays.toString(originalArray));
////        originalList.add("Fourth");
//        originalList.sort(Comparator.naturalOrder());
//        System.out.println("Array: "+Arrays.toString(originalArray));
//
//        //here we don't have reference to the array backing the list
//        List<String> newList=Arrays.asList("Sunday","Monday", "Tuesday");
//        System.out.println(newList);


    }
}
