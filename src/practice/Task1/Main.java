package practice.Task1;

import java.util.ArrayList;

////Створити класс попелющка ім'я вік розмір ноги Принц(пустий до певного часу)
////створити кілька попелюшок, покласти їх в масив
////Створити класс принц  з полем туфелька
////створити 1 об'єкт принца в якого э туфелька
////поєднати відповідну попелюшку з відповідним принцом
public class Main {
    public static void main(String[] args) {
        Cinderella one = new Cinderella("Katya", 22, 35);
        Cinderella two = new Cinderella("Lena", 33, 32);
        Cinderella three = new Cinderella("Karina", 72, 38);
        Cinderella four = new Cinderella("Masha", 28, 44);

        Prince artur = new Prince(new Shoe(32, "Хрусталь"));
        //Замість масива я створив список, з ним зручніше працювати
        ArrayList<Cinderella> cinderellasList = new ArrayList<>();
        cinderellasList.add(one);
        cinderellasList.add(two);
        cinderellasList.add(three);
        cinderellasList.add(four);

        for (Cinderella cinderella : cinderellasList) {
            if (cinderella.getFootSize() == artur.getShoe().size) {
                cinderella.setPrince(artur);
                break;
            }
        }

    }
}
