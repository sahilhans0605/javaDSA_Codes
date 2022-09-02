package binarySearchTree;

import java.util.ArrayList;

//TC is O(Height)
//SC...Stack frame...O(H)
public class BinarySearchTreeAllQuestions {

    public static Node insertInABST(Node root, int ele) {
        if (root == null) {
            root = new Node(ele);
            return root;
        }
        if (root.data > ele) {
            root.left = insertInABST(root.left, ele);
        } else {
            root.right = insertInABST(root.right, ele);
        }
        return root;
    }

    public static void inorderTraversal(Node root) {
        if (root == null) return;
        inorderTraversal(root.left);
        System.out.println(root.data);
        inorderTraversal(root.right);
    }

    public static boolean searchInABST(Node root, int key) {//O(height)
        if (root == null) return false;
        if (root.data == key) return true;
        if (root.data > key) {
            return searchInABST(root.left, key);
        } else {
            return searchInABST(root.right, key);
        }
    }

    public static Node deleteInABST(Node root, int target) {
        if (root == null) {
            return null;
        }
        if (root.data == target) {
            if (root.left == null && root.right == null) {//when root is a leaf node we return null to parent root..means deleting or ignoring that node...considering that node as null
                return null;
            } else if (root.right == null) {//when right node is null....both can't be null...because
                return root.left;
            } else if (root.left == null) {//left node is null
                return root.right;
            } else {//when both are not null
//                firstly we will find inorder successor...after that we will return that inorder successor to that parent node....
                Node IS = inorderSuccessor(root.right);//IS mein root aajayega
                root.data = IS.data;//swap krdiya IS aur root ko...root mei IS aajayega
                root.right = deleteInABST(root.right, IS.data);//...ab IS mein root h toh IS ko delte krdo because IS waale ke paas 0/1 child honge ye pkka hai
            }
        }
        if (root.data > target) {//abhi toh delete krna baaki hai
            root.left = deleteInABST(root.left, target);
        } else {
            root.right = deleteInABST(root.right, target);
        }
        return root;
    }

    private static Node inorderSuccessor(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public static void printInRange(Node root, int x, int y) {

        if (root == null) return;

        if (x <= root.data && y >= root.data) {
            printInRange(root.left, x, y);
            System.out.println(root.data);
            printInRange(root.right, x, y);
        } else if (x >= root.data) {
            printInRange(root.right, x, y);
        } else {
            printInRange(root.left, x, y);
        }
    }


    public static void rootToLeafPath(Node root, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }
        list.add(root.data);
        if (root.left == null && root.right == null) {
            printPath(list);
        } else {
            rootToLeafPath(root.left, list);
            rootToLeafPath(root.right, list);
        }

        list.remove(list.size() - 1);

    }

    private static void printPath(ArrayList<Integer> list) {
        for (int e : list) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int values[] = {8, 5, 3, 6, 10, 11, 14};
        Node root = null;//nya tree bnaya...

        for (int i = 0; i < values.length; i++) {
            root = insertInABST(root, values[i]);
        }
//        Now for checking that it is correct we will do it's inorder traversal and it should be sorted.
        inorderTraversal(root);
        System.out.print(searchInABST(root, 7));
        inorderTraversal(root);
        deleteInABST(root, 4);
        inorderTraversal(root);
        System.out.println("---------------------------------------------");
        printInRange(root, 3, 10);
        System.out.println("---------------------------------------------");
        rootToLeafPath(root,new ArrayList<Integer>());
    }
}
