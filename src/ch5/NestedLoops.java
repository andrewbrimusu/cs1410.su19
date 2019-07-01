package ch5;

public class NestedLoops {
    public static void main(String[] args) {
        outer:
        for (int i=1; i<=10; i++) {
            for (int j=1; j<=10; j++) {
                System.out.print(i*j+ " ");


                if (i == 6)
                    break outer;
            }
            System.out.println();
        }
    }
}
