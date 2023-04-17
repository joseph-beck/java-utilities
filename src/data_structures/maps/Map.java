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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public void remove(Pair<T, V> pair) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public V get(T key) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public void set(T key, V value) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'set'");
    }

}
