package arvores.trees;

public class BinTree {
    
    BinTreeNode root;
    int size;

    public BinTree(){
        this.root = null;
        this.size = 0;
    }

    public void insertRoot(int val){
        var node = new BinTreeNode(val);

        this.root = node;
        this.size = 1;
    }
    
    public BinTreeNode getRoot(){
        return this.root;
    }

    public int getSize(){
        return this.size;
    }

    public boolean isEmpty(){
        return this.size != 0? true : false;
    }

}
