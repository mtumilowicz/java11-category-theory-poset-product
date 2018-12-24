import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;

/**
 * Created by mtumilowicz on 2018-12-24.
 */
public class BinaryTreeTest {

    /*
                1
             /     \
            2       3
          /        /   \
         4        5     6
          \
           7
               
     */
    @Test
    public void findLCA_root() {
        var tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.right.left = new Node(5);
        tree.root.right.right = new Node(6);
        tree.root.left.left.right = new Node(7);

        var lca = tree.findLCA(7, 6);
        assertThat(lca.data, is(1));
    }

    /*
                1
             /     \
            2       3
          /        /   \
         4        5     6
          \      / \      \
           7    8   9      10
               /
              11   
           
     */
    @Test
    public void findLCA_lca_subtree() {
        var tree = new BinaryTree();
        
        
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        
        tree.root.left.left = new Node(4);
        tree.root.right.left = new Node(5);
        tree.root.right.right = new Node(6);

        tree.root.left.left.right = new Node(7);
        tree.root.right.left.left = new Node(8);
        tree.root.right.left.right = new Node(9);
        tree.root.right.right.right = new Node(10);

        tree.root.right.left.left.left = new Node(11);
        
        var lca = tree.findLCA(8, 10);
        assertThat(lca.data, is(3));
    }
}