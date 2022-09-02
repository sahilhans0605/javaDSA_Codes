package binaryTreeBasics;

import java.util.*;

public class BinaryTreeBasicsCreation<sc> {
    Scanner sc = new Scanner(System.in);

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }


    static int nodesAtDistanceKFromRoot(Node root, int k) {
        if (root == null) return 0;
        if (k == 0) {
            return root.data;
        }
        return nodesAtDistanceKFromRoot(root.right, k - 1) + nodesAtDistanceKFromRoot(root.left, k - 1);

    }


    static int idx = -1;

    static Node createBinaryTree(int[] Nodes) {
//        System.out.println("Enter node data");
//        int data = sc.nextInt();
//        if (data == -1) {
//            return null;
//        }
//        Node node = new Node(data);
//        System.out.println("Enter" + data + " 's left data");
//        node.left = createBinaryTree();
//        System.out.println("Enter" + data + " 's right data");
//        node.right = createBinaryTree();
//        return node;

//        ----------------------------------------Good-----------------------------------

        idx++;
        if (Nodes[idx] == -1) {
            return null;
        }
        Node newNode = new Node(Nodes[idx]);
        newNode.left = createBinaryTree(Nodes);
        newNode.right = createBinaryTree(Nodes);
        return newNode;
    }

    static void inorderTraversal(Node root) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.left);
        System.out.println(root.data);
        inorderTraversal(root.right);
    }

//    int heightOfATree(Node root) {
//        if (root == null) return 0;
//        int lh = heightOfATree(root.left);
//        int rh = heightOfATree(root.right);
//        return Math.max(lh, rh) + 1;//Tc is O(n) because it travels all nodes n is number of nodes
////Space complexity==>recursive stack is used...by compiler and recursion--->O(height of tree) and in worstcase number of nodes == height of tree
////        Maximum number of nodes at any level is 2^k...k is the level number level starts from upside level0 and so on
////        Maximum number of nodes in a binary tree with height h (2^h)-1
//
//    }

    static void preorder(BinaryTreeBasicsCreation.Node root) {

        if (root == null) {
            return;
        }

        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }

    static void postorder(BinaryTreeBasicsCreation.Node root) {

        if (root == null) {
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data);
    }

    static int SumOfNodes(Node root) {

        if (root == null) {
            return 0;
        }

        int leftSum = SumOfNodes(root.left);
        int rightSum = SumOfNodes(root.right);
        int totalSum = leftSum + rightSum + root.data;
        return totalSum;
    }

    static int numberOfNodes(BinaryTreeBasicsCreation.Node root) {
        if (root == null) {
            return 0;
        }
        int sum = numberOfNodes(root.left) + numberOfNodes(root.right);
        return sum + 1;//+1 for root node
    }

    static int heightOfATree(Node root) {
        if (root == null) {
            return 0;
        }
        int maxLeft = heightOfATree(root.left);
        int maxRight = heightOfATree(root.right);
        return Math.max(maxLeft, maxRight) + 1;
    }

    static int diameterOfATree(Node root) {//timeComplexity is O(n^2)...as height and diameter both are called
//        Number of nodes in the longest path between any two nodes
//        Diameter can pass or not pass through root node of tree
        if (root == null) {
            return 0;
        }
        int diam1 = diameterOfATree(root.left);
        int diam2 = diameterOfATree(root.right);
        int diam3 = heightOfATree(root.left) + heightOfATree(root.right) + 1;
        return Math.max(Math.max(diam3, diam2), diam1);
    }

    public static class TreeDiameterOptimised {
        int height;
        int diameter;

        public TreeDiameterOptimised(int height, int diameter) {
            this.height = height;
            this.diameter = diameter;
        }
    }

    static int max = Integer.MIN_VALUE;

    private static int func(Node root) {
        if (root == null) return 0;
        int left = func(root.left);
        int right = func(root.right);
        max = Math.max(max, left + right + 1);//ye max x,y waali height store krega...toh trick se humne
        return 1 + (Math.max(left, right));//ye upar tree ko pass krta jayega height
    }

    static int diameterOfATreeOptimised(Node root) {//timeComplexity is O(n^2)...as height and diameter both are called
//        Number of nodes in the longest path between any two nodes
//        Diameter can pass or not pass through root node of tree
        int x = func(root);
        return max;
    }


    static boolean subTreeOfAnotherTree(Node root, Node subRoot) {
        if (subRoot == null) {
            return true;
        }
        if (root == null) {
            return false;
        }
        if (root.data == subRoot.data) {
            if (isIdentical(root, subRoot)) {
                return true;
            }
        }
        return subTreeOfAnotherTree(root.left, subRoot) || subTreeOfAnotherTree(root.right, subRoot);
    }

    private static boolean isIdentical(Node root, Node subRoot) {
        if (root == null && subRoot == null) {
            return true;
        }

        if (root == null || subRoot == null) {
            return false;
        }
        if (root.data == subRoot.data) {
            return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
        }
        return false;
    }

    private static void levelOrderTraversal(Node root) {//Tc isO(n)...because every element is traversed once
        if (root == null) {
            return;
        }
        Queue queue = new LinkedList();
        queue.add(root);
        queue.add(null);
        while (!queue.isEmpty()) {
            Node curr = (Node) queue.poll();
            if (curr == null) {
                System.out.println();

                if (queue.isEmpty()) {
                    break;
                } else {
                    queue.add(null);
                }
            } else {
                System.out.print(curr.data + " ");
                if (curr.left != null) {
                    queue.add(curr.left);
                }
                if (curr.right != null) {
                    queue.add(curr.right);
                }
            }
        }
//        Level order traversal is BFS of trees...we take siblings into consideration, we don't go in depth.
//        DFS...depth is inorder,preorder,postorder

    }

    static List<List<Integer>> zigZagTraversal(Node root) {
        List<List<Integer>> list = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        if (root == null) {
            return null;
        }
        queue.add(root);
        boolean leftToRight = false;
        while (!queue.isEmpty()) {
            LinkedList<Integer> sublist = new LinkedList<>();
            for (int i = 0; i < queue.size(); i++) {
                Node curr = queue.poll();
                if (curr.left != null) {
                    queue.add(curr.left);
                }
                if (curr.right != null) {
                    queue.add(curr.right);
                }

                if (leftToRight) {
                    sublist.addFirst(curr.data);
                } else {
                    sublist.addLast(curr.data);
                }
            }
            leftToRight = !leftToRight;
            list.add(sublist);

        }
        return list;
    }

    static void leftViewOfABinaryTree(Node root) {
        ArrayList<Node> list = new ArrayList<>();
        leftViewUtil(root, list, 0);
        for (Node curr : list) {
            System.out.print(curr.data + " ");
        }
    }

    static void topViewOfABinaryTree(Node root) {
        Queue<Pair> queue = new LinkedList<>();
        Map<Integer, Integer> map = new TreeMap<>();//treemap so as to get sorted values....
        queue.add(new Pair(0, root));

        while (!queue.isEmpty()) {
            Pair cur = queue.poll();
            if (!map.containsKey(cur.hd)) {//bottom view mein ye condition nhi aayegi bss
                map.put(cur.hd, cur.node.data);
            }
            if (cur.node.left != null) {
                queue.add(new Pair(cur.hd - 1, cur.node.left));
            }
            if (cur.node.right != null) {
                queue.add(new Pair(cur.hd + 1, cur.node.right));
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.print(entry.getValue() + " ");
        }

    }

    private static void leftViewUtil(Node root, ArrayList<Node> list, int level) {
        if (root == null) {
            return;
        }
        if (list.size() == level) {
            list.add(level, root);
        }
        leftViewUtil(root.left, list, level + 1);
        leftViewUtil(root.right, list, level + 1);//for right view this will be written upwards
    }

    static class Pair {
        int hd;
        Node node;

        public Pair(int hd, Node node) {
            this.hd = hd;
            this.node = node;
        }
    }

    static void inorderIterative(Node root) {
        Node cur = root;
        Stack<Node> stack = new Stack<>();

        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {//left waala part
                stack.push(cur);
                cur = cur.left;
            }
            Node pop = stack.pop();//Root node
            System.out.println(pop.data);
            cur = pop.right;//right...ab right waala dalenge fir use baad push krenge
        }
    }

    static void preorderIterative(Node root) {
//        phle data print krenge fir right side fir left because this is stack and left is up and it will pop upper elements firstly
    }

    static boolean printAllAncestorsOfABinaryTree(Node root, int target) {
        if (root == null) {
            return false;
        }
        if (root.data == target) {
            return true;
        }
        if (printAllAncestorsOfABinaryTree(root.left, target) || printAllAncestorsOfABinaryTree(root.right, target)) {
            System.out.println(root.data + " ");
            return true;
        }
        return false;//O(n)...where n is the number of nodes in a binary tree
    }

    static Node lowestCommonAncestorOfABinaryTree(Node root, int n1, int n2) {

        if (root == null) return null;

        if (root.data == n1 || root.data == n2) {
            return root;
        }

        Node left = lowestCommonAncestorOfABinaryTree(root.left, n1, n2);
        Node right = lowestCommonAncestorOfABinaryTree(root.right, n1, n2);

        if (left == null) return right;
        if (right == null) return left;

        return root;
    }
    static Node prev = null;
    static Node head = null;

    static void binaryTreeToDoublyLinkedList(Node root) {
        if (root == null) return;
        binaryTreeToDoublyLinkedList(root.left);
        if (prev == null) head = root;
        else{
            root.left=prev;
            prev.right=root;
        }
        prev=root;
        binaryTreeToDoublyLinkedList(root.right);
    }


    public static void main(String[] args) {
        BinaryTreeBasicsCreation binaryTreeBasicsCreation = new BinaryTreeBasicsCreation();
        int tree[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        Node root = binaryTreeBasicsCreation.createBinaryTree(tree);
        System.out.println(root.data);
        System.out.println("*******************");
        preorder(root);//root is printed in starting
        System.out.println("*******************");
        inorderTraversal(root);//root is printed in between
        System.out.println("*******************");
        postorder(root);//root is printed at the end
//        O(n) time complexity...as it has gone through all the nodes of tree...n is number of nodes
        System.out.println("*******************");
        levelOrderTraversal(root);
        System.out.println("*******************");
        System.out.println(numberOfNodes(root));
        System.out.println("*******************");
        System.out.println(SumOfNodes(root));
        System.out.println("*******************");
        System.out.println(heightOfATree(root));
        System.out.println("*******************");
        System.out.println(diameterOfATree(root));
        System.out.println("*******************");
        System.out.println(nodesAtDistanceKFromRoot(root, 2));
        System.out.println("*******************");
        List<List<Integer>> list = zigZagTraversal(root);
        System.out.println(list);
        System.out.println("*******************");
        leftViewOfABinaryTree(root);
        System.out.println("*******************");
        topViewOfABinaryTree(root);
        System.out.println("*******************");
        inorderIterative(root);
        System.out.println("*******************");
        System.out.println(diameterOfATreeOptimised(root));
        System.out.println("*******************");
        printAllAncestorsOfABinaryTree(root, 4);
        System.out.println("*******************");
        binaryTreeToDoublyLinkedList(root);
    }


}