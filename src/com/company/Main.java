package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        for (int i = 0; i < 2; i++) {
            game();
         }
        result3();
    }
    public static void game() {

        System.out.println("-----Start Game-----");
        System.out.println("User rolls the dices...");
        Scanner scanner = new Scanner(System.in);
        int y = 0;
        int counterUser = 0;
        int counterComp = 0;
        do {
            System.out.println("Predict amount of points (2..12): ");
            y = scanner.nextInt();


        } while (y < 2 || y > 12);

        Dice dice = new Dice();
        Dice dice2 = new Dice();
        dice.rollDice();
        dice2.rollDice();
        int x = dice.getValue() + dice2.getValue();


        int mathAbs = x - Math.abs(x - y) * 2;

        System.out.println("dice : " + dice);
        System.out.println("dice2 : " + dice2);
        System.out.println("dice.getValue() = " + dice.getValue());
        System.out.println("dice2.getValue() = " + dice2.getValue());

        System.out.println("On the dice felt: " + x);
        System.out.println("Result is: " + " " + mathAbs);


        System.out.println("\nComputer rolls the dices...");
        Computer computer = new Computer();
        Computer computer1 = new Computer();
        computer.rollComputer();
        computer1.rollComputer();
        int a = computer.getValue1() + computer1.getValue1();

        System.out.println("computer.getValue1: " + " " + computer.getValue1());
        System.out.println("computer.getValue1: " + " " + computer1.getValue1());
        int mathAbs1 = a - Math.abs(a - computer.y1) * 2;

        System.out.println("On the dice fell " + " " + a);
        System.out.println("Result is: " + " " + mathAbs1);
        System.out.println(computer.getValue1());
        System.out.println(computer1.getValue1());


        if (mathAbs > mathAbs1) {
            System.out.println("User wins " + (mathAbs - mathAbs1) + " points more!");
        } else {
            System.out.println("User loses!");
        }
        counterUser = counterUser + mathAbs;
        counterComp = counterUser + mathAbs1;
        System.out.println("\n----Current Score----");
        System.out.println("User: " + mathAbs + "  points");
        System.out.println("Computer: " + mathAbs1 + "  points");
        System.out.println("Computer is ahead by  " + (mathAbs1 - mathAbs) + " points");
        System.out.println();




    public static void resultLast() {
            for (int i = 3; i >= 0; i--) {
                if (i == 3) {
                    game();
                } else if (i == 2) {
                    game();
                } else if (i == 1) {
                    game();
                } else {
                    System.out.println("+-----------------------------+Finish Game+----------------------------------+" + "\n" +
                            "Round     |                                      User    |                    Computer|" + "\n" +
                            "----------+--------------------------+----------------------------------------------------" + "\n" +
                            "          | Predicated: " + y + "\n" + "|" + " Predicted: " + computer.y1 + "\n" +
                            "    -1-   | Dice: " + x + "\n" + "|" + " Dice: " + a + "\n" +
                            "          | Result: " + mathAbs + "\n" + "|" + "Result: " + mathAbs1 + "\n" +
                            "----------+--------------------------+---------------------+------------------------------+\n" +
                            "          | Predicated: " + y + "\n" + "|" + " Predicted: " + computer.y1 + "\n" +
                            "    -2-   | Dice: " + x + "\n" + "|" + " Dice: " + a + "\n" +
                            "          | Result: " + mathAbs + "\n" + "|" + "Result: " + mathAbs1 + "\n" +
                            "----------+--------------------------+---------------------+------------------------------+\n" +
                            "          | Predicated: " + y + "\n" + "|" + " Predicted: " + computer.y1 + "\n" +
                            "    -3-   | Dice: " + x + "\n" + "|" + " Dice: " + a + "\n" +
                            "          | Result: " + mathAbs + "\n" + "|" + "Result: " + mathAbs1 + "\n" +
                            "----------+--------------------------+---------------------+------------------------------+\n" +
                            "     Total| Points: " + counterUser + "| Points: " + counterComp);


                }
            }
    }
}


