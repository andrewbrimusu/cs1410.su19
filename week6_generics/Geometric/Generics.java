import java.util.ArrayList;

public class Generics {
    public static void main(String[] args) {

        GenericStack myStack = new GenericStack();

        GenericStack<String> stack1 = new GenericStack<>();
        stack1.push("Paradise");
        stack1.push("Nibley");
        stack1.push("Logan");
        stack1.push("Hyde Park");
        stack1.push("Smithfield");

        GenericStack<Integer> stack2 = new GenericStack<>();
        stack2.push(84328);
        stack2.push(84326);
        stack2.push(84321);
        stack2.push(84318);
        stack2.push(84335);

        while (!stack1.isEmpty()) {
            System.out.printf("City: %s\n", stack1.pop());
        }

        while (!stack2.isEmpty()) {
            System.out.printf("Zip Code: %d\n", stack2.pop());
        }

        String[] cities = { "Paradise", "Nibley", "Logan", "Hyde Park", "Smithfield" };
        Integer[] zipCodes = { 84328, 84326, 84321, 84318, 84335 };

        printArray(cities);
        printArray(zipCodes);

        Generics.<String>printArray(cities);
        Generics.<Integer>printArray(zipCodes);

        ArrayList<Circle> circles = new ArrayList<>();
        System.out.printf("Total Area: %.2f\n", totalArea(circles));

        Integer[] iData = { 72, 61, 80, 99, 2, 6, 71, 96, 48, 64 };
        String[] sData = { "Paradise", "Nibley", "Logan", "Hyde Park", "Smithfield", "Newton", "Clarkston" };

        sort(iData);
        for (int item : iData) {
            System.out.printf("%d ", item);
        }
        System.out.println();
        sort(sData);
        for (String city : sData) {
            System.out.printf("%s\n", city);
        }
    }


    public static <E> void printArray(E[] data) {
        for (E item : data) {
            System.out.printf("%s ", item);
        }
        System.out.println();
    }

    public static <T extends GeometricObject> boolean equalArea(T o1, T o2) {
        return o1.getArea() == o2.getArea();
    }

    public static <T extends GeometricObject> double totalArea(ArrayList<T> objects) {
        double total = 0;
        for (T item : objects) {
            total += item.getArea();
        }
        return total;
    }

//    public static double totalArea(ArrayList<GeometricObject> objects) {
//        double total = 0;
//        for (GeometricObject item : objects) {
//            total += item.getArea();
//        }
//        return total;
//    }

    //
    // Generic selection sort
    public static <E extends Comparable<E>> void sort(E[] data) {
        for (int start = 0; start < (data.length - 1); start++) {
            int minPos = start;
            for (int scan = start + 1; scan < data.length; scan++) {
                if (data[minPos].compareTo(data[scan]) > 0) {
                    minPos = scan;
                }
            }
            E temp = data[start];
            data[start] = data[minPos];
            data[minPos] = temp;
        }
    }
}

