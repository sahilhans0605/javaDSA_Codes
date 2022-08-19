package binaryTreeBasics;

import java.util.Scanner;


public class BinaryTreeBasicsCreation {

    Scanner sc;

    class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }



    public BinaryTreeBasicsCreation() {
        sc = new Scanner(System.in);
    }

    void nodesAtDistanceKFromRoot(Node root ,int k){
        if(root==null)return;
        if(k==0) {
            System.out.println(root);
            return;
        }
        nodesAtDistanceKFromRoot(root.left,k-1);
        nodesAtDistanceKFromRoot(root.right,k-1);
    }

    Node createBinaryTree() {
        System.out.println("Enter node data");
        int data = sc.nextInt();
        if (data == -1) {
            return null;
        }
        Node node = new Node(data);
        System.out.println("Enter" + data + " 's left data");
        node.left = createBinaryTree();
        System.out.println("Enter" + data + " 's right data");
        node.right = createBinaryTree();
        return node;
    }

    void inorderTraversal(Node root) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.left);
        System.out.println(root.data);
        inorderTraversal(root.right);
    }

    int heightOfATree(Node root) {
        if (root == null) return 0;
        int lh = heightOfATree(root.left);
        int rh = heightOfATree(root.right);
        return Math.max(lh, rh) + 1;//Tc is O(n) because it travels all nodes n is number of nodes
//Space complexity==>recursive stack is used...by compiler and recursion--->O(height of tree) and in worstcase number of nodes == height of tree
//        Maximum number of nodes at any level is 2^k...k is the level number level starts from upside level0 and so on
//        Maximum number of nodes in a binary tree with height h (2^h)-1

    }

    public static void main(String[] args) {
        BinaryTreeBasicsCreation binaryTreeBasicsCreation = new BinaryTreeBasicsCreation();
        Node root = binaryTreeBasicsCreation.createBinaryTree();

    }
}
