// Таск - Відсортувати масив з більшого до меншого.
package com.example.arrays;

import java.util.Arrays;

public class Array {
    public static void main(String[] args){
        int[] array = {2, 3, 1, 7, 11};
        Arrays.sort(array);
        printArray(array);
    }
    private static void printArray(int[] array){
        for (int i = array.length -1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
