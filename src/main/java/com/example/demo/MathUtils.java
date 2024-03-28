package com.example.demo;

public class MathUtils {
    public int square(int x) {
        return x * x;
    }

    public double areaOfCircle(double r) {
        if (r < 0) {
            throw new RuntimeException("negative radius");
        }

        return Math.PI * r * r;
    }

    public void printMessage(String message) {
        //
    }
}
