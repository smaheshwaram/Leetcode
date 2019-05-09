package interview.binarytree;

import leetcodeeasy.MonotonicValues;

import java.util.ArrayList;
import java.util.List;

public class CheckForBinarySearch extends MonotonicValues {
    Node root = null;
    List<Integer> list = new ArrayList<>();
    int count = 0;

    static class Node {
        Node left;
        Node right;
        int val;

        Node(int val) {
            this.val = val;
            left = null;
            right = null;
        }
    }

    public static void main(String[] args) {
        //creating binary search tree
        createBinaryTree();

        CheckForBinarySearch checkForBinarySearch = new CheckForBinarySearch();
        System.out.println(checkForBinarySearch.findGivenTreeIsBinarySearchTree(checkForBinarySearch.root));
    }

    public static Node createBinaryTree() {
        CheckForBinarySearch checkForBinarySearch = new CheckForBinarySearch();
        checkForBinarySearch.root = new Node(4);
        checkForBinarySearch.root.left = new Node(2);
        checkForBinarySearch.root.right = new Node(6);

        checkForBinarySearch.root.left.left = new Node(1);
        checkForBinarySearch.root.left.right = new Node(3);
        checkForBinarySearch.root.right.left = new Node(5);
        checkForBinarySearch.root.right.right = new Node(7);

        return checkForBinarySearch.root;
    }

    private boolean findGivenTreeIsBinarySearchTree(Node head) {

        if (head == null ) {
            return false;
        }

        //given tree is binary search tree if in order traversal resulting in monotonically increasing order of elements

        inOrderTraversal(head);
        int[] arr = new int[list.size()];

        for(int i=0; i<arr.length; i++) {
            arr[i] = list.get(i);
        }

        return isMonotonicIncreasing(arr);

    }

    private void inOrderTraversal(Node root) {
        if (root == null ) {
            return;
        }
        inOrderTraversal(root.left);
        list.add(root.val);
        inOrderTraversal(root.right);
    }

}
