package arvores;

import arvores.trees.*;

public class App {

    public static void main(String[] args) {
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

        tree.root.preorder();
        System.out.println("");

        Pprint.genDecorations(30);

        tree.root.postorder();
        System.out.println("");

        Pprint.genDecorations(30);

        Pprint.genDecorations(30);


        


    }
}
