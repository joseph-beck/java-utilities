package data_structures.maps;

abstract interface IMap<T, V> {
    
    public abstract void add(T key, V value);

    public abstract void add(Pair<T, V> pair);

    public abstract void remove(T key);

    public abstract void remove(Pair<T, V> pair);

    public abstract V get(T key);

    public abstract void set(T key, V value);
}
