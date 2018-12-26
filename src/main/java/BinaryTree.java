import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

/**
 * Created by mtumilowicz on 2018-12-23.
 */
class BinaryTree {
    Node root;

    Node greatestLowerBoundOf(int n1, int n2) {
        return greatestLowerBoundOf(root, n1, n2);
    }

    private Node greatestLowerBoundOf(Node node, int n1, int n2) {
        if (isNull(node)) {
            return null;
        }

        if (node.data == n1 || node.data == n2) {
            return node;
        }

        Node left_glb = greatestLowerBoundOf(node.left, n1, n2);
        Node right_glb = greatestLowerBoundOf(node.right, n1, n2);

        if (nonNull(left_glb) && nonNull(right_glb)) {
            return node;
        }

        return nonNull(left_glb) ? left_glb : right_glb;
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