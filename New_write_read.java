package JAVA_OOP.seminar1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class New_write_read implements Writeable, Serializable{   

    public void save(Tree my_tree) {
        try {
                ObjectOutputStream objectOutputStream = 
                new ObjectOutputStream(new FileOutputStream("humans.out"));
                objectOutputStream.writeObject(my_tree);
                objectOutputStream.close();}
        catch(FileNotFoundException e) {System.out.println("Файл не найден.");}
        catch(IOException e) {System.out.println("Ошибка ввода-вывода данных.");}} 

    public Tree read() {
        Tree my_tree = new Tree();

        try {
            ObjectInputStream objectInputStream = 
            new ObjectInputStream(new FileInputStream("humans.out"));
            my_tree = (Tree) objectInputStream.readObject();
            objectInputStream.close();
            return my_tree;}
        catch(FileNotFoundException e) {System.out.println("Файл не найден.");}
        catch(IOException e) {System.out.println("Ошибка ввода-вывода данных.");} 
        catch(ClassNotFoundException e) {System.out.println("Не найден класс - ObjectInputStream.");} 

        return my_tree;
    
    
    }
}
