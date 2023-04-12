package ArrayE;

public class VarArg {

    public static void main(String[] args) {
        System.out.println("Hello");
        String[] splitString = "Hello new me".split(" ");
        printList(splitString);
        System.out.println("-".repeat(20));
        printList("Hello", "world", "again");
    }

    public static void printList(String... textList) {
        for (String t : textList) {
            System.out.println(t);
        }
    }

}
