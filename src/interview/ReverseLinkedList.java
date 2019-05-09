package interview;

public class ReverseLinkedList {
    static Node head;
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        Node head = new Node(5);
        reverseLinkedList.reverse(head);
    }


    private Node reverse(Node head) {
        Node current = head;
        Node prev = null;
        Node next = null;

        if (head == null) {
            return null;
        }

        while(current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }
}
