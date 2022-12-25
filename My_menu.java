package JAVA_OOP.seminar1;
import java.util.ArrayList;
import java.util.Scanner;

public class My_menu <T extends Human>{

    public void print_list(ArrayList<String> list1) {
        for (String item : list1) {System.out.println(item);}}

    public Integer my_input (String str, int n1, int n2) {
        int inp = 0;
        boolean test = true;
        while (test) {
            Scanner scan = new Scanner(System.in); 
            System.out.print(str);
            try { inp = scan.nextInt();test = false;} 
            catch (Exception e) { 
                System.out.println("Вы ввели не число, попробуйте еще раз.");}
            if (!test)   { 
            if (inp>=n1&&inp<=n2) test = false;
            else {test = true; 
                System.out.println("Число от "+n1+" до "+n2+". попробуйте еще раз.");}}}
        return inp;}
 
    public int[] menu_h2h_community(int Max_id) {
        int[] id = new int[2];
        boolean test = true;
        System.out.println();
        id[0] = my_input("\nВведите ID исследуемого человека : ",1,Max_id);
        while (test) {
        test = false;
        id[1] = my_input("Введите ID для установления степени родства : ",1,Max_id);
        if (id[1]==id[0]){System.out.println("Введите другого человека.");test = true;}}
        return id;}

    public int menu_getHuman_info_id(int Max_id) {
 
        return my_input("\nВведите ID объекта для получения полной информации : ",1,Max_id);}

    public int main_menu() {
        Scanner scan = new Scanner(System.in); 
        int sel;
        System.out.println("\n1. Вывести краткий список.");
        System.out.println("2. Вывести подробный список.");
        System.out.println("3. Вывести тип родственной связи между объектами.");
        System.out.println("4. Добавить объект.");
        System.out.println("5. Вывести подробную информацию об объекте по ID.");
        System.out.println("6. Завершить.");
        sel = my_input("Выберите пункт меню (1-6) : ",1,6);
        if(sel==6) scan.close();
        return sel;} 
    
    public T add_menu(int max_id) {
        T human = (T) new Human();
        Scanner scan = new Scanner(System.in);
        System.out.println("Создается новый объект с ID "+(max_id+1)+" : ");
        human.setId(max_id+1);
        System.out.print("Введите имя : ");
        String first_name = scan.nextLine(); human.setFirst_name(first_name);
        System.out.print("Введите фамилию : ");
        String last_name = scan.nextLine(); human.setLast_name(last_name);

        int birth_year = my_input("Введите год рождения : ",0,2022);
        human.setBirth_year(birth_year);

        if (my_input("Введите пол (1-мужской/0-женский): ",0,1)==1) 
        human.setMan(true);
        else human.setMan(false);

        int id_father = my_input("Введите ID отца (0 - отсутствует) : ",0,max_id);
        human.setId_father(id_father);

        int id_mother = my_input("Введите ID матери (0 - отсутствует) : ",0,max_id);
        human.setId_mother(id_mother);

        int id_married = my_input("Введите ID cупруга/супруги (0 - отсутствует) : ",0,max_id);
        human.setId_married(id_married); 

        return human;}

}
