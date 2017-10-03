package ua.nure.maximenko.Practice2;

public interface MyList extends Iterable<Object>, ListIterable {
    void add(Object e);
    void clear();
    boolean remove(Object o);
    Object[] toArray();
    int size();

    boolean contains(Object o);
    boolean containsAll(MyList c) throws Exception;
}
