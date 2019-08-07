
public class GenericStack<E> {
    private java.util.ArrayList<E> list = new java.util.ArrayList<>();

    public int getSize() { return list.size(); }
    public E peek(){ return list.get(getSize() - 1); }
    public boolean isEmpty() { return list.isEmpty(); }

    public void push(E item) {
        list.add(item);
    }

    public E pop() {
        E top = list.get(getSize() - 1);
        list.remove(getSize() - 1);

        return top;
    }

    public void comp() {
        System.out.println(peek().compareTo(list.get(0)));
    }
    @Override
    public String toString() {
        return "stack: " + list.toString();
    }
}
