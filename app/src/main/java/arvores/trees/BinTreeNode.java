package arvores.trees;

public class BinTreeNode {

    public int item;
    BinTreeNode parent;
    BinTreeNode left;
    BinTreeNode right;

    public BinTreeNode(){
        this.item = 0;
        this.parent = null;
        this.left = null;
        this.right = null;
    }

    public BinTreeNode(int val){
        this.item = val;
        this.parent = null;
        this.left = null;
        this.right = null;
    }

    public BinTreeNode left(){
        if(this.left == null){
            return null;
        }

        return this.left;
    }

    public BinTreeNode right(){
        if(this.right == null){
            return null;
        }

        return this.right;
    }

    public boolean isLeft(){
        if(this.left == null){
            return false;
        }

        return true;
    }

    public boolean isRight(){
        if(this.right == null){
            return false;
        }

        return true;
    }

    public void binaryPreorder(){
        
        System.out.println(this.item + " ");

        if(this.isLeft()){
            this.left.binaryPreorder();
        }

        if(this.isRight()){
            this.binaryPreorder();
        }

    }


    
}
