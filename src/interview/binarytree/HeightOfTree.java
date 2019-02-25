package interview.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class HeightOfTree {
    Node root = null;

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
        HeightOfTree heightOfTree = new HeightOfTree();
        System.out.println("Height of the tree is: "+ heightOfTree.findHeightOfTree(heightOfTree.createBinaryTree()));


        System.out.println("Alternative find Height of the tree is: "+ heightOfTree.findHeight(heightOfTree.createBinaryTree()));

        //iterative height
        System.out.println("Height of the tree iterative is: "+ heightOfTree.heightOfTreeIterative(heightOfTree.createBinaryTree()));

        //search the node
        System.out.println("Search of key is " + heightOfTree.searchNode(heightOfTree.createBinaryTree(), 7));

        //insert a node for given tree
        heightOfTree.insertNode(heightOfTree.createBinaryTree(), 17);

        //search and delete the node
        heightOfTree.deleteNode(heightOfTree.createBinaryTree(), 4);

    }

    private Node createBinaryTree() {
        HeightOfTree heightOfTree = new HeightOfTree();
        heightOfTree.root = new Node(4);
        heightOfTree.root.left = new Node(2);
        heightOfTree.root.right = new Node(6);

        heightOfTree.root.left.left = new Node(1);
        heightOfTree.root.left.right = new Node(3);
        heightOfTree.root.right.left = new Node(5);
        heightOfTree.root.right.right = new Node(7);
        heightOfTree.root.right.right.right = new Node(10);

        return heightOfTree.root;
    }

    private int findHeightOfTree(Node head) {
        if (head == null) {
            return 0;
        }
        int lHeight = 0;
        int rHeight = 0;

        if (head.left != null) {
            lHeight = findHeightOfTree(head.left);
        }

        if (head.right != null) {
            rHeight = findHeightOfTree(head.right);
        }

        return 1 + Math.max(lHeight, rHeight);

    }

    //alternative approach
    private int findHeight(Node head) {
        if (head == null) {
            return 0;
        }
        return 1 + Math.max(findHeight(head.left), findHeight(head.right));

    }

    private int heightOfTreeIterative(Node head) {

        if (head == null) {
            return -1;
        }

        Queue<Node> queue = new LinkedList<>();

        queue.add(head);
        queue.add(null);
        int height = 0;

        while(!queue.isEmpty()) {

            Node temp = queue.remove();

            if(temp == null) {

                if(!queue.isEmpty()){
                    queue.add(null);
                }
                height++;
            }
            else {
                if(temp.left != null) {
                    queue.add(temp.left);
                }
                if(temp.right != null) {
                    queue.add(temp.right);
                }
            }

        }

        return height;
    }

    private boolean searchNode(Node head, int key) {
        if (head == null) {
            return false;
        }

        if (head.val == key) {
            return true;
        }

        return searchNode(head.left, key) || searchNode(head.right, key);

        /** the below code is alternative of above line
        if (key < head.val)
            return searchNode(head.left, key);

        return searchNode(head.right, key);
         **/

    }

    private Node insertNode(Node head, int key) {

        if (head == null) {
            head = new Node(key);
            return head;
        }

        if (key < head.val) {
            head.left = insertNode(head.left, key);
        }

        else if(key > head.val) {
            head.right = insertNode(head.right, key);
        }

        return head;
    }

    private Node deleteNode(Node head, int key) {
        if (head == null) {
            return null;
        }
        if (key < head.val) {
            head.left = deleteNode(head.left, key);
        }
        else if (key > head.val) {
            head.right = deleteNode(head.right, key);
        }
        else {
            // If given key to be deleted is equal to head value

            if (head.right != null) {
                return head.left;
            }
            else if (head.left != null) {
                return head.right;
            }

            head.val = minVal(head.right);

            head.right = deleteNode(head.right, head.val);
        }
        return head;
    }

    private int minVal(Node head) {
        int min = head.val;

        while(head.left != null) {
            min = head.left.val;
            head = head.left;
        }
        return min;
    }


}
