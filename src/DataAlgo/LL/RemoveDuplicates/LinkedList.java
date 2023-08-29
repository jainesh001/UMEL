package DataAlgo.LL.RemoveDuplicates;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nLinked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public void removeDuplicates() {
        if (head == null) {
            return;
        }
        ;
        Node temp = head;
        Node before = null;
        Node current = head;
        Node after = null;
        if (temp.next != null) {
            before = current;
            current = current.next;
        }

        while (temp != null) {
            while (current != null) {
                if (current.value == temp.value) {
                    after = current.next;
                    before.next = after;
                    current = after;
                    length--;
                } else {
                    before = current;
                    current = current.next;
                }
            }
            temp = temp.next;
            if (temp.next != null) {
                before = temp;
                current = temp.next;
            } else {
                break;
            }
        }


    }


    // WRITE THE REMOVEDUPLICATES METHOD HERE //
    //                                        //
    //                                        //
    //                                        //
    //                                        //
    ////////////////////////////////////////////

}