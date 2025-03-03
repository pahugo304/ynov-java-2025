package fr.ynov.java.easy;

public class Array {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Affichage avec une boucle for:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("Affichage avec une boucle foreach:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
