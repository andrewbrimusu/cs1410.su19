public class Driver {
    public static void main(String[] args) {
        BinarySearchTree<Integer> myTree = new BinarySearchTree<>();

        myTree.insert(10);
        myTree.insert(4);
        myTree.insert(14);
        myTree.insert(2);
        myTree.insert(12);
        myTree.insert(6);
        myTree.insert(16);

        myTree.displayInOrder();

        myTree.remove(10);
        myTree.displayInOrder();
        myTree.remove(16);
        myTree.displayInOrder();

        myTree.insert(8);
        myTree.displayInOrder();
    }
}
