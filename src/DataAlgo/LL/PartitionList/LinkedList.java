package DataAlgo.LL.PartitionList;

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

    public void partitionList(int value) {
        Node temp = head;
        Node tempBefore = null;
        Node tempAfter = null;

        Node current = head;
        Node before = null;
        Node after = null;
        boolean higerValReplaceRequired = true;
        boolean lowerValReplaceRequired = false;

        while (temp != null) {
            if (temp.value == value) {
                break;
            }
            tempBefore = temp;
            temp = temp.next;
        }
        if (temp.next != null) {
            tempAfter = temp.next;
        }

        Node replace = null;
        while (current != null) {
            if (current.value > value) {
                if (!higerValReplaceRequired) {
                    before = current;
                    current = current.next;
                } else {
                    after = current.next;

                    temp.next = current;
                    current.next = tempAfter;
                    tempAfter = current;

                    if (tempBefore == current) {
                        tempBefore = before;
                    }
                    before.next = after;

                    current = after;

                }
            } else if (current.value < value) {
                if (!lowerValReplaceRequired) {
                    before = current;
                    current = current.next;
                } else {
                    after = current.next;
                    if (tempBefore == null) {
                        head = current;
                    } else {
                        tempBefore.next = current;
                    }
                    current.next = temp;
                    tempBefore = current;
                    before.next = after;
                    if (current == tempAfter) {
                        tempAfter = after;
                    }

                    current = after;

                }
            } else {
                higerValReplaceRequired = false;
                lowerValReplaceRequired = true;
                before = current;
                current = current.next;
            }

        }
    }
    // WRITE THE PARTITIONLIST METHOD HERE //
    //                                     //
    //                                     //
    //                                     //
    //                                     //
    /////////////////////////////////////////

}
