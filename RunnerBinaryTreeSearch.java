import binarytree.BinaryTree;
import binarytreesearch.*;
public class RunnerBinaryTreeSearch {
    public static void main(String[] args) {
        BinaryTreeSearch b = new BinaryTreeSearch();
        b.insert(15);
        b.insert(7);
        b.insert(12);
        b.insert(10);
        
        System.out.println(b.search(12));
        System.out.println(b.search(3));

        System.out.println("InOrder: ");
        b.inOrder(b.root);

        System.out.println("Max: " + b.findMax());
    }
}
