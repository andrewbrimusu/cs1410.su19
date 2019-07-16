public class StaticStack<E> {
    private E[] data;
    private int top;

    public StaticStack(int maxSize) {
        this.data = (E[])new Object[maxSize];   // Stinking type erasure in Java!
        this.top = -1;
    }

    public void push(E v) throws Exception {
        if (isFull()) {
            throw new Exception("Stack is full");
        }

        top++;
        data[top] = v;
    }

    public E pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty");
        }

        return data[top--];
    }

    public boolean isFull() {
        return this.top == this.data.length - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
