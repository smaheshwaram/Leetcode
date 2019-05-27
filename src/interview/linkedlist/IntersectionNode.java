//   Example 1:
//
//
//        Input: intersectVal = 8, listA = [4,1,8,4,5], listB = [5,0,1,8,4,5], skipA = 2, skipB = 3
//        Output: Reference of the node with value = 8
//        Input Explanation: The intersected node's value is 8 (note that this must not be 0 if the two lists intersect).
//        From the head of A, it reads as [4,1,8,4,5]. From the head of B, it reads as [5,0,1,8,4,5].
//        There are 2 nodes before the intersected node in A; There are 3 nodes before the intersected node in B.

package interview.linkedlist;

public class IntersectionNode {

    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
        }
     }


    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if (headA == null || headB == null) {
            return null;
        }

        ListNode temp1 = headA;
        ListNode temp2 = headB;

        while(temp1 != temp2) {
            temp1 = temp1 == null ? headB : temp1.next;
            temp2 = temp2 == null ? headA : temp2.next;
        }

        return temp1;

    }

}
