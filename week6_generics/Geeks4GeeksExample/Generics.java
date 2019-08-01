// A Simple Java program to show working of user defined 
// Generic classes 
   
// We use < > to specify Parameter type 
class GenericTest<T> 
{ 
    // An object of type T is declared 
    T obj; 
    GenericTest(T obj) {  this.obj = obj;  }  // constructor 
    public T getObject()  { return this.obj; } 
} 
   
// A Simple Java program to show multiple 
// type parameters in Java Generics 
  
// We use < > to specify Parameter type 
class GenericTest2<T, U> 
{ 
    T obj1;  // An object of type T 
    U obj2;  // An object of type U 
  
    // constructor 
    GenericTest2(T obj1, U obj2) 
    { 
        this.obj1 = obj1; 
        this.obj2 = obj2; 
    } 
  
    // To print objects of T and U 
    public void print() 
    { 
        System.out.println(obj1); 
        System.out.println(obj2); 
    } 
} 
  

public class Generics {
    // A Generic method example 
    static <T> void genericDisplay (T element) 
    { 
        System.out.println(element.getClass().getName() + 
                           " = " + element); 
    }
    
    public static void main (String[] args) 
    { 
        // instance of Integer type 
        GenericTest <Integer> iObj = new GenericTest<Integer>(15); 
        System.out.println(iObj.getObject()); 
   
        // instance of String type 
        GenericTest <String> sObj = 
                          new GenericTest<String>("GeeksForGeeks"); 
        System.out.println(sObj.getObject()); 
        
        
        
        GenericTest2 <String, Integer> obj = 
            new GenericTest2<String, Integer>("GfG", 15); 
  
        obj.print(); 
        
        
                 // Calling generic method with Integer argument 
        genericDisplay(11); 
   
        // Calling generic method with String argument 
        genericDisplay("GeeksForGeeks"); 
   
        // Calling generic method with double argument 
        genericDisplay(1.0); 
        
        
    } 
}