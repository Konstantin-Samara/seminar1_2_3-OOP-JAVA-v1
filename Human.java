package JAVA_OOP.seminar1;

import java.io.Serializable;
import java.util.LinkedList;

public class Human implements Serializable{
    private String first_name,last_name;
    private Boolean man;
    private int birth_year,id,id_father,id_mother,id_married;
    private Human father, mother, married;
    private LinkedList<Human> child = new LinkedList<>(); 

    // public Human(int id,String first_name, String last_name, int birth_year,
    // boolean man,int id_father, int id_mother, int id_married) {
    //     this.id = id;
    //     this.first_name = first_name;
    //     this.last_name = last_name;
    //     this.birth_year = birth_year;
    //     this.man = man;
    //     this.id_father = id_father;
    //     this.id_mother = id_mother;
    //     this.id_married = id_married;} 
     
    @Override
    public java.lang.String toString() 
        {return this.getLast_name()+" "+this.getFirst_name()+" "
        +this.getbirth_year()+"г.р. ( id : "+this.getId()+" )";}

    public void toString_1() {
        System.out.print("\nID : "+this.getId()+" Имя : "+this.getFirst_name()+ " "
        +this.getLast_name()+" Пол : ");
        if (this.getMan()==true) System.out.print("Мужской");
        else System.out.print("Женский");
        System.out.println(" Год рождения : "+this.getbirth_year());
        if (this.getFather()!= null) System.out.println("Отец : "+this.getFather().toString());
        if (this.getMother()!= null) System.out.println("Мать : "+this.getMother().toString());
        if (this.getId_married()!=0){
            if (this.getMan()==true) System.out.println("Жена : "+this.getMarried().toString());
            else System.out.println("Муж : "+this.getMarried().toString());}
        if (this.getChild().size()>0) 
            {System.out.println("Дети : ");
            for (Human child:this.getChild()) {System.out.println(child.toString());}}}  
    
    public void addChild(Human child) {
        this.child.add(child);}

    public void childClear() {
        this.child.clear();}

    public boolean equals(Human human) {
        return (this.id==human.id);}

    public Human getMarried() {
        return married;}

    public void setMarried(Human married) {
        this.married = married;}

    public int getId_married() {
        return id_married;}

    public void setId_married(int married) {
        this.id_married = married;}

    public int getId_mother() {
        return id_mother;}
        
    public void setId_mother(int id_mother) {
        this.id_mother = id_mother;}

    public int getId_father() {
        return id_father;}

    public void setId_father(int id_father) {
        this.id_father = id_father;}

    public int getId() {
        return id;}

    public void setId(int id) {
        this.id = id;}                   
    
    public boolean getMan() {
        return man;}

    public void setMan(Boolean man) {
        this.man = man;} 

    public String getFirst_name() {
        return first_name;}

    public void setFirst_name(String first_name) {
        this.first_name = first_name;}

    public String getLast_name() {
        return last_name;}

    public void setLast_name(String last_name) {
        this.last_name = last_name;}

    public int getbirth_year() {
        return birth_year;}

    public void setBirth_year(int birth_year) {
        this.birth_year = birth_year;}

    public Human getFather() {
        return father;}

    public void setFather(Human father) {
        this.father = father;}

    public Human getMother() {
        return mother;}

    public void setMother(Human mother) {
        this.mother = mother;}

    public LinkedList<Human> getChild() {
        return child;}        
}
