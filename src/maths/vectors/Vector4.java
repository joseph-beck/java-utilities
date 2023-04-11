package maths.vectors;

public class Vector4<T> implements IVector<Vector4<T>> {

    private T x;
    private T y;
    private T z;
    private T w;

    @Override
    public Vector4<T> add(Vector4<T> vector) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public Vector4<T> subtract(Vector4<T> vector) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'subtract'");
    }

    @Override
    public Vector4<T> normalise() {
        // TODO Auto-generated method stub
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

    public T getW() {
        return this.w;
    }

    public void setW(T w) {
        this.w = w;
    }
}
