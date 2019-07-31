import java.util.Arrays;

public class Recursion {
    
    public static int sumAllNums(int num) {
        if (num == 0) return num;
        return num + sumAllNums(num-1);
    }
    
    public static double factorial(double num) {
        if (num == 2) return num;
        if (num == 1 || num == 0) return 1;
        if (num < 0) return -1;
        
        return num * factorial(num-1);
    } // return 4 * 3 * 2 * 1
    
    
    public static double expIter(double base, int exp) {
        
        if(exp < 0.0) {
            return 1.0 / expIter(base, (-1*exp));
        }
        
        
        
        //base = 10
        //exp = 3
        double res = 1.0;
        for(int i=0; i<exp; i++) {
            res = res * base;
        }
        return res;
    }
    
    
    public static double expRecur(double base, int exp) {
        
        if(exp < 0) {
            return 1.0 / expRecur(base, (-1*exp));
        }
        if(exp == 1) {
            return base;
        }
        if(exp == 0) {
            return 1;
        }
        
        return base * expRecur(base,exp-1);
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static int exponent(int base, int n) {
        if (n == 0) {
            return 1;
        }
        return exponent(base, n-1) * base;
    }
    
    public static long fib(long n) {
      if ((n == 0) || (n == 1))
         return n;
      else
         return fib(n - 1) + fib(n - 2);
   }
    
    public static int binarySearch(int search, int[] array) {

		int start = 0;
		int end = array.length - 1;

		while (start <= end) {
			
			int middle = (start + end) / 2;
			
			if (search < array[middle]) {
				end = middle - 1;
			}

			if (search > array[middle]) {
				start = middle + 1;
			}
			
			if (search == array[middle]) {
				return middle;
			}
		}
		return -1;

	}
	
	public static int binarySearchRecursive(int search, int[] array, int start, int end){
				
		int middle = (start + end)/2;
		
		if(end < start){
			 return -1;
		} 
		
		
		if (search < array[middle]){
			return binarySearchRecursive(search, array, start, middle - 1);
		}
		
		if (search > array[middle]){
			return binarySearchRecursive(search, array, middle + 1, end);
		}
		
		if (search == array[middle]){
			return middle;
		}
		
		return -1;
	}
	
	static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod) //A C B
    { 
        if (n == 1) 
        { 
            System.out.println("Move disk 1 from rod " +  from_rod + " to rod " + to_rod); 
            return; 
        } 
        towerOfHanoi(n-1, from_rod, aux_rod, to_rod); //A B C
        System.out.println("Move disk " + n + " from rod " +  from_rod + " to rod " + to_rod); 
        towerOfHanoi(n-1, aux_rod, to_rod, from_rod); //B C A
    }
    
    
    
    
    
    public static void main(String[] args) {
        
        int n = 100;
        int sum = 0;
        for(int i=1; i<=n; i++) {
            sum += i;
        }
        System.out.println("sum: " + sum);
        
        System.out.println("sum recursively: " + sumAllNums(100));
        
        System.out.println("4 factorial: " + factorial(0));
        
        System.out.println("expIter(10,3): " + expIter(10,3));
        System.out.println("expIter(10,-3): " + expIter(10,-3));
        
        System.out.println("expRecur(10,3): " + expRecur(10,3));
        System.out.println("expRecur(10,-3): " + expRecur(10,-3));
        System.out.println("expRecur(10,0): " + expRecur(10,0));
        
        
        
        //1 exponent recursively
        System.out.println("exponent(2,3): " + exponent(2,3));
        
        //2 fibonacci series
        System.out.println("fibonacci(5)): " + fib(6));
        
        //3 binarysearch
        int[] pi = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        pi = Arrays.sort(Arrays.toList(pi));
        System.out.println("search pi, 3: " + binarySearch(5, pi));   
        System.out.println("search pi, 6: " + binarySearch(6, pi));   
        System.out.println("recursive search pi, 3: " + binarySearchRecursive(5, pi, 0, pi.length-1)); 
        System.out.println("recursive search pi, 6: " + binarySearchRecursive(6, pi, 0, pi.length-1)); 
    
        //4 towers of hanoi
        n = 100; // Number of disks 
        //towerOfHanoi(n, 'A', 'C', 'B');  // A, B and C are names of rods 
        
        
    }
    
}