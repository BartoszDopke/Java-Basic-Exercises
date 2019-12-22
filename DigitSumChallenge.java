package com.company;

public class Main {

    public static void main(String[] args) {
        int n = sumDigits(131);
        System.out.println(n);

    }

    public static int sumDigits(int number) {
        if(number < 10) {
            return - 1;
        }
        int unityDigits = number % 10;
        int tensDigits = (number % 100)/10;
        int hundredDigits = (number % 1000)/100;
        return unityDigits + tensDigits + hundredDigits;
    }
}
