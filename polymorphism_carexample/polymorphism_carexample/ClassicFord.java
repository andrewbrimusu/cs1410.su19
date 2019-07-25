public class ClassicFord extends Ford {
    ClassicFord() {
        super();
        System.out.println("value: " + value);
    }
    
    ClassicFord(String mk, String md, double val) {
        super(mk, md, val);
    }
    //this does not work
    //value is protected in my grandparent Car,
    //and therefore private in my parent Ford
    public static void main(String[] args) {
        ClassicFord cf = new ClassicFord();
        System.out.println("value: " + cf.value);
    }
}