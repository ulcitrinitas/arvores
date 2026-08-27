package arvores.trees;

public class NodeTree {

    int item;

    NodeTree parent;
    NodeTree firstChild;
    NodeTree next;

    public NodeTree() {
        this.item = 0;

        this.parent = null;
        this.firstChild = null;
        this.next = null;
    }

    public NodeTree(int item) {
        this.item = item;

        this.parent = null;
        this.firstChild = null;
        this.next = null;
    }

    public int getItem() {
        return this.item;
    }

    public NodeTree getParent() {
        if (this.parent == null) {
            return null;
        }

        else {
            return this.parent;
        }
    }

    public void showParent() {
        if (this.parent == null) {
            System.out.println("Esse nó é o root, não possui pai...");
            return;
        }

        System.out.println("Pai: " + parent.item);
    }

    public void showChildren() {
        if (this.parent == null) {
            System.out.println("Esse nó não possui filhos...");
            return;
        }

        NodeTree trab = this.firstChild;

        while (trab != null) {
            System.out.println(trab.item);
            trab = trab.next;
        }
    }

    public boolean isInternal() {
        if (this.firstChild != null) {
            return true;
        }

        return false;
    }

    // retorna o número de ancestrais
    public int dept() {
        if (this.parent == null) {
            return 0;
        }

        return 1 + this.parent.dept();
    }

    public int height() {
        if (this.firstChild == null) {
            return 0;
        }

        int h = 0;

        NodeTree trab = this.firstChild;

        while (trab.next != null) {

            h = Math.max(h, trab.next.height());
            trab = trab.next;

        }

        return 1 + h;
    }

}
