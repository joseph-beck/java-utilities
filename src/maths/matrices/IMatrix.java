package maths.matrices;

abstract interface IMatrix<V> {
    
    public V add(V matrix);

    public V subtract(V matrix);

    public V multiply(V matrix);

    public V divide(V matrix);
}
