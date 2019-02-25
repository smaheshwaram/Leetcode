package interview.binarytree.treetraversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//Level Order is breadth first search

public class LevelOrderTraversal {
    Node root = null;
    List<Integer> list;

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
        LevelOrderTraversal levelOrderTraversal = new LevelOrderTraversal();
        levelOrderTraversal.root = new Node(4);
        levelOrderTraversal.root.left = new Node(2);
        levelOrderTraversal.root.right = new Node(6);

        levelOrderTraversal.root.left.left = new Node(1);
        levelOrderTraversal.root.left.right = new Node(3);
        levelOrderTraversal.root.right.left = new Node(5);
        levelOrderTraversal.root.right.right = new Node(10);
        levelOrderTraversal.root.right.right.right = new Node(17);


        //Recursive printing level order
        System.out.println("Recursive printing of level order is: ");
        levelOrderTraversal.printLevelOrder(levelOrderTraversal.root);

        //printing level order iterative
        System.out.println("Iterative printing of level order is: ");
        levelOrderTraversal.printLevelOrderIterative(levelOrderTraversal.root);

        //Spiral printing BST clockwise
        System.out.println("Printing sprially of given binary search tree");
        levelOrderTraversal.spiralBSTPrint(levelOrderTraversal.root);

        //Printing sum of the nodes in each level
        System.out.println("Printing sum of the nodes in each level");
        levelOrderTraversal.printSumOfNodes(levelOrderTraversal.root);

        //Print highest weight of the tree node
        System.out.println("Printing highest weight of the tree node");
        levelOrderTraversal.highestNodeWeight(levelOrderTraversal.root);

    }

    private void printLevelOrder(Node head) {
        //To print level order first find height of the tree
        int height = heightOfTheTree(head);
        System.out.println("Height of the tree is: " + height);

        //Print nodes for each level
        for (int i = 1; i <= height; i++) {
            // we can also print at particular level too by adding if condition like if (i == 2 ) call method printLevelOrderNodes(head, i)

            //printing nodes for each level
            printLevelOrderNodes(head, i);
        }

    }

    private static int heightOfTheTree(Node head) {
        if (head == null) {
            return 0;
        }
        return 1 + Math.max(heightOfTheTree(head.left), heightOfTheTree(head.right));
    }

    private static void printLevelOrderNodes(Node head, int level) {
        if (head == null) {
            return;
        }

        if (level == 1) {
            System.out.println(head.val);
        }
        else if (level > 1) {
            printLevelOrderNodes(head.left, level - 1);
            printLevelOrderNodes(head.right, level - 1);
        }

    }


    //printing level order traversal in iterative using queue
    private void printLevelOrderIterative(Node head) {

        if (head == null) {
            return;
        }

        Queue<Node> queue = new LinkedList<>();

        queue.add(head);

        while(!queue.isEmpty()) {

            Node temp = queue.remove();

            System.out.println(temp.val);

            if (temp.left != null) {
                queue.add(temp.left);
            }
            if (temp.right != null) {
                queue.add(temp.right);
            }

        }

    }

    private void spiralBSTPrint(Node head) {
        if (head == null) {
            return;
        }

        int height = heightOfTheTree(head);

        //for clockwise printing
        boolean flag = true;

        //for anti clockwise printing initialize flag = false;

        for(int i=1; i<=height; i++) {
            printLevelOrderSpiral(head, i, flag);
            flag = !flag;

        }
    }

    private void printLevelOrderSpiral(Node head, int level, boolean flag) {

        if(head == null) {
            return;
        }

        if (level == 1) {
            System.out.println(head.val);
        }

        else if (level > 1) {
            if (flag) {
                printLevelOrderSpiral(head.left, level-1, flag);
                printLevelOrderSpiral(head.right, level-1, flag);
            }
            else {
                printLevelOrderSpiral(head.right, level-1, flag);
                printLevelOrderSpiral(head.left, level-1, flag);
            }


        }

    }

    private void printSumOfNodes(Node head) {
        if (head == null) {
            return;
        }
        int height = heightOfTheTree(head);

        for(int i=1; i<=height; i++) {

            int sum = 0;
            list = new ArrayList<>();
            sumOfNode(head, i);

            for(Integer j: list) {
                sum = sum + j;
            }
            System.out.println(sum);
        }
    }

    private void sumOfNode(Node head, int level) {
        if (head == null) {
            return;
        }

        if (level == 1) {
            list.add(head.val);
        }
        else if (level > 1) {
            sumOfNode(head.left, level - 1);
            sumOfNode(head.right, level - 1);
        }

    }

    private void highestNodeWeight(Node head) {
        if (head == null) {
            return;
        }

        //since given tree is binary search tree. Height weight node is right most node val
        if (head.right != null) {
            System.out.println(findMaxValueOfTree(head.right));
        } else {
            System.out.println(head.val);
        }

    }

    //Finding maximum node value in a given BST tree
    private int findMaxValueOfTree(Node head) {
        int max = head.val;

        while (head.right != null) {
            max = head.right.val;
            head = head.right;
        }
        return max;
    }



}
