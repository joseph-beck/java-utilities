package sorters;

public class QuickSort {
    
    public static int[] sort(int[] array) {
        int low = 0; 
        int high = array.length - 1;
        hoarePartition(array, low, high);
        return array;
    }

    static void hoarePartition(int[] array, int low, int high) {
        while(low < high) {
            int mid = low + (high - low) / 2;
            int lower = low - 1;
            int higher = high + 1;
            int pivot = array[mid];
            int temp;

            while(true) {
                while(array[++lower] < pivot);
                while(array[--higher] > pivot);

                if(lower >= higher) break;
                temp = array[lower];

                array[lower] = array[higher];
                array[higher] = temp;
            }
            lower = higher++;
            
            if((lower - low) <= (high - higher)) {
                hoarePartition(array, low, lower);
                low = higher;
            } else {
                hoarePartition(array, higher, high);
                high = lower;
            }
        }
    }
}
