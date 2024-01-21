package DesignPatterns.Iterator;

import java.util.List;

public class MyIteratorImplementation implements MyIterator{
    private List<User> list;

    public MyIteratorImplementation(List<User> list){

    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
