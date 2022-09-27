package coreJava.CollectionInterface.linkedList;

public class Node {
    int val;
    Node next;

    public Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }

    public Node() {
    }

    public Node(int i) {
        this.val = i;
    }
}
