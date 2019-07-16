public class DynamicStack<E> {
    private class StackNode<E> {
        public E value;
        public StackNode<E> next;

        public StackNode(E v) {
            this.value = v;
        }
    }

    private StackNode<E> top;

    public void push(E v) {
        StackNode<E> newTop = new StackNode<E>(v);
        newTop.next = top;
        top = newTop;
    }

    public E pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty");
        }

        StackNode<E> oldTop = top;
        top = oldTop.next;
        return oldTop.value;
    }

    public boolean isEmpty() {
        return this.top == null;
    }
}
