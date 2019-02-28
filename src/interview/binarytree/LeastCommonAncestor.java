package interview.binarytree;

/**
 * I have a binary tree as below. I need to find the least common ancestor (LCA). e.g LCA of 6 and 4 is 1, LCA of 4 and 5 is 2.
 *
 *     1
 *    / \
 *   2   3
 *  / \ / \
 * 4  5 6  7
 */

public class LeastCommonAncestor {
    Node root = null;

    static class Node{
        Node left;
        Node right;
        int val;

        Node(int val) {
            left = null;
            right = null;
            this.val = val;
        }
    }

    public static void main(String[] args) {
        LeastCommonAncestor leastCommonAncestor = new LeastCommonAncestor();

        Node temp = leastCommonAncestor.findLCA(createBinaryTree(), 2, 5);

        System.out.println(temp.val);
    }

    private static Node createBinaryTree() {
        LeastCommonAncestor leastCommonAncestor = new LeastCommonAncestor();
        leastCommonAncestor.root = new Node(4);
        leastCommonAncestor.root.left = new Node(2);
        leastCommonAncestor.root.right = new Node(6);

        leastCommonAncestor.root.left.left = new Node(1);
        leastCommonAncestor.root.left.right = new Node(3);
        leastCommonAncestor.root.right.left = new Node(5);
        leastCommonAncestor.root.right.right = new Node(7);

        return leastCommonAncestor.root;
    }

    //finding LCA(x,y)
    private Node findLCA(Node head, int x, int y) {
        if (head == null) {
            return null;
        }

        if (x < head.val && y < head.val) {
            return findLCA(head.left, x, y);
        }
        else if (x > head.val && y > head.val) {
            return findLCA(head.right, x, y);
        } else {
            return head;
        }
    }

}
