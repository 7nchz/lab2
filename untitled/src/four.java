
//Удалить первый элемент одномерного массива целых чисел
package ru.ismoke;

import java.util.Arrays;

public class four {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 6};
        int[] arr2 = delRepeat(arr);
        System.out.println(Arrays.toString(arr2));
    }

    private static int[] delRepeat(int[] arr) {
        return Arrays.stream(arr).distinct().toArray();
    }
}