package com.gdstruc.module4;

public class Main {

    public static void main(String[] args) {

        int numbers[] = {5, 69, 420, -99, 1337, -1};

        System.out.println(linearSearch(numbers, 1337));
    }

    public static int linearSearch(int[] input, int value) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] == value) {
                return i;
            }
        }
        return value;
    }
}
