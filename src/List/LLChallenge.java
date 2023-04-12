package List;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

record Place(String name, int distance) {
    @Override
    public String toString() {
        return String.format("%s (%d)", name, distance);
    }
}

public class LLChallenge {
    public static void main(String[] args) {
        LinkedList<Place> placesTOVisit = new LinkedList<>();
        Place adelaide = new Place("Adelaide", 1374);
        addPlace(placesTOVisit, adelaide);
        addPlace(placesTOVisit, adelaide);


        addPlace(placesTOVisit, new Place("Rome", 2));
        addPlace(placesTOVisit, new Place("Italy", 1400));
        addPlace(placesTOVisit, new Place("Rome", 5000));
        addPlace(placesTOVisit, new Place("India", 50));
        addPlace(placesTOVisit, adelaide);
        System.out.println(placesTOVisit);
        printList(placesTOVisit);
    }

    private static void addPlace(LinkedList<Place> list, Place place) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).name().equalsIgnoreCase(place.name())) {
                System.out.println("duplicate");
                return;
            }
            if (place.distance() <= list.get(i).distance()) {
                list.add(i, place);
                return;
            }
        }

        list.add(place);
    }

    private static void printList(LinkedList<Place> list) {
        String text = """
                    Available actions (select word or letter): 
                    (F)orward 
                    (B)ackward 
                    (L)ist Places 
                    (M)enu 
                    (Q)uit 
                """;
        System.out.println(text);
        ListIterator<Place> iterator = list.listIterator();
        boolean forward = true;
        while (true) {
            if (!iterator.hasNext()) {
                System.out.println("Final: " + iterator.previous());
                forward = false;
            }
            if (!iterator.hasPrevious()) {
                System.out.println("Originating: " + iterator.next());
                forward = true;
            }
            System.out.print("Please enter your selection : ");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            switch (input) {
                case "F" -> {
                    if (!forward) {
                        forward = true;
                        if (iterator.hasNext()) {
                            iterator.next();
                        }
                    }
                    if (iterator.hasNext()) {
                        System.out.println(iterator.next());
                    }
                }
                case "B" -> {
                    if (forward) {
                        forward = false;
                        if (iterator.hasPrevious()) {
                            iterator.previous();
                        }
                    }
                    if (iterator.hasPrevious()) {
                        System.out.println(iterator.previous());
                    }
                }
                case "L" -> {
                    ListIterator<Place> iterator1 = list.listIterator(0);
                    while (iterator1.hasNext()) {
                        System.out.print(iterator1.next() + ",");
                    }
                    System.out.println();
                }
                case "M" -> {
                    System.out.println(text);
                }
                default -> {
                    return;
                }


            }

        }
    }

}

