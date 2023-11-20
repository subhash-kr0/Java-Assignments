import java.util.HashSet;
import java.util.Set;

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
    Set<Integer> set;

    BinaryTree() {
        set = new HashSet<>();
    }

    boolean findPairUtil(Node node, int sum) {
        if (node == null)
            return false;

        if (findPairUtil(node.left, sum))
            return true;

        if (set.contains(sum - node.data)) {
            System.out.println("Pair found (" + (sum - node.data) + ", " + node.data + ")");
            return true;
        } else
            set.add(node.data);

        return findPairUtil(node.right, sum);
    }

    void findPair(int sum) {
        if (!findPairUtil(root, sum))
            System.out.println("No pair found");
    }
}

class sol_6 {
    public static void main(String args[]) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(15);
        tree.root.left = new Node(10);
        tree.root.right = new Node(20);
        tree.root.left.left = new Node(8);
        tree.root.left.right = new Node(12);
        tree.root.right.left = new Node(16);
        tree.root.right.right = new Node(25);

        tree.findPair(33);
    }
}