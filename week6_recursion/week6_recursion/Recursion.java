public class Recursion {
    public static void main(String[] args) {
        
        int n = 100;
        int sum = 0;
        for(int i=1; i<=n; i++) {
            sum += i;
        }
        System.out.println("sum: " + sum);
        
        System.out.println("sum recursively: " + sumAllNums(100));
        
        System.out.println("4 factorial: " + factorial(0));
    }
    
    public static int sumAllNums(int num) {
        if (num == 0) return num;
        return num + sumAllNums(num-1);
    }
    
    public static double factorial(double num) {
        if (num == 2) return num;
        if (num == 1 || num == 0) return 1;
        if (num < 0) return -1;
        
        return num * factorial(num-1);
    }
    
}