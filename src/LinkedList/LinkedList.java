package LinkedList;

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

    public void prepend(int value) {
        Node newNode = new Node(value);

        newNode.next = head;
        if (length == 0) {
            tail = newNode;
        }
        head = newNode;
        length++;
    }
    
    public Node removeFirst() {
        Node tmp = head;
        
        if (length == 0) return tmp;
        
        if (length == 1) {
            head = null;
            tail = null;
            length--;
            return tmp;
        }

        head = head.next;
        tmp.next = null;
        return tmp;
    }

    public Node removeLast() {
        Node tmp = head;

        if (length == 0) return tmp;

        if (length == 1) {
            head = null;
            tail = null;
            length--;
            return tmp;
        }

        while (tmp.next != tail) {
            tmp = tmp.next;
        }
        Node res = tail;
        tail = tmp;
        tail.next = null;
        length--;
        return res;
    }

    public void append(int value) {
        Node newNode = new Node(value);

        if (length == 0){
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public void printList() {
        Node tmp = head;

        while (tmp != null) {
            System.out.println(tmp.value);
            tmp = tmp.next;
        }
    }

}
