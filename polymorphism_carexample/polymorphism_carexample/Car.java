public class Car{
    protected String make;
    protected String model;
    protected double value;
    
    public Car() {
        make = "toyota";
        model = "sequoia";
        value = 10000;
    }
    
    public Car(String mk, String md, double val) {
        make = mk;
        model = md;
        value = val;
    }
    
    public String getMake() { return make; }
    public String getModel() { return model; }
    public double getValue() { return value; }
    public void setMake(String mk) { make = mk; }
    public void setModel(String md) { model = md; }
    public void setValue(double val) { value = val; }
    
    public void calcNewValue() {
        System.out.println("This method will be implemented in the child class");
    
    }
    
}