//В целочисленной последовательности есть нулевые элементы. Создать массив из номеров этих элементов.

public class one {
    public static void main(String[] args) {
        /**
         * Массив над которым будут проводиться вычисления
         */
        int[] arr = {2, 4, 0, 3, 3, 0, 0, 0, 9};
        calculate(arr);
    }

    private static int calculate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                int result[] = {i};
            }
        }
        return 0;
    }
}