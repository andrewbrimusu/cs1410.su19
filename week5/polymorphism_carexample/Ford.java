public class Ford extends Car {
    public Ford(String mk, String mo, double val) {
        super(mk, mo, val);
    }
    
    public void calcNewValue() { 
        value--;
    }
        
}