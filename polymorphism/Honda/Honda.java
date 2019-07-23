//11. A method is overridden, not the data members, so runtime polymorphism can't be achieved by data members.

class Bike{  
    int speedlimit=90;  
    
    public int getSpeedLimit() { return speedlimit; }
}

public class Honda extends Bike{  
    int speedlimit;
    public Honda() {
        speedlimit=150;
        System.out.println("Honda constructor: " + speedlimit);
    }
    
    public int getSpeedLimit() { return speedlimit; }

    //Notice that 90 is outputted, not 150.
    //This is because data members are not automatically downcast
    //even when using polymorphism
    public static void main(String args[]){  
        Bike obj=new Honda();  
        //Honda hon1 = (Honda)obj; uncomment this and it will be a Honda, with a speedlimit 150
        System.out.println(obj.speedlimit);//90  
        System.out.println(obj.getSpeedLimit());//90 
    }  
}