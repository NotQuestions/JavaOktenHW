package practice.BigTask2;


import java.util.ArrayList;

public class Main {
    //Все робив в main методі щоб не створбвати багато класів на невеличкі завдання
    public static void main(String[] args) {
//        Зробити список з 10 чисел [2,17,13,6,22,31,45,66,100,-18]та:
        ArrayList<Integer> listNumbers = new ArrayList<>();
        listNumbers.add(2);
        listNumbers.add(17);
        listNumbers.add(13);
        listNumbers.add(6);
        listNumbers.add(22);
        listNumbers.add(31);
        listNumbers.add(45);
        listNumbers.add(66);
        listNumbers.add(100);
        listNumbers.add(-18);
//        1. Перебрати його циклом while
//        int i = 0;
//        while (i<listNumbers.size()){
//            System.out.println(listNumbers.get(i++));
//        }
//        2. перебрати його циклом for
//        for (int i = 0; i < listNumbers.size(); i++) {
//            System.out.println(listNumbers.get(i));
//        }
//        //або
//        for (Integer listNumber : listNumbers) {
//            System.out.println(listNumber);
//        }
//        3. перебрати циклом while та вивести  числа тільки з непарним індексом
//        int i = 1;
//        while (i<listNumbers.size()){
//            System.out.println("index = " + i);
//            System.out.println(listNumbers.get(i));
//            i+=2;
//        }
//        4. перебрати циклом for та вивести  числа тільки з непарним індексом
//        for (int i = 1; i < listNumbers.size(); i += 2) {
//            System.out.println(listNumbers.get(i));
//        }
//        5. перебрати циклом while та вивести  числа тільки парні  значення
//        int i = 0;
//        while (i < listNumbers.size()) {
//            if (listNumbers.get(i) % 2 == 0) {
//                System.out.println(listNumbers.get(i));
//            }
//            i++;
//        }
//        6. перебрати циклом for та вивести  числа тільки парні  значення
//        for (Integer listNumber : listNumbers) {
//            if (listNumbers.get(i) % 2 == 0) {
//                System.out.println(listNumbers.get(i));
//            }
//        }
//        8. Вивести список в зворотньому порядку.
//        for (int i = listNumbers.size()-1; i >= 0; i--) {
//            System.out.println(listNumbers.get(i));
//        }
//        9. Всі попередні завдання (окрім 8), але в зворотньому циклі (с заду на перед)
//
//                9.1. Перебрати його циклом while
//        int i = listNumbers.size()-1;
//        while (i>=0){
//            System.out.println(listNumbers.get(i--));
//        }
//        9.2. перебрати його циклом for
//        for (int i = listNumbers.size()-1; i >= 0; i--) {
//            System.out.println(listNumbers.get(i));
//        }

//        9.3. перебрати циклом while та вивести  числа тільки з непарним індексом
//        int i = listNumbers.size()-1;
//        while (i>=0){
//            if (i%2==0) i--;
//            System.out.println("index = " + i);
//            System.out.println(listNumbers.get(i));
//            i-=2;
//        }
//        9.4. перебрати циклом for та вивести  числа тільки з непарним індексом
//        for (int i = listNumbers.size() - 1; i >= 0; i -= 2) {
//            if (i % 2 == 0) i--;
//            System.out.println("index = " + i);
//            System.out.println(listNumbers.get(i));
//        }
//        9.5. перебрати циклом while та вивести  числа тільки парні  значення
//        int i = listNumbers.size() - 1;
//        while (i >= 0) {
//            int currentNumb = listNumbers.get(i);
//            if (currentNumb % 2 == 0) {
//                System.out.println(listNumbers.get(i));
//            }
//            i --;
//        }
//        9.6. перебрати циклом for та вивести  числа тільки парні  значення
//        for (int i = listNumbers.size() - 1; i >= 0; i--) {
//            int currentNumb = listNumbers.get(i);
//            if (currentNumb % 2 == 0) {
//                System.out.println(listNumbers.get(i));
//            }
//        }


//                ==========================================
//
//        Створити пустий список та :
        ArrayList<Integer> list = new ArrayList<>();

//        1. Заповнити його 50 парними числами.
//        for (int i = 0; i < 50; i++) {
//            list.add(i * 2);
//        }
//        2. Заповнити його 50 непарними числами.
//
//        for (int i = 0; i < 50; i++) {
//            list.add(i * 2 - 1);
//        }
//        1. используя Math.random заполнить список 100 элементами.
//                диапазон рандома от -999 до 999.
//        for (int i = 0; i < 100; i++) {
//            int randNum = (int)(Math.random()*2000-1000);
//            System.out.println(randNum);
//            list.add(randNum);
//        }
//        2. Вывести на консоль  каждый третий елемент
//        for (int i = 2; i < listNumbers.size(); i+=3) {
//            System.out.println(listNumbers.get(i));
//        }
//        3. Вывести на консоль  каждый третий елемент
//        но при условии что он имеет парное значение.
//        for (int i = 2; i < listNumbers.size(); i += 3) {
//            if (listNumbers.get(i) % 2 == 0) {
//                System.out.println(listNumbers.get(i));
//            }
//        }
//        4. Вывести на консоль  каждый третий елемент
//        но при условии что он имеет парное значение и
//        записать их в другой список.
//        for (int i = 2; i < listNumbers.size(); i += 3) {
//            if (listNumbers.get(i) % 2 == 0) {
//                list.add(listNumbers.get(i));
//            }
//        }

//                ====================================
//
//        Існують наступні об'єкти.
//        Створити класи під них.
//        Створити метод , який об'єднує об'єкти з однаковими id в єдиний об'єкт
//        і повертає вам цей список об'єктів.
//        Класс під загальний об'єкт писати самостійно. Він повинен містити тільки необхідні поля
//
//
//        class Person {
//            private int id;
//            private String name;
//            private int age;
//
//
//            public int getId() {
//                return id;
//            }
//
//            public void setId(int id) {
//                this.id = id;
//            }
//
//            public String getName() {
//                return name;
//            }
//
//            public void setName(String name) {
//                this.name = name;
//            }
//
//            public int getAge() {
//                return age;
//            }
//
//            public void setAge(int age) {
//                this.age = age;
//            }
//
//            public Person(int id, String name, int age) {
//                this.id = id;
//                this.name = name;
//                this.age = age;
//            }
//
//            public Person() {
//            }
//        }
//        //                     список 1
//        ArrayList<Person> listPerson = new ArrayList<>();
//        listPerson.add(new Person(1, "vaysa", 32));
//        listPerson.add(new Person(2, "petya", 31));
//        listPerson.add(new Person(3, "kolya", 30));
//        listPerson.add(new Person(4, "anya", 29));
//        listPerson.add(new Person(5, "masha", 28));
//        listPerson.add(new Person(6, "andriy", 30));
//        listPerson.add(new Person(7, "maxim", 31));
//        listPerson.add(new Person(8, "vadym", 32));
//        listPerson.add(new Person(9, "taras", 33));
////
////        список 2
//        class Auth {
//            private int id;
//            private String login;
//            private String password;
//
//            public Auth(int id, String login, String password) {
//                this.id = id;
//                this.login = login;
//                this.password = password;
//            }
//
//            public int getId() {
//                return id;
//            }
//
//            public void setId(int id) {
//                this.id = id;
//            }
//
//            public String getLogin() {
//                return login;
//            }
//
//            public void setLogin(String login) {
//                this.login = login;
//            }
//
//            public String getPassword() {
//                return password;
//            }
//
//            public void setPassword(String password) {
//                this.password = password;
//            }
//        }
//        ArrayList<Auth> listAuth = new ArrayList<>();
//
//        listAuth.add(new Auth(5, "login5", "password5"));
//        listAuth.add(new Auth(2, "login2", "password2"));
//        listAuth.add(new Auth(1, "login1", "password1"));
//        listAuth.add(new Auth(7, "login7", "password7"));
//        listAuth.add(new Auth(3, "login3", "password3"));
//        listAuth.add(new Auth(4, "login4", "password4"));
//        listAuth.add(new Auth(8, "login8", "password8"));
//        listAuth.add(new Auth(6, "login6", "password6"));
//        listAuth.add(new Auth(9, "login9", "password9"));
////
////        список 3 - це результат робботи методу який
//        class Combine {
//            private int id;
//            private String login;
//            private String name;
//            private int age;
//            private String password;
//
//            public Combine() {
//            }
//
//            public Combine(int id, String login, String password, String name, int age ) {
//                this.id = id;
//                this.login = login;
//                this.name = name;
//                this.age = age;
//                this.password = password;
//            }
//
//            public ArrayList<Combine> combine(ArrayList<Person> listPerson, ArrayList<Auth> listAuth) {
//                ArrayList<Combine> combine = new ArrayList<>();
//                for (Person person : listPerson) {
//                    for (Auth auth : listAuth) {
//                        if (person.id == auth.id) {
//                            combine.add(new Combine(auth.id, auth.login, auth.password, person.name, person.age));
//                        }
//                    }
//                }
//
//                return combine;
//            }
//        }

//        ========================================
//
//
//
//
//
//
//


    }
}
