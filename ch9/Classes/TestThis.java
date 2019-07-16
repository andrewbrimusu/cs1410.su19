package ch9.Classes;

public class TestThis {
    private int i = 5;
    private static double k = 0;
    void setI(int i2) { this.i = i2; }
    public int getI() { return i; }

    public static void main(String[] args) {
        TestThis t1 = new TestThis();
        t1.setI(37);
        System.out.println("i: " + t1.getI());
    }
}
