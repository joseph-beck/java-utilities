import java.util.Random;

import javax.swing.text.StyledEditorKit.ForegroundAction;

import data_structures.linked_list.LinkedList;
import sorters.BogoSort;
import sorters.BubbleSort;
import sorters.InsertionSort;
import sorters.QuickSort;

public class Main {

    public static void main(String[] args) {
        System.out.println(".\n");
        int count = Integer.parseInt(args[0]);
        int[] array = new int[count];
        Random random = new Random();
        
        for (int i = 0; i < count; i++) {
            array[i] = random.nextInt(count);
        }

        array = QuickSort.sort(array);
        for (int i : array) {
           System.out.printf("%d, ", i); 
        }
    }
}