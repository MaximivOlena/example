package com.example.arrays;

public class Array2 {
    public static void main(String[] args) {
        int[] array = {-1, 3, 0, -5, 1};
        int sum = 0;
        for (int value : array) {
            if (value > 0) {
                sum += value;
            }
        }
        System.out.println("sum = " + sum);
    }
}