/*delete nth node from end
2->3->8->4->6 given n=2 so new list will be 2->3->8->6
 */

package LinkedList;

import java.util.ArrayList;
import java.util.List;

public class DeleteNthNodeFromEnd {
    static class Node{
        int x;
        Node next;
        Node(int data) {
            this.x = data;
            next = null;
        }
    }

    public static void main(String[] args) {
        DeleteNthNodeFromEnd deleteNthNodeFromEnd = new DeleteNthNodeFromEnd();

        Node head = new Node(2);
        List<Integer> list = new ArrayList<>(  );
        list.add(3);
        list.add(8);
        list.add(4);
        list.add(6);

        deleteNthNodeFromEnd.createLinkedList(head, list);
//        deleteNthNodeFromEnd.deleteNodeAndReturnList(list, 2);
    }

    private void createLinkedList(Node head, List<Integer> list) {
        Node temp = head; int count = list.size(); int count1 = 1;
        while (count != 0) {
            Node temp1 = temp.next;
            temp1.x = list.get(count1++);
            temp = temp1;
            count--;
        }
    }



}
