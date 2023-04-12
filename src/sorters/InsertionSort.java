package sorters;

public final class InsertionSort {
   
    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int j = i;
            while (j > 0 && array[j - 1] > array[j]) {
                int temp = array[j + 1];
                array[j + 1] = array[j];
                array[j] = temp;
                j--;
            }
        }
        return array;
    }
}
