package interview.linkedlist;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class BasicLinkedListOperations {
    Node head = null;

    static class Node {
        int val;
        Node next = null;

        Node(int val) {
            this.val = val;
        }
    }

    static class ListValComparator implements Comparator<Node> {
        @Override
        public int compare(Node n1, Node n2) {
            return n1.val - n2.val;
        }
    }

    public static void main(String[] args) {
        BasicLinkedListOperations basicLinkedListOperations = new BasicLinkedListOperations();

        Node head = new Node(5);

        //create linked list for a given array
//        int[] arr = {4,7,23};
        int[] arr = {6,9,15};

        System.out.println("Creating 1st linked list....." );
        basicLinkedListOperations.createLinkedList(head, arr);

        //traverse and print linked list
        System.out.println("Printing linked list: ");
        basicLinkedListOperations.printLinkedList(head);

        //insert new node
//        System.out.println("Inserting new node: ");
//        head = basicLinkedListOperations.insertNewNode(head, 12);

        System.out.println("Inserting new node in the middle of the list: ");
        basicLinkedListOperations.insertNewNodeInTheMiddleOfList(head, 15, 21);

        //delete a node (check below for the function)

        //Return middle node value of a given linked list
        System.out.println("Returning the middle node of given linked list: " + basicLinkedListOperations.middleNode(head));

        //Creating 2nd linked list
        Node head2 = new Node(2);

        //create linked list for a given array
        int[] arr2 = {7, 9, 11};

        System.out.println("Creating 2nd linked list....." );
        basicLinkedListOperations.createLinkedList(head2, arr2);

        //printing 2nd linked list
        System.out.println("Printing 2nd linked list: ");
        basicLinkedListOperations.printLinkedList(head2);

        //Sorting list 1
        System.out.println("Sorting list 1:  ");
        List<Node> list1 = new LinkedList<>();
        Node x = head;
        list1.add(head);
        while(x.next != null) {
            x = x.next;
            list1.add(x);
        }
        Collections.sort(list1, new ListValComparator());
        for(Node i: list1) {
            System.out.println(i.val);
        }

        /* Make sure linked lists which are passing should be sorted */
        System.out.println("Merging two lists:  ");
        Node temp1 = basicLinkedListOperations.mergeTwoLists(head, head2);
        basicLinkedListOperations.printLinkedList(temp1);


        // creating 3rd linked list
        Node head3 = new Node(6);
        int[] arr3 = {3,8};

        System.out.println("Creating 3rd linked list....." );
        basicLinkedListOperations.createLinkedList(head3, arr3);
        System.out.println("Printing linked list 3 : ");
        basicLinkedListOperations.printLinkedList(head3);

        // creating 4th linked list
        Node head4 = new Node(4);
        int[] arr4 = {2,3};

        System.out.println("Creating 4th linked list....." );
        basicLinkedListOperations.createLinkedList(head4, arr4);
        System.out.println("Printing linked list 4 : ");
        basicLinkedListOperations.printLinkedList(head4);


        System.out.println("Adding two lists ");
        Node temp = basicLinkedListOperations.addTwoLists(head3, head4);
        basicLinkedListOperations.printLinkedList(temp);



        //reverse a given linked list
        System.out.println("Reversing a given linked list: ");
        temp = basicLinkedListOperations.reverseLinkedList(head);
        //Printing reversed linked list
        basicLinkedListOperations.printLinkedList(temp);


    }

    private Node createLinkedList(Node head, int[] arr) {
        if (head == null) {
            return null;
        }

        if (arr.length == 0) {
            return head;
        }
        Node temp = head;

        for (int i=0; i<arr.length; i++) {
            Node temp1 = new Node(arr[i]);
            temp.next = temp1;
            temp = temp1;
        }
        return head;
    }

    private void printLinkedList(Node head) {
        if (head == null) {
            return;
        }

        Node temp = head;

        while(temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

    //This function adds node in front of the head
    private Node insertNewNode(Node head, int val) {
        if (head == null) {
            return new Node(val);
        }

        //given new node to be added before head
        Node temp = new Node(val);
        temp.next = head;
        head = temp;

        System.out.println("Printing newly added head ");
        printLinkedList(head);

        return head;
    }

    private Node insertNewNodeInTheMiddleOfList(Node head, int existingVal, int newVal) {
        Node temp = head;

        while(temp.val != existingVal) {
            temp = temp.next;
        }

        Node temp1 = temp.next;

        Node newNode = new Node(newVal);
        temp.next = newNode;
        newNode.next = temp1;

        printLinkedList(head);

        return head;

    }

    //deleting a given node
    private Node deleteNode(Node head, Node delNode) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            if (head == delNode) {
                return null;
            } else {
                return head;
            }
        }
        else {
            if (head == delNode) {
                Node temp = head.next;
                head.next = null;
                head = temp;
                return head;
            }
            else {
                Node temp = head;
                while(temp.next != delNode) {
                    temp = temp.next;
                }

                temp.next = delNode.next;
                return head;
            }
        }
    }

    //Reverse given linked list
    private Node reverseLinkedList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node temp = head;
        Node prevNode = null;
        Node nextNode = null;

        while(temp != null) {
            nextNode = temp.next;
            temp.next = prevNode;
            prevNode = temp;
            temp = nextNode;
        }

        head = prevNode;
        return head;
    }

    //Return middle node value of a given linked list
    private Node middleNode(Node head) {
        if ( head == null ) {
            return head;
        }

        Node temp = head;

        //returning head value if head next is null
        if (temp.next == null) {
            return temp;
        }

        int count = 0;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        System.out.println("Count is : " + count);
        int mid = 1 + (count - 1)/2;
        System.out.println("Mid is : " + mid);
        temp = head;

        for(int i=1; i<mid; i++) {
            temp = temp.next;
        }
        return temp;

    }

    //recursively divide the given linked list and merging the lists
    private Node divideList(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node midNode = middleNode(head);
        Node leftNode = head;
        Node rightNode = midNode.next;
        midNode.next = null;

        Node left = divideList(leftNode);
        Node right = divideList(rightNode);

        return mergeTwoLists(left, right);

    }


    //Merge two given linked lists
    private Node mergeTwoLists(Node head1, Node head2) {
        if (head1 == null && head2 == null) {
            return head1;
        }
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }

        Node temp1 = head1;
        Node temp2 = head2;

        if (temp1.val < temp2.val) {
            temp1.next = mergeTwoLists(temp1.next, temp2);
            return temp1;
        }
        else {
            temp2.next = mergeTwoLists(temp1, temp2.next);
            return temp2;
        }

    }


    /* Add two linked lists and return the sum in a linked list
    1. By reversing the lists and add then next reverse it and return head
    2.By using stacks (push 1st link to stack1, 2nd link to stack2, pop each element and push to stack 3 then by popping creating linked list
    **/

    private Node addTwoLists(Node head1, Node head2) {
        if (head1 == null && head2 == null) {
            return head1;
        }
        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }

        int carry = 0;
        int sum = 0;
        boolean flag = true;

        Node temp1 = reverseLinkedList(head1);
        Node temp2 = reverseLinkedList(head2);

        while (temp1 != null && temp2 != null) {
            sum = ( temp1.val + temp2.val + carry )%10;
            carry = ( temp1.val + temp2.val + carry) / 10;
            temp1 = temp1.next;
            temp2 = temp2.next;

            head = createNewLinkedList(sum, flag);
            flag = false;
        }

        while(temp1 != null) {
            sum = ( temp1.val + carry ) % 10;
            carry = ( temp1.val + carry)  / 10;
            temp1 = temp1.next;
            head = createNewLinkedList(sum, flag);
        }

        while(temp2 != null) {
            sum = ( temp2.val + carry ) % 10;
            carry = ( temp2.val + carry)  / 10;
            temp2 = temp2.next;
            head = createNewLinkedList(sum, flag);
        }

        if (carry > 0) {
            sum = carry;
            head = createNewLinkedList(sum, flag);
        }

        return reverseLinkedList(head);

    }

    private Node createNewLinkedList(int val, boolean flag) {
        if (flag) {
            head = new Node(val);
        }
        else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            Node temp1 = new Node(val);
            temp.next = temp1;
        }
        return head;
    }




    /**
    private Node addTwoLists(Node head1, Node head2) {
        if (head1 == null && head2 == null) {
            return head1;
        }
        if (head1 == null) {
            return head2;
        }
        if (head2 == null)
        {
            return head1;
        }

        int carry = 0;
        int sum ;
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        Stack<Integer> stack3 = new Stack<>();

        Node temp1 = head1;
        Node temp2 = head2;

        while (temp1 != null) {
            stack1.push(temp1.val);
        }
        while (temp2 != null) {
            stack2.push(temp2.val);
        }

        while(!stack1.isEmpty() && !stack2.isEmpty()) {
            sum = ( stack1.pop() + stack2.pop() + carry )%10;
            carry = sum/10;

            stack3.push(sum);

        }
        while(!stack1.isEmpty()) {
            sum = (stack1.pop() + carry)%10;
            carry = sum/10;
        }
        while(!stack2.isEmpty()) {
            sum = (stack2.pop() + carry)%10;
            carry = sum/10;
        }

        if (carry > 0) {
            stack3.push(carry);
        }

        System.out.println("Printing sum from stack 3");
        while(!stack3.isEmpty()) {

            //create new linked list by popping stack 3 and return head

        }

    }

    **/


 }
