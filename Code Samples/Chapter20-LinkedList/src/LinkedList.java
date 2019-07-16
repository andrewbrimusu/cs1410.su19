public class LinkedList<E extends Comparable> {
    private ListNode<E> head = new ListNode<>();
    private ListNode<E> tail;
    private int size;

    public LinkedList() {
        this.size = 0;
    }

    public void add(E o) {
        ListNode<E> node = new ListNode<>(o);

        if (tail == null) {
            head.next = tail = node;
        }
        else {
            tail.next = node;
            tail = node;
        }

        this.size++;
    }

    public void insert(E o) {
        ListNode<E> node = new ListNode<>(o);
        ListNode<E> current = head.next;
        ListNode<E> previous = head;

        while (current != null && current.value.compareTo(o) < 0) {
            previous = current;
            current = current.next;
        }

        previous.next = node;
        node.next = current;
        if (current == null) {
            tail = node;
        }

        this.size++;
    }

    public void remove(E o) {
        ListNode<E> node = head.next;
        ListNode<E> previous = head;

        while (node.next != null && node.value != o) {
            previous = node;
            node = node.next;
        }

        previous.next = node.next;
        if (previous.next == null) {
            tail = previous;
        }
        this.size--;
    }

    public boolean find(E o) {
        ListNode<E> node = head.next;
        boolean found = false;

        while (!found && node != null) {
            if (node.value == o) {
                found = true;
            }
            else {
                node = node.next;
            }
        }
        return found;
    }

    public void display() {
        ListNode<E> current = head.next;

        System.out.println("--- List Contents ---");
        while (current != null) {
            System.out.println(current.value);
            current = current.next;
        }
    }

    public int getSize() {
        return this.size;
    }
    public boolean isEmpty() { return this.size == 0; }

    private class ListNode<E> {
        public E value;
        public ListNode<E> next;

        public ListNode() {
        }

        public ListNode(E o) {
            this.value = o;
        }
    }
}
