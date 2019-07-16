package ch10.Objects;


import java.math.BigInteger;

public class BigIntegers {
    public static void main(String[] args) {
        int age = 2147483647;
        System.out.println("age: " + age);
        age++;
        System.out.println("age: " + age);
        age++;
        System.out.println("age: " + age);
        BigInteger age2 = new BigInteger("2147483647");
        System.out.println("age2: " + age2);
        age2  = age2.add(new BigInteger("1"));
        System.out.println("age2: " + age2);

    }

}
