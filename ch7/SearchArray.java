package ch7;

public class SearchArray {
    public static void main(String[] args) {
        double[] pi = {3, 1, 4, 1, 5, 9, 2, 6, 5, 4};
        int oneCt = 0;
        double num = 0;
        for (int i = 0; i < pi.length; i++) {
            num = pi[i];
            if (num == 1) {
                oneCt++;
            }
        }
        System.out.printf("oneCt: " + oneCt);
    }
}
