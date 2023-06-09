package maths.vectors;

import javax.print.attribute.IntegerSyntax;

import types.Types;

public class Vector2<T> implements IVector<Vector2<T>> {
   
    private T x;
    private T y;

    public Vector2(T x, T y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public Vector2<T> add(Vector2<T> vector) {
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public Vector2<T> subtract(Vector2<T> vector) {
        throw new UnsupportedOperationException("Unimplemented method 'subtract'");
    }

    @Override
    public Vector2<T> normalise() {
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
}
