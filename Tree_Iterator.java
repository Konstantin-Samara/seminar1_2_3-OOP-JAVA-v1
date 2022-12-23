package JAVA_OOP.seminar1;

import java.util.ArrayList;
import java.util.Iterator;

public class Tree_Iterator implements Iterator<Human>{
    private ArrayList<Human> humans;
    private int id;
    
    public Tree_Iterator(ArrayList<Human> humans) {
        this.humans = humans;}

    @Override
    public boolean hasNext() {return id<humans.size();}

    @Override
    public Human next() {return humans.get(id++);}
}
