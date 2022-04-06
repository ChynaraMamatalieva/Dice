package com.company;

import java.util.Random;

public class Computer {
    private static final Random random = new Random();
    int y1 = random.nextInt(2,12);
    private int value1 ;

    public Computer() {
        this.value1 = random.nextInt(1,7);
    }

    public void rollComputer() {
        value1 = random.nextInt(1, 7);
    }

    public int getValue1() {
        return value1;
    }

    @Override
    public String toString() {
        return switch (value1){
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
            default -> throw new IllegalStateException("Unexpected value: " + value1);
        };
    }
}
