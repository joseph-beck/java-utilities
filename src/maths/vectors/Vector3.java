package maths.vectors;

public class Vector3<T> implements IVector<Vector3<T>> {
    
    private T x;
    private T y;
    private T z;

    public Vector3(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public Vector3<T> add(Vector3<T> vector) {
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public Vector3<T> subtract(Vector3<T> vector) {
        throw new UnsupportedOperationException("Unimplemented method 'subtract'");
    }

    @Override
    public Vector3<T> normalise() {
        throw new UnsupportedOperationException("Unimplemented method 'normalise'");
    }
    
    public T getX() {
        return this.x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public T getY() { 
        return this.y;
    }

    public void setY(T y) {
        this.y = y;
    }

    public T getZ() {
        return this.z;
    }

    public void setZ(T z) {
        this.z = z;
    }
}
