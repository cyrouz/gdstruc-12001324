package com.gdstruc.module1;



public class Main {

    public static void main(String[] args) {

        int[] numbers =new int[10];

        numbers[0] = 35;
        numbers[1] = 69;
        numbers[2] = 1;
        numbers[3] = 10;
        numbers[4] = -50;
        numbers[5] = 320;
        numbers[6] = 63;
        numbers[7] = 58;
        numbers[8] = 26;
        numbers[9] = 13;

        System.out.println("Before selection sort:");
        printArrayElements(numbers);

        selectionSort(numbers);

        System.out.println("\n\nAfter selection sort:");
        printArrayElements(numbers);
    }

    private static void selectionSort(int[] arr)
    {
        int size = arr.length;

        for (int lastSortedIndex = 0; lastSortedIndex < arr.length - 1; lastSortedIndex++)
        {
            int smallestIndex = lastSortedIndex;

            for (int i = lastSortedIndex + 1; arr.length > i; i++)
            {
                if (arr[i] >= arr[smallestIndex])
                {
                    smallestIndex = i;
                }
            }

            int temp = arr[lastSortedIndex];
            arr[lastSortedIndex] = arr[smallestIndex];
            arr[smallestIndex] = temp;

        }
    }
    private static void printArrayElements(int[] arr)
    {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}