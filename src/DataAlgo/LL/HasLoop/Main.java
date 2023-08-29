package DataAlgo.LL.HasLoop;

public class Main {

    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.append(5);
        myLinkedList.append(6);
        myLinkedList.append(7);
        myLinkedList.append(8);
        myLinkedList.append(9);
        myLinkedList.append(10);

        // create a loop by connecting the tail to the second node
        myLinkedList.getHead().next.next.next.next.next = myLinkedList.getHead().next.next;


        System.out.println("Has Loop:");
        System.out.println(myLinkedList.hasLoop());


    }

}