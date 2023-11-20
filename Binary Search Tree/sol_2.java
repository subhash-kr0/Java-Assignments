import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node left, right;
    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    boolean isCompleteBT(Node root) {
        if (root == null)
            return true;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        boolean flag = false;

        while (!queue.isEmpty()) {
            Node temp_node = queue.remove();

            if (temp_node.left != null) {
                if (flag == true)
                    return false;

                queue.add(temp_node.left);
            } else
                flag = true;

            if (temp_node.right != null) {
                if (flag == true)
                    return false;

                queue.add(temp_node.right);
            } else
                flag = true;
        }
        return true;
    }
}

class sol_1 {
    public static void main(String args[]) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);

        if (tree.isCompleteBT(tree.root) == true)
            System.out.println("Complete Binary Tree");
        else
            System.out.println("NOT Complete Binary Tree");
    }
}