package interview.binarytree.treetraversal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

// Pre order, in order and post order all are depth first search algorithms
// Time complexity is O(n) Space complexity is O(1) if we don't use stack or queue or else its O(n)

public class PreOrderTraversal {
    Node root = null;
    static List<Integer> list = new ArrayList<>();

    static class Node{
        Node left;
        Node right;
        int val;

        Node(int x) {
            left = null;
            right = null;
            val = x;
        }

    }

    public static void main(String[] args) {

        PreOrderTraversal preOrderTraversal = new PreOrderTraversal();

        System.out.println("Printing recursive pre order");
        preOrder(createBinaryTree());

        System.out.println("Printing iterative pre order");
        preOrderIterative(createBinaryTree());

        System.out.println("Printing Recursive post order ");
        postOrder(createBinaryTree());

        System.out.println("Printing highest node val of tree if BST or not ");
        //You can pick any traversal type
        inOrder(createBinaryTree());
        Collections.sort(list);
        System.out.println(list.get(list.size()-1));



    }

    private static Node createBinaryTree() {
        PreOrderTraversal preOrderTraversal = new PreOrderTraversal();
        preOrderTraversal.root = new Node(4);
        preOrderTraversal.root.left = new Node(2);
        preOrderTraversal.root.right = new Node(6);

        preOrderTraversal.root.left.left = new Node(1);
        preOrderTraversal.root.left.right = new Node(3);
        preOrderTraversal.root.right.left = new Node(10);
        preOrderTraversal.root.right.right = new Node(7);

        return preOrderTraversal.root;
    }

    //recursive pre order traversal (root - left - right)

    private static void preOrder(Node head) {
        if (head == null) {
            return;
        }
        System.out.println(head.val);
        preOrder(head.left);
        preOrder(head.right);

    }

    //iterative pre order traversal

    private static void preOrderIterative(Node head) {

        if (head == null) {
            return;
        }

        Stack<Node> stack = new Stack<>();
        stack.push(head);

        while(!stack.isEmpty()) {
            Node temp = stack.pop();
            System.out.println(temp.val);

            if (temp.right != null) {
                stack.push(temp.right);
            }

            if (temp.left != null) {
                stack.push(temp.left);
            }

        }

    }

    //recursive post order traversal (left - right -root)
    private static void postOrder(Node head) {
        if (head == null) {
            return;
        }
        postOrder(head.left);
        postOrder(head.right);
        System.out.println(head.val);
    }

    //iterative traversal post order
//    private static void postOrderIterative(Node head) {
//        if (head == null) {
//            return;
//        }
//
//        Stack<Node> stack1 = new Stack<>();
//        stack1.push(head);
//
//        while(!stack1.isEmpty()) {
//            Node temp = stack1.pop();
//
//            if (temp.right != null) {
//                stack1.push(temp.right);
//            }
//            if (temp.left != null) {
//                stack1.push(temp.left);
//            }
//
//            System.out.println(stack1.pop());
//
//        }
//
//    }

    // In order traversal

    private static void inOrder(Node head) {
        if (head == null) {
            return;
        }
        inOrder(head.left);
        list.add(head.val);
        inOrder(head.right);
    }

}
