public class Corvette extends Car {
    public Corvette(String mk, String mo, double val) {
        super(mk, mo, val);
    }
    
    public void calcNewValue() { 
        value++;
    }
        
}