package DataAlgo.DLL.Base;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dL = new DoublyLinkedList(7);

        dL.append(8);
        dL.append(9);

        dL.prepend(1);

        dL.getHead();
        dL.getTail();
        dL.getLength();

        dL.printList();
    }
}
