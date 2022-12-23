package JAVA_OOP.seminar1;

import java.util.Comparator;

public class Human_Comparator_Name implements Comparator<Human>{

    @Override
    public int compare(Human o1, Human o2) {
        return (o1.getLast_name()+o1.getFirst_name()).
        compareTo(o2.getLast_name()+o2.getFirst_name());}    
}
