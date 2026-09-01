package arvores.trees;

import java.util.ArrayList;

public class BinTreeNode {

    public int item;
    public BinTreeNode parent;
    public BinTreeNode left;
    public BinTreeNode right;

    ArrayList<Integer> binItens;

    public BinTreeNode() {
        this.item = 0;
        this.parent = null;
        this.left = null;
        this.right = null;

        this.binItens = new ArrayList<Integer>();
    }

    public BinTreeNode(int val) {
        this.item = val;
        this.parent = null;
        this.left = null;
        this.right = null;

        this.binItens = new ArrayList<Integer>();
    }

    public BinTreeNode left() {
        if (this.left == null) {
            return null;
        }

        return this.left;
    }

    public BinTreeNode right() {
        if (this.right == null) {
            return null;
        }

        return this.right;
    }

    public boolean isLeft() {
        if (this.left == null) {
            return false;
        }

        return true;
    }

    public boolean isRight() {
        if (this.right == null) {
            return false;
        }

        return true;
    }

    public void binaryPreorder() {

        System.out.print(this.item + " ");

        if (this.isLeft()) {
            this.left.binaryPreorder();
        }

        if (this.isRight()) {
            this.right.binaryPreorder();
        }

    }

    public void binaryPostorder() {

        if (this.isLeft()) {
            this.left.binaryPreorder();
        }

        if (this.isRight()) {
            this.right.binaryPreorder();
        }

        System.out.print(this.item + " ");

    }

    public void binaryInorder() {
        if (this.isLeft()) {
            this.left.binaryPreorder();
        }

        System.out.print(this.item + " ");

        if (this.isRight()) {
            this.right.binaryPreorder();
        }
    }

}
