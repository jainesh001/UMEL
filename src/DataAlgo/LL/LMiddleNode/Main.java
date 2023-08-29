package DataAlgo.LL.LMiddleNode;

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

        System.out.println("Middle Node:");
        System.out.println(myLinkedList.findMiddleNode().value);


        /*
            EXPECTED OUTPUT:
            ----------------
            Middle Node:
            3

        */

    }

}
