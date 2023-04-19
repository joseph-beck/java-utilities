package data_structures.maps;

abstract interface IMap<T, V> {
    
    public abstract void add(T key, V value);

    public abstract void add(Pair<T, V> pair);

    public abstract void remove(T key);

    public abstract void remove(Pair<T, V> pair);

    public abstract V get(T key);

    public abstract void set(T key, V value);

    public abstract void replace(T key, Pair<T, V> pair);

    public abstract void sort();

    public abstract void sort(boolean descending);

    public abstract boolean contains(T key);

    public abstract boolean contains(Pair<T, V> pair);
}
