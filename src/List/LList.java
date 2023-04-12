package List;

import java.util.LinkedList;
import java.util.ListIterator;

public class LList {
    public static void main(String[] args) {
//        LinkedList<String> placeToVisit= new LinkedList<>();
        var placesToVisit = new LinkedList<String>();
        placesToVisit.add("Sydney");
        placesToVisit.add(0, "Canberra");
        placesToVisit.add("Zeus");
        placesToVisit.offer("Take");
        placesToVisit.offerFirst("One");

        System.out.println(placesToVisit);
//        addMoreElements(placesToVisit);
//        System.out.println(placesToVisit);
//        removeElements(placesToVisit);
//        gettingElements(placesToVisit);

//        printItinerary(placesToVisit);
//        printItinerary2(placesToVisit);
//        printItinerary3(placesToVisit);
//        testListIterator(placesToVisit);
//        System.out.println(placesToVisit);

    }

    private static void addMoreElements(LinkedList<String> list) {
        list.add("Darwin");
        list.add("Hobart");
        //Queue method
        list.offer("Melbourne");
        list.offerFirst("Brisbane");
        list.offerLast("Toowoomba");
        //Stack methods
        list.push("Alice springs");
    }

    private static void removeElements(LinkedList<String> list) {
        list.remove(4);
        list.remove("Brisbane");
        System.out.println(list);
        String s1 = list.remove();//remove first
        System.out.println(s1 + " remove was removed");

        String s2 = list.removeFirst();//remove first
        System.out.println(s2 + " removeFirst was removed");

        String s3 = list.removeLast();
        System.out.println(s3 + " removeLast was removed");

        //Queue/Deque methods
        String p1 = list.poll();
        System.out.println(p1 + " poll was removed");
        String p2 = list.pollFirst();//removes first
        System.out.println(p2 + " pollFirst was removed");
        String p3 = list.pollLast();//removes Last
        System.out.println(p3 + " pollLast was removed");

        list.push("Sydney");
        list.push("Brisbane");
        list.push("Canberra");
        System.out.println(list);

        //stack method
        String p4 = list.pop();//removes Last
        System.out.println(p4 + " pop was removed");
    }

    private static void gettingElements(LinkedList<String> list) {
        System.out.println("Retrieved Element = " + list.get(4));
        System.out.println("First element = " + list.getFirst());
        System.out.println("Last element = " + list.getLast());

        System.out.println("Darwin is at position: " + list.indexOf("Darwin"));
        System.out.println("Melbourne is at position: " + list.lastIndexOf("Melbourne"));

        //Queue retrieval method
        System.out.println("Element from element() = " + list.element());
        //Stack retrieval methods
        System.out.println("Element from peek() = " + list.peek());
        System.out.println("Element from peekFirst() = " + list.peekFirst());
        System.out.println("Element from peekLast() = " + list.peekLast());

    }

    public static void printItinerary(LinkedList<String> list) {
        System.out.println("Trip starts at " + list.getFirst());
        for (int i = 1; i < list.size(); i++) {
            System.out.println("--> From: " + list.get(i - 1) + "to " + list.get(i));
        }
        System.out.println("Trip ends at " + list.getLast());
    }

    public static void printItinerary2(LinkedList<String> list) {
        System.out.println("Trip starts at " + list.getFirst());
        String previousTown = list.getFirst();
        for (String town : list) {
            System.out.println("--> From: " + previousTown + " to " + town);
            previousTown = town;
        }

        System.out.println("Trip ends at " + list.getLast());
    }

    public static void printItinerary3(LinkedList<String> list) {
        System.out.println("Trip starts at " + list.getFirst());
        String previousTown = list.getFirst();
        ListIterator<String> iterator = list.listIterator(1);
        while (iterator.hasNext()) {

            var town = iterator.next();
            System.out.println("--> From: " + previousTown + " to " + town);
            previousTown = town;
        }

        System.out.println("Trip ends at " + list.getLast());
    }

    private static void testIterator(LinkedList<String> list) {
        var iterator = list.iterator();
        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
            if (iterator.next().equals("Brisbane")) {
                //we cannot use this method this will throw us concurrent modification exception
                //list.remove();
                iterator.remove();
            }
        }
    }

    private static void testListIterator(LinkedList<String> list) {
        var iterator = list.listIterator();

        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
            if (iterator.next().equals("Brisbane")) {
                iterator.add("Lake Wivehoe");
            }
        }
        //this second while doesnt work as the iteator hasnext() is already false
        //one approach to traverse again is as below, or to use different list iterator start the index
        //for cursor to begin from
        var iterator1 = list.listIterator(0);
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }

    }
}
