import binarytree.BinaryTree;
import binarytree.Node;

public class RunnerBinaryTree {
    public static void main(String[] args) {
        Node n1 = new Node();
        n1.data = "Celine";

        Node n2 = new Node();
        n2.data = "Layal";

        Node n3 = new Node();
        n3.data = "Dana";

        Node n4 = new Node();
        n4.data = "Jouri";

        Node n5 = new Node();
        n5.data = "Jungkook";

        Node n6 = new Node();
        n6.data = "Taehyung";

        BinaryTree b = new BinaryTree();
        b.root = n1;
        n1.left = n2;
        n1.right = n3;
        n2.left = n5;
        n2.right = n4;
        n3.right = n6;

        System.out.println("Size: " + b.size());
        System.out.println("Height: " + b.height());
        b.printNode();
        System.out.println("InOrder: ");
        b.inOrder();
        System.out.println("");
        System.out.println("PreOrder: ");
        b.preOrder();
        System.out.println("");
        System.out.println("PostOrder: ");
        b.postOrder();

        Node c1 = new Node();
        c1.data = "A";

        Node c2 = new Node();
        c2.data = "B";

        Node c3 = new Node();
        c3.data = "C";

        Node c4 = new Node();
        c4.data = "D";

        Node c5 = new Node();
        c5.data = "E";

        Node c6 = new Node();
        c6.data = "F";

        BinaryTree d = new BinaryTree();
        d.root = c1;
        c1.left = c2;
        c1.right = c3;
        c2.left = c4;
        c2.right = c5;
        c3.left = c6;

        System.out.println("");
        System.out.println("InOrder: ");
        d.inOrder();
        System.out.println("");
        System.out.println("PreOrder: ");
        d.preOrder();

        // BinaryTree add = new BinaryTree();
        // add.root = new Node(2);
        // add.root.left = new Node(4);
        // add.root.right = new Node(1);
        // add.root.right.left = new Node(3);
        // add.root.left.right = new Node(5);
        // add.root.right.right = new Node(3);
    
        // System.out.println("Sum: " + add.sum());

    }

}
