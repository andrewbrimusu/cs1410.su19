class BinarySearchTree { 
  
    /* Class containing left and right child of current node and key value*/
    class Node { 
        int key; 
        Node left, right; 
  
        public Node(int item) { 
            key = item; 
            left = right = null; 
        } 
    } 
  
    // Root of BST 
    Node root; 
  
    // Constructor 
    BinarySearchTree() {  
        root = null;  
    } 
  
    // This method mainly calls insertRec() 
    void insert(int key) { 
       root = insertRec(root, key); 
    } 
      
    /* A recursive function to insert a new key in BST */
    Node insertRec(Node root, int key) { 
  
        /* If the tree is empty, return a new node */
        if (root == null) { 
            root = new Node(key); 
            return root; 
        } 
  
        /* Otherwise, recur down the tree */
        if (key < root.key) 
            root.left = insertRec(root.left, key); 
        else if (key > root.key) 
            root.right = insertRec(root.right, key); 
  
        /* return the (unchanged) node pointer */
        return root; 
    } 
  
    // This method mainly calls InorderRec() 
    void inorder()  { 
       inorderRec(root); 
       System.out.println();
    } 
    
    // This method mainly calls PreorderRec() 
    void preorder()  { 
       preorderRec(root); 
       System.out.println();
    } 
  
    // This method mainly calls PostorderRec() 
    void postorder()  { 
       postorderRec(root); 
       System.out.println();
    } 
    
    // A utility function to do inorder traversal of BST 
    void inorderRec(Node root) { 
        if (root != null) { 
            inorderRec(root.left); 
            System.out.print(root.key + " "); 
            inorderRec(root.right); 
        } 
    } 
    
    void preorderRec(Node root) { 
        if (root != null) { 
            System.out.print(root.key + " ");
            preorderRec(root.left); 
            preorderRec(root.right); 
        } 
    } 
    
    void postorderRec(Node root) { 
        if (root != null) { 
            postorderRec(root.left); 
            postorderRec(root.right); 
            System.out.print(root.key + " ");
            
        } 
    } 
    
    public boolean findValueRecursively(Node currentNode, int value){
        System.out.println("value, key: " + value + ", " + currentNode.key);
        
        boolean isFound = false;
        
        if (value == currentNode.key){
          isFound = true;
          System.out.println("isFound: " + isFound);
          return isFound;
        } else if (value < currentNode.key){
          isFound = findValueRecursively(currentNode.left, value);
        } else{
          isFound = findValueRecursively(currentNode.right, value);
        }
        
        return isFound;
    }
    
    void deleteKey(int key) 
    { 
        root = deleteRec(root, key); 
    } 
  
    /* A recursive function to insert a new key in BST */
    Node deleteRec(Node root, int key) 
    { 
        /* Base Case: If the tree is empty */
        if (root == null)  return root; 
  
        /* Otherwise, recur down the tree */
        if (key < root.key) 
            root.left = deleteRec(root.left, key); 
        else if (key > root.key) 
            root.right = deleteRec(root.right, key); 
  
        // if key is same as root's key, then This is the node 
        // to be deleted 
        else
        { 
            // node with only one child or no child 
            if (root.left == null) 
                return root.right; 
            else if (root.right == null) 
                return root.left; 
  
            // node with two children: Get the inorder successor (smallest 
            // in the right subtree) 
            root.key = minValue(root.right); 
  
            // Delete the inorder successor 
            root.right = deleteRec(root.right, root.key); 
        } 
  
        return root; 
    } 

    int minValue(Node root) 
    { 
        int minv = root.key; 
        while (root.left != null) 
        { 
            minv = root.left.key; 
            root = root.left; 
        } 
        return minv; 
    } 
    
    // Driver Program to test above functions 
    public static void main(String[] args) { 
        BinarySearchTree tree = new BinarySearchTree(); 
  
        /* Let us create following BST 
              50 
           /     \ 
          30      70 
         /  \    /  \ 
       20   40  60   80 */
        tree.insert(50); 
        tree.insert(30); 
        tree.insert(20); 
        tree.insert(40); 
        tree.insert(70); 
        tree.insert(60); 
        tree.insert(80); 
  
        // print inorder traversal of the BST 
        tree.inorder(); 
        tree.preorder(); 
        tree.postorder(); 
        
        if(tree.findValueRecursively(tree.root, 80)) {
            System.out.println("found it");
        }
        else {
            System.out.println("not found");
        }
        
        tree.deleteKey(20);
        
        tree.inorder();
    } 
} 
// This code is contributed by Ankur Narain Verma 