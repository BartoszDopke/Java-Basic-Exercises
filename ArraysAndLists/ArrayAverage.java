package com.bartoszdopke;

import java.util.Scanner;

public class ArrayAverage {
    private static Scanner scanner = new Scanner(System.in);
    public static double calculateAverage() {
        System.out.println("How many integer numbers do you want to put into the array?");
        int n = scanner.nextInt();
        int sum=0;
        int[] array = new int[n];
        int a=0;
        for(int i = 0; i < array.length; i++) {
            System.out.println("Enter " + i + " number: ");
            a = scanner.nextInt();
            array[i] = a;
        }
        scanner.close();

        for(int i = 0; i < array.length; i++) {
            sum+= array[i];
        }
        return (double) sum / (double) array.length;
    }
}
