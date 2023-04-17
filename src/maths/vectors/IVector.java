package maths.vectors;

abstract interface IVector<V> {
    
    public V add(V vector);

    public V subtract(V vector);

    public V normalise();
}
