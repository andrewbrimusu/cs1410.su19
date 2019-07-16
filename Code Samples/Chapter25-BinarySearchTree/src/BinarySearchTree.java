public class BinarySearchTree<E extends Comparable<E>> {
    private TreeNode<E> root;

    public void insert(E value) {
        if (root == null) {
            root = new TreeNode<E>(value);
        }
        else {
            TreeNode<E> parent = null;
            TreeNode<E> node = root;
            while (node != null) {
                parent = node;
                if (node.value.compareTo(value) < 0) {
                    node = node.right;
                }
                else if (node.value.compareTo(value) > 0) {
                    node = node.left;
                }
            }
            TreeNode<E> newNode = new TreeNode<>(value);
            if (parent.value.compareTo(value) < 0) {
                parent.right = newNode;
            }
            else {
                parent.left = newNode;
            }
        }
    }

    public void remove(E value) {
        // Start by finding the node and parent of the node to delete
        TreeNode<E> parent = null;
        TreeNode<E> node = root;
        boolean done = false;
        while (!done) {
            if (node.value.compareTo(value) < 0) {
                parent = node;
                node = node.right;
            }
            else if (node.value.compareTo(value) > 0) {
                parent = node;
                node = node.left;
            }
            else {
                done = true;
            }
        }
        // Case for no left child
        if (node.left == null) {
            if (parent == null) {
                root = node.right;
            }
            else {
                if (parent.value.compareTo(value) < 0) {
                    parent.right = node.right;
                }
                else {
                    parent.left = node.left;
                }
            }
        }
        else { // Case for left child
            TreeNode<E> parentOfRight = node;
            TreeNode<E> rightMost = node.left;
            while (rightMost.right != null) {
                parentOfRight = rightMost;
                rightMost = rightMost.right;
            }
            node.value = rightMost.value;
            if (parentOfRight.right == rightMost) {
                parentOfRight.right = rightMost.left;
            }
            else {
                parentOfRight.left = rightMost.left;
            }
        }
    }

    public boolean search(E value) {
        boolean found = false;
        TreeNode<E> node = root;

        while (!found && node != null) {
            if (node.value.compareTo(value) == 0) {
                found = true;
            }
            else if (node.value.compareTo(value) < 0) {
                node = node.right;
            }
            else {
                node = node.left;
            }
        }

        return found;
    }

    public void displayInOrder() {
        System.out.println("--- In Order Traversal ---");
        displayInOrder(root);
    }

    private void displayInOrder(TreeNode<E> node) {
        if (node != null) {
            displayInOrder(node.left);
            System.out.println(node.value);
            displayInOrder(node.right);
        }
    }

    private class TreeNode<E> {
        E value;
        TreeNode left;
        TreeNode right;

        public TreeNode(E value) {
            this.value = value;
        }
    }
}
