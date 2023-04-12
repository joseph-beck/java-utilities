import datastructures.linkedlist.LinkedList;
import sorters.BogoSort;

public class Main {

    public static void main(String[] args) {
        System.out.println(".\n");

        Integer[] array = { 1, 2, 3, 4 ,5 };
        LinkedList<Integer> ll = new LinkedList<Integer>(array);

        System.out.println(ll.size());
        System.out.println(ll.get(0));
        ll.push(0);
        System.out.println(ll.size());
        ll.print();
    }
}