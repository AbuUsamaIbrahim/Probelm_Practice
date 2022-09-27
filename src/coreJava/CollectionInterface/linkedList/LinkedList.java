package coreJava.CollectionInterface.linkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LinkedList {
    Node head;

    public void insert(int val) {
        Node node = new Node();
        node.val = val;
        node.next = null;
        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void show() {
        Node node = head;
        if (head == null)
            System.out.println("[]");
        while (node.next != null) {
            System.out.println(node.val);
            node = node.next;
        }
        System.out.println(node.val);
    }

    public boolean isPalindrome() {
        Node curr = head;
        return checkPalindrome(curr);
    }

    public boolean checkPalindrome(Node curr) {
        if (curr.next != null && !checkPalindrome(curr.next)) return false;
        final boolean palindrome = (head.val == curr.val);
        head = head.next;
        return palindrome;
    }

    public boolean isPal() {
        Boolean isPal = true;
        Node slow = head;
        Stack<Integer> integerStack = new Stack<>();
        while (slow != null) {
            integerStack.push(slow.val);
            slow = slow.next;
        }
        while (head != null) {
            int i = integerStack.pop();
            if (head.val == i) {
                isPal = true;
            } else {
                isPal = false;
                break;
            }
            head = head.next;
        }
        return isPal;
    }

    public Node reverse(Node A) {
        Node prev = null;
        Node curr = A;
        Node next = null;
        Node rev = null;
        int flag = 0;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }

    public void delete(int val) {
        Node node = head;
        Node n = head;
        while (n.next != null) {
            if (n.next.val == val) {
                n.next = n.next.next;
            } else {
                n = n.next;
            }
        }
        if (head.val == val)
            head = head.next;
    }

    public Node recursiveReverse(Node node) {
        if (node == null || node.next == null)
            return node;
        Node rest = recursiveReverse(node.next);
        node.next.next = node;
        node.next = null;
        return rest;
    }

    public void callRecursiveReverse() {
        head = recursiveReverse(head);
    }

    public void callIntersect() {

        Node nodeA = new Node(7);
        nodeA.next = new Node(8);
        nodeA.next.next = new Node(9);
        nodeA.next.next.next = new Node(11);
        ;
        nodeA.next.next.next.next = new Node(12);
//        nodeA.next.next.next.next.next = new Node(13);


        Node nodeB = new Node(1);
        nodeB.next = new Node(2);
        nodeB.next.next = new Node(3);
        nodeB.next.next.next = new Node(4);
        ;
        nodeB.next.next.next.next = new Node(5);
//        nodeB.next.next.next.next.next = new Node(6);
//        nodeB.next.next.next.next.next.next = new Node(7);
//        nodeB.next.next.next.next.next.next.next = new Node(8);

        Node nodeC = new Node(1);
        nodeC.next = new Node(0);
        nodeC.next.next = new Node(0);
        nodeC.next.next.next = new Node(0);
        nodeC.next.next.next.next = new Node(0);
        nodeC.next.next.next.next.next = new Node(0);
        nodeC.next.next.next.next.next.next = new Node(0);
        nodeC.next.next.next.next.next.next.next = new Node(0);

//        nodeC.next.next.next = new Node(19);
//        intersect(nodeA,nodeB);
//        mergeList(nodeA,nodeB);
//        removeDuplicate(nodeA);
//        findMiddle(nodeA);
//        reverse(nodeC);
//        getDecimalValue(head);
//        oddEvenList(nodeB);
        splitListToParts(nodeA, 5);
    }


    public Node removeDuplicate(Node A) {
        Node curr = A;
        head = curr;
        while (curr != null) {
            while (curr.next != null && curr.next.val == curr.val) {
                curr.next = curr.next.next;
            }
            curr = curr.next;
        }
        return head;
    }

    public Node mergeList(Node A, Node B) {
        Node dummyHead = new Node(0);
        Node curr = dummyHead;
        while (A != null && B != null) {
            if (A.val <= B.val) {
                curr.next = A;
                A = A.next;

            } else {
                curr.next = B;
                B = B.next;
            }
            curr = curr.next;
        }
        curr.next = A != null ? A : B;
        return head = dummyHead.next;
    }

    public Node intersect(Node A, Node B) {
        if (A == null || B == null)
            return null;
        Node a = A, b = B;
        while (a != b) {
            if (a == null) {
                a = B;
            } else {
                a = a.next;
            }

            if (b == null) {
                b = A;
            } else {
                b = b.next;
            }
        }
        return a;
    }

    public Node findMiddle(Node A) {
        Node fast = A;
        Node slow = A;
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == null)
                break;
        }
        head = slow;
        return head;
    }

    public int getDecimalValue(Node head) {
        int dec = 0, i = 0;
        while (head.next != null) {
            dec += head.val << i;
            i++;
            head = head.next;
        }
        dec += head.val << i;
        return dec;
    }

    public Node oddEvenList(Node A) {
        Node oddNode = A;
        Node evenNode = A.next;
        Node evenCurr = A.next;
        int i = 1;
        while (oddNode.next != null && evenNode.next != null) {
            oddNode.next = oddNode.next.next;
            oddNode = oddNode.next;
            evenNode.next = evenNode.next.next;
            evenNode = evenNode.next;
        }
        oddNode.next = evenCurr;

        return A;
    }

    public Node[] splitListToParts(Node head, int k) {
        Node n[] = new Node[k];
        int size = 0;
        while (head != null) {
            size++;
            head = head.next;
        }
        int group = size / k;
        int carry = size % k;
        return n;
    }
}
