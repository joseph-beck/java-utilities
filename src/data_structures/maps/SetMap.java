package data_structures.maps;

import java.util.ArrayList;
import java.util.List;

public class SetMap<T, V> extends Map<T, V> {

    private List<Pair<T, V>> map;

    public SetMap() {
        map = new ArrayList<Pair<T, V>>();
    }

    @Override
    public void add(T key, V value) {
        if (contains(key)) return;
        map.add(new Pair<T, V>(key, value));
    }

    @Override
    public void add(Pair<T, V> pair) {
        if (contains(pair)) return;
        map.add(pair);
    }

    @Override
    public void remove(T key) {
        super.remove(key);
    }

    @Override
    public void remove(Pair<T, V> pair) {
        super.remove(pair);
    }

    @Override
    public V get(T key) {
        return super.get(key);
    }

    @Override
    public void set(T key, V value) {
        super.set(key, value);
    }

    @Override
    public void replace(T key, Pair<T, V> pair) {
        super.replace(key, pair);
    }

    @Override
    public void sort() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sort'");
    }

    @Override
    public void sort(boolean descending) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sort'");
    }

    @Override
    public boolean contains(T key) {
        return super.contains(key);
    }

    @Override
    public boolean contains(Pair<T, V> pair) {
        return super.contains(pair);
    }
    
}
