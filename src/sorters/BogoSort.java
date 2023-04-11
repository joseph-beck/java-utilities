package sorters;

import java.util.Random;

public class BogoSort {
    
    public int[] sort(int[] array) {
        while (!checkSorted(array)) {
            int[] indexes = generateIndexes(array.length);
            int[] items = array.clone();

            for (int i = 0; i < array.length; i++) {
                array[i] = items[indexes[i]];
                System.out.print(array[i]);
            }
            System.out.println();
        }
        return array;
    }

    public int[] generateIndexes(int length) {
        Random random = new Random();
        int[] nums = new int[length];
        int[] indexes = new int[length];
        
        for (int i = 0; i < nums.length; i++) nums[i] = i;

        for (int i = 0; i < indexes.length; i++) {
            while (true) {
                int index = random.nextInt(length);
                if (nums[index] != -1) {
                    indexes[i] = nums[index];
                    nums[index] = -1;
                    break;
                }
            }
        }
        return indexes;
    }

    public boolean checkSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) return false; 
        }
        return true;
    }
}
