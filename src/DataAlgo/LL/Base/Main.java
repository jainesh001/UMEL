package DataAlgo.LL.Base;

public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(4);

        myLinkedList.append(6);
        myLinkedList.append(9);
        myLinkedList.append(19);

        System.out.println(myLinkedList.remove(2));

        myLinkedList.getHead();
        myLinkedList.getTail();
        myLinkedList.getLength();


        System.out.println("\nLinked List:");
        myLinkedList.printList();
    }
}
