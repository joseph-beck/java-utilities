package searchers;

public class LinearSearch<T> {
    
    public boolean search(T[] array, T search) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == search) return true;
        }
        return false;
    }
}
