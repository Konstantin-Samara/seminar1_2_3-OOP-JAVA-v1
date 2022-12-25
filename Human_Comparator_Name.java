package JAVA_OOP.seminar1;

import java.util.Comparator;

public class Human_Comparator_Name<T extends Human> implements Comparator<T>{

    @Override
    public int compare(T o1, T o2) {
        return (o1.getLast_name()+o1.getFirst_name()).
        compareTo(o2.getLast_name()+o2.getFirst_name());}    
}
