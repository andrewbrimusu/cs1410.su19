public class Ford extends Car {
    public Ford() {
        super("toyota", "camry", 9000.0);
    }
    
    public Ford(String mk, String mo, double val) {
        super(mk, mo, val);
    }
    
    public void calcNewValue() { 
        value--;
    }
        
}