import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class DataLoader {
    public static void main(String[] args) {
        int avg = 5;
        try {
            BufferedReader scan1 = new BufferedReader(new FileReader("symc.csv"));
            double[] prcs = new double[250];
            int i = 0;
            while (i < 250) {
                prcs[i] = Double.parseDouble(scan1.readLine());
                System.out.println("prcs[i]: " + prcs[i]);
                i++;
            }
            int day = 0;
            double mva = 0.0;
            for (double d : prcs) {
                if (day >= avg) {
                    System.out.println(d);
                    mva = (prcs[day-1]+prcs[day-2]+prcs[day-3]+prcs[day-4]+prcs[day-5])/avg;
                    System.out.println("Today's price: " + d + ", 5 day MVA: " + mva);
                }
                day++;
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
