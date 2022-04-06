package com.company;

import java.util.Random;
import java.util.Scanner;

public class Dice {

    private int value;

    private static final Random random = new Random();


    public Dice() {
        this.value = random.nextInt(1,7);
    }

    public void rollDice() {
        value = random.nextInt(1, 7);
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return switch (value) {
            case 1 -> """

                    +-------+          \s
                    |  #    |          \s
                    |       |          \s
                    |       |          \s
                    +-------+""";
            case 2 -> """

                    +-------+          \s
                    |  #    |          \s
                    |       |          \s
                    |    #  |          \s
                    +-------+""";
            case 3 -> """

                    +-------+          \s
                    |  #    |          \s
                    |   #   |          \s
                    |    #  |          \s
                    +-------+""";
            case 4 -> """

                    +-------+          \s
                    |  #  # |          \s
                    |       |          \s
                    |  #  # |          \s
                    +-------+""";
            case 5 -> """

                    +-------+          \s
                    |  #  # |          \s
                    |   #   |          \s
                    |  #  # |          \s
                    +-------+""";
            case 6 -> """

                    +-------+          \s
                    |  #  # |          \s
                    |  #  # |          \s
                    |  #  # |          \s
                    +-------+""";
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
