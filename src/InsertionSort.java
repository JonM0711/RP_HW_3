import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {10, 2, 9, 4, 3, 1, 7, 6, 8, 5};
        System.out.println(Arrays.toString(array));
        for (int current = 0; current < array.length; current++) {
            int element = array[current];
            int i = current - 1;

            for (; i >= 0; i--) {
                if (element < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    break;
                }
            }
            array[i + 1] = element;
        }
        System.out.println(Arrays.toString(array));
    }
}
