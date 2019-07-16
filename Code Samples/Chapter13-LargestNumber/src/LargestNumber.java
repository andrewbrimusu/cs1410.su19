import java.util.ArrayList;
import java.math.*;

public class LargestNumber {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();

        list.add(42);
        list.add(1337.33);
        list.add(new BigInteger("12345678901234567890"));
        list.add(new BigDecimal("2.0101010101010101980124"));

        System.out.printf("The largest number is: %s\n", getLargestNumber(list));
    }

    public static Number getLargestNumber(ArrayList<Number> list) {
        if (list.size() == 0) return null;

        Number biggest = list.get(0);
        for (Number n : list) {
            if (n.doubleValue() > biggest.doubleValue()) {
                biggest = n;
            }
        }

        return biggest;
    }
}
