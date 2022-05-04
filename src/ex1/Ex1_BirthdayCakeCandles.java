package ex1;

import java.util.Arrays;

public class Ex1_BirthdayCakeCandles {
    public static void main(String[] args) {

        int[] candles = new int[]{7, 4, 4, 3, 1, 4, 5, 5, 5};

        System.out.println(countTallestCandles1(candles));
        System.out.println(countTallestCandles2(candles));
    }
    // without built-in methods
    public static int countTallestCandles1(int[] arr) {
        int tallest = arr[0];
        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < tallest) {
                continue;
            } else if (arr[i] > tallest) {
                tallest = arr[i];
                count = 1;
            } else {
                count++;
            }
        }
        return count;
    }

    // using built-in method sort
    public static int countTallestCandles2(int[] arr) {
        Arrays.sort(arr);
        int tallest = arr[arr.length - 1];
        int index = 1;
        for (int i = arr.length - 1 - index; i >= 0; i--) {
            if (arr[i] == tallest) index++;
        }
        return index;
    }
}
