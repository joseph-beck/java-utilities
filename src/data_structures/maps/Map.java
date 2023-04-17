package data_structures.maps;

import java.util.ArrayList;
import java.util.List;

public class Map<T, V> implements IMap<T, V> {
    
    private List<Pair<T, V>> map;

    public Map() {
        map = new ArrayList<Pair<T, V>>();
    }

    @Override
    public void add(T key, V value) {
        map.add(new Pair<T, V>(key ,value));
    }

    @Override
    public void add(Pair<T, V> pair) {
        map.add(pair);
    }

    @Override
    public void remove(T key) {
        for (int i = 0; i < map.size(); i++) {
            if (map.get(i).getKey() == key) map.remove(i);
        }
    }

    @Override
    public void remove(Pair<T, V> pair) {
        for (int i = 0; i < map.size(); i++) {
            if (map.get(i).getKey() == pair.getKey()) map.remove(i);
        }
    }

    @Override
    public V get(T key) {
        for (int i = 0; i < map.size(); i++) {
            if (map.get(i).getKey() == key) return map.get(i).getValue();
        }
        return null;
    }

    @Override
    public void set(T key, V value) {
        for (int i = 0; i < map.size(); i++) {
            if (map.get(i).getKey() == key) {
                map.remove(i);
                map.add(new Pair<T, V>(key, value));
            }
        }
    }

    @Override
    public void replace(T key, Pair<T, V> pair) {
        for (int i = 0; i < map.size(); i++) {
            if (map.get(i).getKey() == key) {
                map.remove(i);
                map.add(pair);
            }
        }
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
}
