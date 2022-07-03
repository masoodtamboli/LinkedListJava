package Tree;

import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
    }
}
//Variable widow

public class Tree1 {

    static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        // Node root = createTree();
        // inOrder(root);
        System.out.println(Integer.MIN_VALUE);
    }

    static Node createTree() {
        Node root = null;
        System.out.println("Enter data: ");
        int data = sc.nextInt();

        if (data == -1)
            return null;

        root = new Node(data);

        System.out.println("Enter left data for " + data);
        root.left = createTree();

        System.out.println("Enter right data for " + data);
        root.right = createTree();

        return root;
    }

    static void inOrder(Node root) {
        if (root == null)
            return;

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    static void preOrder(Node root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    static void postOrder(Node root) {
        if (root == null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    static int height(Node root) {
        if (root == null)
            return 0;
        return Math.max(height(root.left), height(root.right)) + 1;
    }

    static int size(Node root) {
        if (root == null)
            return 0;
        return size(root.left) + size(root.right) + 1;
    }

    static int getMax(Node root) {
        if (root == null)
            return Integer.MIN_VALUE;

        return Math.max(root.data, Math.max(getMax(root.left), getMax(root.right)));
    }

    static int getMin(Node root) {
        if (root == null)
            return Integer.MIN_VALUE;

        return Math.min(root.data, Math.min(getMin(root.left), getMin(root.right)));
    }

    static void levelOrderTraversal(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null); // This too
        while (!q.isEmpty()) {
            Node curr = q.poll();

            // Add this code print values in level order
            if (curr == null) {
                if (q.isEmpty()) {
                    return;
                }
                q.add(null);
                System.out.println();
                continue;
            }
            // End of this extra code

            System.out.print(curr.data + " ");
            if (root.left != null) {
                q.add(root.left);
            }
            if (root.right != null) {
                q.add(root.right);
            }
        }
    }
}
