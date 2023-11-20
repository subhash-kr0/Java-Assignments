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

    Node inOrderPredecessor(Node root, Node n) {
        if (n.left != null) {
            Node p = n.left;
            while (p.right != null) {
                p = p.right;
            }
            return p;
        }

        Node p = null;
        while (root != null) {
            if (n.data > root.data) {
                p = root;
                root = root.right;
            } else if (n.data < root.data) {
                root = root.left;
            } else {
                break;
            }
        }
        return p;
    }
}

class sol_4 {
    public static void main(String args[]) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(50);
        tree.root.left = new Node(30);
        tree.root.left.left = new Node(20);
        tree.root.left.right = new Node(40);
        tree.root.right = new Node(70);
        tree.root.right.left = new Node(60);
        tree.root.right.right = new Node(80);

        Node temp = tree.root.left.right;
        Node res = tree.inOrderPredecessor(tree.root, temp);
        if (res != null) {
            System.out.println("Inorder predecessor of " + temp.data + " is " + res.data);
        } else {
            System.out.println("Inorder predecessor doesn't exist");
        }
    }
}
