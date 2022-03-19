package HOMEWORK.day23.iterator;

import java.util.Iterator;

public interface List  extends Iterable<Integer>{
    int size();
    boolean isEmpty();
    int get(int index);
    void add(int val);
    void add(int val, int index);
    void delete(int index);
    @Override
    Iterator<Integer> iterator();
}
