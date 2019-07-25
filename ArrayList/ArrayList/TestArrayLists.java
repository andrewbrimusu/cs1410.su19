import java.util.ArrayList;
import java.util.Arrays;

public class TestArrayLists {
    public static void main(String[] args) {
        String[] cars = {"corvette", "mustang", "malibu", "dart"};
        for(String car : cars)
            System.out.println("car: " + car);
            
        //cars[4] = "fiat500";
        //String[] cars2 = new String[5];
        String[] cars2 = {"corvette", "mustang", "malibu", "dart", "fiat500"};
        
        for(String car : cars2)
            System.out.println("car: " + car);
            
        ArrayList <String> cars3 = new ArrayList<>();
        for(String car : cars2)
            cars3.add(car);
            
        for(String car : cars3)
            System.out.println("car: " + car);
            
        cars3.add("sequoia");
        
        for(String car : cars3)
            System.out.println("car: " + car);
         
        ArrayList <String> cars4 = new ArrayList<>(Arrays.asList(cars));
        
        for(String car : cars4)
            System.out.println("car5: " + car);
            
        String name = "andy";
        Car mycar = new Car();
        
        ArrayList<Object> myobjs = new ArrayList<>();
        myobjs.add(name);
        myobjs.add(mycar);
        
        for(Object obj : myobjs)
            System.out.println("obj: " + obj.toString());
    }
}