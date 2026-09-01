package arvores;

import arvores.trees.*;

public class App {

    public static void main(String[] args) {

        Pprint.genDecorations(30);

        System.out.println("Árvore");

        var tree = new Tree();

        tree.insertRoot(0);

        var no_1 = new NodeTree(1);
        var no_2 = new NodeTree(2);
        var no_3 = new NodeTree(3);
        var no_4 = new NodeTree(4);
        var no_5 = new NodeTree(5);

        tree.root.firstChild = no_1;
        no_1.parent = tree.root;
        no_1.next = no_2;

        no_2.parent = tree.root;
        no_2.next = no_3;

        no_3.parent = tree.root;

        no_2.firstChild = no_4;
        no_4.parent = no_2;

        no_4.next = no_5;
        no_5.parent = no_2;

        System.out.println("Preorder:");
        tree.root.preorder();
        System.out.println("");

        Pprint.genDecorations(30);

        System.out.println("Postorder:");
        tree.root.postorder();
        System.out.println("");

        Pprint.genDecorations(30);

        Pprint.genDecorations(30);

        System.out.println("Árvore binária");

        var binTree = new BinTree();

        binTree.insertRoot(0);

        var binNo_1 = new BinTreeNode(1);
        var binNo_2 = new BinTreeNode(2);
        var binNo_3 = new BinTreeNode(3);
        var binNo_4 = new BinTreeNode(4);
        var binNo_5 = new BinTreeNode(5);
        var binNo_6 = new BinTreeNode(6);

        binTree.root.left = binNo_1;
        binTree.root.right = binNo_2;

        binNo_2.left = binNo_3;
        binNo_2.right = binNo_4;

        binNo_3.left = binNo_5;
        binNo_3.right = binNo_6;

        System.out.println("Preorder:");
        binTree.root.binaryPreorder();
        System.out.println("");

        Pprint.genDecorations(30);

        System.out.println("Postorder:");
        binTree.root.binaryPostorder();
        System.out.println("");

        Pprint.genDecorations(30);

        System.out.println("Inorder:");
        binTree.root.binaryInorder();
        System.out.println("");

        Pprint.genDecorations(30);

    }
}
