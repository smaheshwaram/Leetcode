package interview;

public class MirrorTree {
    static Node tree1, tree2;

    // Node class
    class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }

    }

    public static void main(String[] args) {
        MirrorTree mirrorTree = new MirrorTree();
        //ToDo: create two binary trees and pass them
        mirrorTree.isMirrorTree(tree1, tree2);

    }

    private boolean isMirrorTree(Node tree1, Node tree2) {
        //if both trees are empty or null
        if (tree1 == null && tree2 == null) {
            return true;
        }
        //if one of the trees is null
        else if (tree1 == null || tree2 == null) {
            return false;
        } else {
            return isMirrorTree(tree1.left, tree1.right) && isMirrorTree(tree1.right, tree1.left) &&
                    tree1.data == tree2.data;
        }
    }
}

