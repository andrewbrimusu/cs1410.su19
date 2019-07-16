package ch8.Arrays2D;

public class PassArrayTest {

    public static void main(String[] args) {
        int[] arr1 = {37, 22, 22, 20, 19};
        double avg = avgAge(arr1);
        System.out.println("Avg: " + avg);

        System.out.println("arr1");
        for(int i: arr1)
            System.out.println(i);
    }

    public static double avgAge(int[] arr2) {
        int sum = 0;
        for(int i=0; i < arr2.length; i++) {
            sum += arr2[i];
        }

        arr2 = new int[5];

        System.out.println("arr2");
        for(int i: arr2)
            System.out.println(i);

        return (sum / arr2.length);
    }
}
