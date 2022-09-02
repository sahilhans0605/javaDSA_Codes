package binarySearchTree;

//TC=logn also space complexity is logN.....in average case...perfectly balanced tree
//O(n)...in case of skewed binary tree...when all nodes come at one side only...either right or left...when we find key at leaf node
//So in interviews we should say Time complexity is O(Height) of tree...as height...is log n in balanced tree and height is n in skewed tree
class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
    }
}

public class SearchInABST {

    static boolean isPresent(Node root, int key) {
        if (root == null) return false;
        System.out.println(root.data);
        if (root.data == key) return true;
        if (key > root.data) return isPresent(root.right, key);
        else return isPresent(root.left, key);
    }

    static boolean isPresentIterative(Node root, int key) {
        Node cur = root;
        while (cur != null) {
            if (key == root.data) return true;
            if (key > root.data) cur = cur.right;
            else cur = cur.left;
        }
        return false;
    }

    //yha pe sorted order check krke insert krenge
//Insertion will always create a leaf node...
    static Node insertInABinarySearchTree(Node root, int key) {
        Node parent = null;
        Node cur = root;
        while (cur != null) {
            if (key > cur.data) {
                parent = cur;
                cur = cur.right;
            } else {
                parent = cur;
                cur = cur.left;
            }
        }
        Node newNode = new Node(key);
        if (parent == null) return newNode;
        if (key < parent.data) parent.left = newNode;
        else if (key > parent.data) parent.right = newNode;
        return root;
    }

//    static Node insertInABinarySearchTreeRecursive(Node root, int key) {
//    }

    static Node prev = null;

    static boolean checkIfATreeIsABSTOrNot(Node root) {
        if (root != null) {
            if (!checkIfATreeIsABSTOrNot(root.left)) {
                return false;
            }
            if (prev != null && root.data < prev.data) {
                return false;
            }
            prev = root;
            return checkIfATreeIsABSTOrNot(root.right);
        }
        return true;//if root is null
    }

    static Node sortedArrayToBalancedBST(int a[], int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        Node root = new Node(a[mid]);
        root.left = sortedArrayToBalancedBST(a, start, mid - 1);
        root.right = sortedArrayToBalancedBST(a, mid + 1, end);
        return root;
    }

    static void inorderTraversal(Node root) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.left);
        System.out.println(root.data + " ");
        inorderTraversal(root.right);
    }

    public static void main(String[] args) {
//same like binary search tree...
        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(80);
        root.left.left = new Node(20);
        root.right.right = new Node(40);
        root.right.left = new Node(70);
        root.right.right = new Node(100);
        root.right.left.left = new Node(60);
//        System.out.println(isPresent(root, 0));
        int a[] = {10, 20, 30, 40, 50};
        Node roots = sortedArrayToBalancedBST(a, 0, a.length - 1);
        inorderTraversal(roots);

    }
}