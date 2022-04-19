package com.ambuj.arrays;

public class EnumTest {

    enum Car {
        BENTLEY,
        AUDI
    }

    public void changeEnum(Car c) {
        c = Car.AUDI;
    }

    public static void main(String... args) {
        EnumTest enumTest = new EnumTest();
        Car c = Car.BENTLEY;
        enumTest.changeEnum(c);
        System.out.println(c);
    }
}
