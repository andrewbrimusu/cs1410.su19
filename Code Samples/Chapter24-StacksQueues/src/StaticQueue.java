public class StaticQueue<E> {
    private E[] data;
    private int front;
    private int back;
    private int count;

    public StaticQueue(int size) {
        data = (E[])(new Object[size]);
        front = -1;
        back = -1;
        count = 0;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == data.length;
    }

    public void enqueue(E v) throws Exception {
        if (isFull()) {
            throw new Exception("Queue is full");
        }
        // Can use % operator, but I like to show it this way
        // because it seems to be better understood by more students
        if (back == (data.length - 1)) {
            back = 0;
        }
        else {
            back++;
        }
        data[back] = v;
        count++;
        if (front == -1) {
            front = 0;
        }
    }

    public E dequeue() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }

        E result = data[front];

        if (front == (data.length - 1)) {
            front = 0;
        }
        else {
            front++;
        }
        count--;

        return result;
    }
}
