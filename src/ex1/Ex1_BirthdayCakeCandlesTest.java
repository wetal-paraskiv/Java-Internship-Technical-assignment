package ex1;

import static org.junit.jupiter.api.Assertions.*;

class Ex1_BirthdayCakeCandlesTest {

    @org.junit.jupiter.api.Test
    void countTallestCandles1() {
        assertEquals(1, Ex1_BirthdayCakeCandles.countTallestCandles1(new int[]{7, 4, 4, 3, 1, 4, 5, 5, 5}));
        assertEquals(2, Ex1_BirthdayCakeCandles.countTallestCandles1(new int[]{7, 4, 4, 3, 1, 4, 8, 8, 5}));
        assertEquals(3, Ex1_BirthdayCakeCandles.countTallestCandles1(new int[]{7, 4, 8, 4, 3, 1, 4, 8, 8, 5}));
        assertEquals(1, Ex1_BirthdayCakeCandles.countTallestCandles1(new int[]{7, 4, 3, 1, 4, 8, 5}));
        assertEquals(10, Ex1_BirthdayCakeCandles.countTallestCandles1(new int[]{7, 7, 7, 7, 7, 7, 7, 7, 7, 7}));
        assertEquals(3, Ex1_BirthdayCakeCandles.countTallestCandles1(new int[]{999, 999, 999}));

        int[] arr = new int[1000];
        for (int i = 1; i < arr.length / 2; i++) {
            arr[i] = i;
            arr[i + 1] = i;
        }
        assertEquals(2, Ex1_BirthdayCakeCandles.countTallestCandles1(arr));
    }

    @org.junit.jupiter.api.Test
    void countTallestCandles2() {
        assertEquals(1, Ex1_BirthdayCakeCandles.countTallestCandles2(new int[]{7, 4, 4, 3, 1, 4, 5, 5, 5}));
        assertEquals(2, Ex1_BirthdayCakeCandles.countTallestCandles2(new int[]{7, 4, 4, 3, 1, 4, 8, 8, 5}));
        assertEquals(3, Ex1_BirthdayCakeCandles.countTallestCandles2(new int[]{7, 4, 8, 4, 3, 1, 4, 8, 8, 5}));
        assertEquals(1, Ex1_BirthdayCakeCandles.countTallestCandles2(new int[]{7, 4, 3, 1, 4, 8, 5}));
        assertEquals(10, Ex1_BirthdayCakeCandles.countTallestCandles2(new int[]{7, 7, 7, 7, 7, 7, 7, 7, 7, 7}));
        assertEquals(3, Ex1_BirthdayCakeCandles.countTallestCandles2(new int[]{999, 999, 999}));

        int[] arr = new int[1000];
        for (int i = 1; i < arr.length / 2; i++) {
            arr[i] = i;
            arr[i + 1] = i;
        }
        assertEquals(2, Ex1_BirthdayCakeCandles.countTallestCandles2(arr));
    }
}