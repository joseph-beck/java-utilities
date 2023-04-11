import sorters.BogoSort;

public class Main {

    public static void main(String[] args) {
        BogoSort bs = new BogoSort();

        int[] toSort = { 1, 5, 2, 4, 3, 8, 9, 7, 6 };
        int[] sorted = bs.sort(toSort);
    }
}