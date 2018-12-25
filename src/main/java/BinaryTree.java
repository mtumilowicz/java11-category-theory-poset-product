import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

/**
 * Created by mtumilowicz on 2018-12-23.
 */
class BinaryTree {
    Node root;

    Node findLCA(int n1, int n2) {
        return findLCA(root, n1, n2);
    }

    private Node findLCA(Node node, int n1, int n2) {
        if (isNull(node)) {
            return null;
        }

        if (node.data == n1 || node.data == n2) {
            return node;
        }

        Node left_lca = findLCA(node.left, n1, n2);
        Node right_lca = findLCA(node.right, n1, n2);

        if (nonNull(left_lca) && nonNull(right_lca)) {
            return node;
        }

        return nonNull(left_lca) ? left_lca : right_lca;
    }
}

class Node {
    int data;
    Node left;
    Node right;

    Node(int item) {
        data = item;
    }
}