//9. https://www.javatpoint.com/runtime-polymorphism-in-java
//10. since method invocation is determined by the JVM not compiler, it is known as runtime polymorphism.

class Animal{  
    void eat(){System.out.println("eating...");}  
}  

class Dog extends Animal{  
    void eat(){System.out.println("eating dog food...");}  
}  

class Cat extends Animal{  
    void eat(){System.out.println("eating rat...");}  
}  

class Lion extends Cat{  
    void eat(){System.out.println("eating meat...");}  
}  

class TestPolymorphism{  
    public static void main(String[] args){  
        Animal a;  
        a=new Dog();  
        a.eat();  
        a=new Cat();  
        a.eat();  
        a=new Lion();  
        a.eat();  
    }
}  
