public class TestCars {
    Car[] cars;
    public TestCars() {
        cars = new Car[2];
        cars[0] = new Corvette("Chevrolet", "Corvette", 20000);
        cars[1] = new Ford("Ford", "Mustang", 10000);
            
    }
    
    public void calcAllValues() {
        for(Car c : cars)
            c.calcNewValue();
            
        for(Car c : cars)
            System.out.println(c.getMake() + " " + c.getModel() + " new value: " + c.getValue());
    }
    
    public static void main(String[] args) {
        TestCars tc = new TestCars();
        tc.calcAllValues();
        
    }
}