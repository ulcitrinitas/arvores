package arvores.trees;

public class Tree {

    NodeTree root;

    int size;

    public Tree() {
        this.root = null;
        this.size = 0;
    }

    public NodeTree insertRoot(int val) {
        var node = new NodeTree(val);
        this.root = node;
        this.size = 1;

        return node;
    }

    public NodeTree getRoot() {
        return this.root;
    }

    public int getSize() {
        return this.size;
    }

    public boolean isEmpty() {
        if (this.size == 0) {
            return true;
        }

        return false;
    }
}
