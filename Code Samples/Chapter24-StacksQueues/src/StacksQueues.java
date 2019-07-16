public class StacksQueues {
    public static void main(String[] args) {
        demoStacks();
        demoQueues();
    }

    public static void demoQueues() {
        StaticQueue<Integer> ticketLine = new StaticQueue<>(4);
        try {
            System.out.println("--- Static Queue ---");
            ticketLine.enqueue(1);
            ticketLine.enqueue(2);
            ticketLine.enqueue(3);
            ticketLine.enqueue(4);
            while (!ticketLine.isEmpty()) {
                System.out.printf("%d ", ticketLine.dequeue());
            }
            ticketLine.enqueue(5);
            ticketLine.enqueue(6);
            System.out.printf("%d ", ticketLine.dequeue());
            System.out.printf("%d ", ticketLine.dequeue());
            System.out.println();
        }
        catch (Exception ex) {
            System.out.println("oops, something bad happened");
        }
    }

    public static void demoStacks() {
        try {
            System.out.println("--- Static Stack ---");
            StaticStack<String> cities = new StaticStack<>(10);
            cities.push("Paradise");
            cities.push("Nibley");
            cities.push("Milleville");


            while (!cities.isEmpty()) {
                System.out.println(cities.pop());
            }
        }
        catch (Exception ex) {
            System.out.println("Oops, something bad happened!");
        }

        try {
            System.out.println("--- Dynamic Stack ---");
            DynamicStack<String> cities = new DynamicStack<>();
            cities.push("Paradise");
            cities.push("Nibley");
            cities.push("Milleville");


            while (!cities.isEmpty()) {
                System.out.println(cities.pop());
            }
        }
        catch (Exception ex) {
            System.out.println("Oops, something bad happened!");
        }
    }
}
