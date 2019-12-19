package com.company;

public class Main {

    public static void main(String[] args) {
        int newScore =  calculateScore("Tim",500);
        System.out.println("New score " + newScore);
        calculateScore(75);
        calculateScore();
        calcFeetAndInchesToCentimeters(6,0);
        calcFeetAndInchesToCentimeters(100);

    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score * 100;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points.");
        return score * 100;
    }

    public static int calculateScore() {
        System.out.println("No player, no score");
        return 0;
    }

    //exercise
    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if(feet < 0 || (inches < 0 || inches > 12)) {
            return -1;
        } else {
            double centimeters = ((feet/0.032808)+(inches/0.39370));
            System.out.println(centimeters + " cm");
            return 1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        } else {
            double feet = (int) inches/12;
            double remainingInches = (int) inches % 12;
            System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
            return calcFeetAndInchesToCentimeters(feet,inches);
        }
    }

}
