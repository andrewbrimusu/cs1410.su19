package ch2;

//single line comment

/*

Hello this is my comment
on multi-lines

 */

/**
 * Documentation comments
 */

import java.util.Scanner;

public class TraceComputeChange {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Please enter an amount of money: ");
        double amount = scan1.nextDouble();

        int remainingAmount = (int)(amount * 100);

        // Find the number of one dollars
        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;
        System.out.println("numberOfOneDollars: " + numberOfOneDollars);
        // Find the number of quarters in the remaining amount
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;
        System.out.println("numberOfQuarters: " + numberOfQuarters);

        // Find the number of dimes in the remaining amount
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;
        System.out.println("numberOfDimes: " + numberOfDimes);

        // Find the number of nickels in the remaining amount
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;
        System.out.println("numberOfNickels: " + numberOfNickels);

        // Find the number of pennies in the remaining amount
        int numberOfPennies = remainingAmount;
        System.out.println("numberOfPennies: " + numberOfPennies);

        String name = "Andy";
        String ageStr = "37";
        int age = Integer.parseInt(ageStr);
        System.out.println("age: " + age);
        double ageD = Double.parseDouble(ageStr);
        System.out.println("ageD: " + ageD);

        boolean b1 = 50.0 < 100;
        System.out.println("b1: " + b1);

        System.out.println("Enter your score, and I'll tell you your grade: ");
        double score = scan1.nextDouble();
        char grade;

        if (score >= 90.0)
            grade = 'A';
        else if (score >= 80.0)
            grade = 'B';
        else if (score >= 70.0)
            grade = 'C';
        else if (score >= 60.0)
            grade = 'D';
        else
            grade = 'F';
        System.out.println("Your grade is: " + grade);

        int topBucket = 5; //Scott got bucket 5, and missed 6

        if(topBucket >= 1)
            System.out.println("You win the Candy Bar");
        if(topBucket >= 2)
            System.out.println("You win the My Buddy Doll");
        if(topBucket >= 3)
            System.out.println("You win the toy car");
        if(topBucket >= 4)
            System.out.println("You win the board game");
        if(topBucket >= 5)
            System.out.println("You win the bike");
        if(topBucket >= 6)
            System.out.println("You win $50");
        int number = 28;

        boolean even;
        if (number % 2 == 0) {
            even = true;
        }
        else {
            even = false;
        }

        boolean even2 = number % 2 == 0;

        System.out.println("even, even2: "+ even + ", " + even2);

        boolean even3;
        even3 = number % 2 == 0 ? true : false;


        System.out.printf("even3: " + even3);

        //String havingFun = "";
        String havingFun = topBucket == 6 ? "yes" : "not really";
        System.out.println("Having fun? " + havingFun);

        int x = 13601267;//013601267 when scanned, leading 0 will be truncated
        int y = x % 10;
        double z = x / 10.0;
        int x2 = (int)z;
        System.out.printf("x, y, z, x2: " + x + ", " + y + ", " + z + ", " + x2);

    }
}
