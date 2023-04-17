package types;

public final class Types {
    
    public static Class typeof(Integer integer) {
        return integer.getClass();
    }

    public static Class typeof(Character character) {
        return character.getClass();
    }

    public static boolean equal(Object a, Object b) {
        return a.getClass() == b.getClass();
    }
}
