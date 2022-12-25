package JAVA_OOP.seminar1;

import java.util.ArrayList;
import java.util.Iterator;

public class Tree_Iterator<T extends Human> implements Iterator<T>{
    private ArrayList<T> humans;
    private int id;
    
    public Tree_Iterator(ArrayList<T> humans) {
        this.humans = humans;}

    @Override
    public boolean hasNext() {return id<humans.size();}

    @Override
    public T next() {return humans.get(id++);}
}
