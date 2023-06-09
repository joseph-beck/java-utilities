package sorters;

public final class BubbleSort {
    
    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) continue;

                int temp = array[j + 1];
                array[j + 1] = array[j];
                array[j] = temp;
            }
        }
        return array;
    }

}
