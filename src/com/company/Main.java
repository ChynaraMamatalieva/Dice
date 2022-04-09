package com.company;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            game();
        }
        Round_3.result();
        Round_3.LastResult();

    }

    public static int game() {

        System.out.println("-----Start Game-----");
        System.out.println("User rolls the dices...");
        Scanner scanner = new Scanner(System.in);
        int y = 0;
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

        System.out.println("computer: " + computer);
        System.out.println("computer: " + computer1);
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
//        counterUser = counterUser + mathAbs;
//        counterComp = counterComp + mathAbs1;
        System.out.println("\n----Current Score----");
        System.out.println("User: " + mathAbs + "  points");
        System.out.println("Computer: " + mathAbs1 + "  points");
        System.out.println("Computer is ahead by  " + (mathAbs1 - mathAbs) + " points");
        System.out.println();
        return mathAbs;


    }

    public static class Round_3 {

        public static void result() {
            int roundCounter = 3;
            for (int i = 0; i < 3; i++) {
                roundCounter--;
                if (roundCounter > 0) {
                    System.out.println("-----Start Game-----");
                    System.out.println("User rolls the dices...");
                    Scanner scanner1 = new Scanner(System.in);
                    int y7 = 0;
                    do {
                        System.out.println("Predict amount of points (2..12): ");
                        y7 = scanner1.nextInt();
                    } while (y7 < 2 || y7 > 12);

                    Dice dice = new Dice();
                    Dice dice2 = new Dice();
                    dice.rollDice();
                    dice2.rollDice();
                    int x7 = dice.getValue() + dice2.getValue();

                    int mathAbs = x7 - Math.abs(x7 - y7) * 2;

                    System.out.println("dice : " + dice);
                    System.out.println("dice2 : " + dice2);
                    System.out.println("dice.getValue() = " + dice.getValue());
                    System.out.println("dice2.getValue() = " + dice2.getValue());
                    System.out.println("On the dice felt: " + x7);
                    System.out.println("Result is: " + " " + mathAbs);


                    System.out.println("\nComputer rolls the dices...");
                    Computer computer = new Computer();
                    Computer computer1 = new Computer();
                    computer.rollComputer();
                    computer1.rollComputer();
                    int a = computer.getValue1() + computer1.getValue1();

                    System.out.println("computer: " + computer);
                    System.out.println("computer: " + computer1);
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

                    System.out.println("\n----Current Score----");
                    System.out.println("User: " + mathAbs + "  points");
                    System.out.println("Computer: " + mathAbs1 + "  points");
                    System.out.println("Computer is ahead by  " + (mathAbs1 - mathAbs) + " points");
                    System.out.println();
                }
            }
        }
        public static void LastResult() {
            int counterUser;
            int counterComp;
            System.out.println("-----Start Game-----");
            System.out.println("User rolls the dices...");
            Scanner scanner1 = new Scanner(System.in);
            int y8 = 0;
            do {
                System.out.println("Predict amount of points (2..12): ");
                y8 = scanner1.nextInt();
            } while (y8 < 2 || y8 > 12);

            Dice dice = new Dice();
            Dice dice2 = new Dice();
            dice.rollDice();
            dice2.rollDice();
            int x8 = dice.getValue() + dice2.getValue();

            int mathAbs = x8 - Math.abs(x8 - y8) * 2;

            System.out.println("dice : " + dice);
            System.out.println("dice2 : " + dice2);
            System.out.println("dice.getValue() = " + dice.getValue());
            System.out.println("dice2.getValue() = " + dice2.getValue());
            System.out.println("On the dice felt: " + x8);
            System.out.println("Result is: " + " " + mathAbs);


            System.out.println("\nComputer rolls the dices...");
            Computer computer = new Computer();
            Computer computer1 = new Computer();
            computer.rollComputer();
            computer1.rollComputer();
            int a = computer.getValue1() + computer1.getValue1();

            System.out.println("computer: " + computer);
            System.out.println("computer: " + computer1);
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

            counterUser = (mathAbs + mathAbs + mathAbs);
            counterComp = (mathAbs1 + mathAbs1 + mathAbs1);
            System.out.println("\n----Current Score----");
            System.out.println("User: " + mathAbs + "  points");
            System.out.println("Computer: " + mathAbs1 + "  points");
            System.out.println("Computer is ahead by  " + (mathAbs1 - mathAbs) + " points");
            System.out.println();


            System.out.println("+-----------------------------+Finish Game+------------------+" +
                    "\nRound   |    User      | Computer    " +
                    "\n-------------------------------------" +
                    "\n        | Predicted: " + y8 + " | Predicted: " + computer.y1 + "            " +
                    "\n ~ 1 ~  | Dice: " + x8 + "   | Dice: " + a + "           " +
                    "\n        | Result:" + mathAbs + "   | Result: " + mathAbs1 + "            " +
                    "\n-------------------------------------" +
                    "\n        | Predicted: " + y8 + " | Predicted: " + computer.y1 + "            " +
                    "\n ~ 2 ~  | Dice: " + x8 + "             | Dice:" + a + "            " +
                    "\n        | Result: " + mathAbs + " | Result:" + mathAbs1 + "            " +
                    "\n-------------------------------------" +
                    "\n        | Predicted: " + y8 + " | Predicted: " + computer.y1 + "           " +
                    "\n ~ 3 ~  | Dice: " + x8 + "       | Dice:" + a + "            " +
                    "\n        | Result: " + mathAbs + "      | Result:" + mathAbs1 + "            " +
                    "\n-------------------------------------" +
                    "\n Total  |     Points: " + counterUser + " | Points: " + counterComp + "    ");
        }
    }
}








