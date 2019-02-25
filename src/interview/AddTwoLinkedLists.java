package interview;

import java.util.ArrayList;
import java.util.List;

public class AddTwoLinkedLists {
    static public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }

    public static void main(String[] args) {
        AddTwoLinkedLists addTwoLinkedLists = new AddTwoLinkedLists();
        //7243 564
        int arr[] = {2, 4, 3};
        ListNode head1 = new ListNode(7);

        createList(head1, arr);

        int arr2[] = {6,4};


    }

    static public ListNode createList(ListNode head, int[] arr) {
        ListNode temp1 = head;
        for(int i=0; i<arr.length; i++) {
            ListNode temp2 = new ListNode(arr[i]);
            temp2 = temp1.next;
            temp1 = temp2;
        }

        return head;

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head1 = reverseListNode(l1);
        ListNode head2 = reverseListNode(l2);

        return reverseListNode(createListNode(head1, head2));

    }

    private ListNode reverseListNode(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode current = head;
        ListNode prev = null;
        ListNode next = null;
        while(current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;

        }
        head = prev;
        return head;
    }

    private ListNode createListNode(ListNode h1, ListNode h2) {
        ListNode temp1 = h1; ListNode temp2 = h2; ListNode head3 = null;
        ListNode temp3 = head3;
        int carry = 0;
        int arr[] = new int[2];
        if (h1 != null && h2 != null) {
            arr = calculateNodeSum(h1.val, h2.val);
            head3 = new ListNode(arr[0]);
            carry = arr[1];
            temp3 = head3;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        while (temp1 != null && temp2 != null) {
            ListNode temp4  = null;
            if (carry == 0) {
                arr = calculateNodeSum(temp1.val, temp2.val);
                temp4 = new ListNode(arr[0]);
                carry = arr[1];
                temp4 = temp3.next;
                temp3 = temp4;
                temp1 = temp1.next;
                temp2 = temp2.next;
            } else {
                arr = calculateNodeSum(temp1.val + 1, temp2.val);
                temp4 = new ListNode(arr[0]);
                carry = arr[1];
                temp4 = temp3.next;
                temp3 = temp4;
                temp1 = temp1.next;
                temp2 = temp2.next;
            }

        }

        if (temp1 == null && temp2 != null) {
            ListNode temp4  = null;
            while (temp2 != null) {
                temp4 = new ListNode(temp2.val);
                temp3 = temp4;
                temp2 = temp2.next;
            }
        } else if (temp1 != null && temp2 == null) {
            ListNode temp4  = null;
            while (temp1 != null) {
                temp4 = new ListNode(temp1.val);
                temp3 = temp4;
                temp1 = temp1.next;
            }
        }

        return head3;

    }

    private int[] calculateNodeSum(int val1, int val2) {
        int arr[] = new int[2];
        int carry = 0;
        int sum = val1 + val2;

        if (sum > 9) {
            carry = 1;
            sum = sum % 10;
            arr[0] = sum;
            arr[1] = carry;
            return arr;
        }

        arr[0] = sum;
        arr[1] = carry;

        return arr;
    }
}
