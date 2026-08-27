package arvores;

import arvores.trees.*;

public class App {

    public static void main(String[] args) {
        var tree = new Tree();

        var treeNode = tree.insertRoot(500);

        Pprint.genDecorations(30);

        System.out.println("Raíz da árvore: " + treeNode);
        System.out.println("Valor da raíz: " + treeNode.getItem());

        Pprint.genDecorations(30);

        System.out.println("Raíz: " + tree.getRoot());
        System.out.println("Tamanho da árvore: " + tree.getSize());

        Pprint.genDecorations(30);

        var root = tree.insertRoot(15);

        System.out.println("Raíz: " + root);
        System.out.println("Raíz: " + tree.getRoot());
        System.out.println("Tamanho da árvore: " + tree.getSize());
    }
}
