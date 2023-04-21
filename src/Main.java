import java.util.Random;

import data_structures.linked_list.LinkedList;
import data_structures.stacks.Stack;
import date.Date;
import date.Day;
import date.Month;
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
        
        Date date = new Date(Day.MONDAY, 12, Month.AUGUST, 2003);
        System.out.println(date);
    
        Stack<String> stack = new Stack<String>(5);
        stack.push("hey");
        stack.push("there");
        System.out.println(stack.toString());
    }
}