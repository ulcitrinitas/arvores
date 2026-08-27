package arvores;

import arvores.trees.NodeTree;
import arvores.trees.Tree;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TreeTest {

    @Test
    void nodeItem() {

        NodeTree node = new NodeTree(12);

        assertEquals(node.getItem(), 12);
    }

    @Test
    void parentNode() {

        NodeTree node = new NodeTree(12);

        assertEquals(node.getParent(), null);
    }

    @Test
    void newTree() {

        Tree tree = new Tree();

        assertEquals(tree.getRoot(), null);
        assertEquals(tree.getSize(), 0);

    }

    @Test
    void insertRootTest() {

        Tree tree = new Tree();

        var root = tree.insertRoot(15);

        assertEquals(tree.getRoot(), root);

    }

}
