package fr.ynov.java.easy;

import java.util.Scanner;

class Square {
    public static int getSquare(int number) {
        return number * number;
    }
    
    public static void main(String[] args) {
        int number;
        
        if (args.length > 0) {
            number = Integer.parseInt(args[0]);
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            number = scanner.nextInt();
            scanner.close();
        }
        
        int square = getSquare(number);
        System.out.println("The square of " + number + " is: " + square);
    }
}
