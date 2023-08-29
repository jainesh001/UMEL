package DataAlgo.LL.LMiddleNode;

public class LinkedList {

    private Node head;
    private Node tail;

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
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll() {
        if (head == null) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("\nLinked List:");
        if (head == null) {
            System.out.println("empty");
        } else {
            printList();
        }
    }

    public void makeEmpty() {
        head = null;
        tail = null;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

    }

    //    public Node findMiddleNode(){
//        Node temp=head;
//        Node twice=temp;
//        int step=1;
//        int count=0;
//        int counter=0;
//        while(temp!=null){
//            while(count<step && twice!=null ){
//                twice=twice.next;
//                count++;
//                counter++;
//                System.out.println(counter);
//            }
//            if(twice==null){
//                return temp;
//            }
//            temp=temp.next;
//            step++;
//            twice=temp;
//            count=0;
//        }
//        return temp;
//    }
    public Node findMiddleNode() {
        Node temp = head;
        Node twice = temp;
        int step = 1;
        int doubleStep = 2 * step;
        int totalCount = 1;
        while (temp != null) {
            while (twice != null && totalCount < doubleStep) {
                twice = twice.next;
                totalCount++;
            }
            if (twice == null) {
                return temp;
            }
            step++;
            temp = temp.next;
            doubleStep = 2 * step;
        }
        return temp;
    }

    // WRITE FIND MIDDLE NODE METHOD HERE //
    //                                    //
    //                                    //
    //                                    //
    //                                    //
    ////////////////////////////////////////
//    public Node findMiddleNode() {
//        Node slow = head;
//        Node fast = head;
//
//        while (fast != null && fast.next != null) {
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//
//        return slow;
//    }


}


