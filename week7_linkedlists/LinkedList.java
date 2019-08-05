public class LinkedList { 
    Node head; // head of list 
  
    /* Linked list Node*/
    class Node { 
        int data; 
        Node next; 
  
        // Constructor to create a new node 
        // Next is by default initialized 
        // as null 
        Node(int d) { data = d; } 
    } 
    
    public LinkedList() {
        Node head = new Node(10);
        head.next = null;
    }
    
    boolean public find(int num) {
        Node nd = head;
        while (nd != null) {
            
        }
    }
    
    public static void main(String[] args) {
        
    }
}

