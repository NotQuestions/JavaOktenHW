package lesson5.Task2;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        DAO dao = new DAO();

        Contact vanya = new Contact(
                124,
                "Vanya",
                Company.Microsoft,
                "Lokin",
                "vanya@gmail.com",
                "+38063222144",
                Department.factory);

        Contact petya = new Contact(
                129,
                "Petya",
                Company.Apple,
                "Pupkin",
                "qwer@gmail.com",
                "+38063122144",
                Department.factory);

        Contact sasha = new Contact(
                191,
                "Sasha",
                Company.Apple,
                "Frist",
                "frist@gmail.com",
                "+38091231123",
                Department.support);

        Contact robert = new Contact(
                10,
                "Robert",
                Company.Intel,
                "Ivanov",
                "iv@gmail.com",
                "+492342301",
                Department.tech);

        Contact katya = new Contact(
                200,
                "Katya",
                Company.Apple,
                "San",
                "loak@gmail.com",
                "+3113213",
                Department.tech);

        Contact ira = new Contact(
                3123312,
                "Ira",
                Company.Intel,
                "Lopu",
                "vanya@gmail.com",
                "+38063222144",
                Department.tech);

        Contact dima = new Contact(
                1,
                "Dima",
                Company.Apple,
                "Sanorti",
                "sano@gmail.com",
                "+380123224144",
                Department.support);

        Contact anna = new Contact(
                7,
                "Anna",
                Company.Microsoft,
                "Prosta",
                "vera@gmail.com",
                "+38063122144",
                Department.factory);

        Contact polo = new Contact(
                98,
                "Polo",
                Company.Apple,
                "Jojo",
                "jojo@gmail.com",
                "+380312222144",
                Department.support);

        Contact sveta = new Contact(
                99,
                "Sveta",
                Company.Intel,
                "Grina",
                "gra@gmail.com",
                "+38052222144",
                Department.support);

        Contact piter = new Contact(
                124,
                "Vanya",
                Company.Microsoft,
                "Lokin",
                "vanya@gmail.com",
                "+38063222144",
                Department.factory);

        System.out.println(dao.getAll());
        dao.save(vanya);
        dao.save(petya);
        dao.save(sasha);
        dao.save(dima);
        dao.save(piter);
        dao.save(polo);
        dao.save(robert);
        dao.save(anna);
        dao.save(katya);
        dao.save(ira);
        //Виводим всі контакти
        dao.getAll().forEach((contact -> System.out.println("ID:" + contact.getId() + "  Name: " + contact.getName())));
        System.out.println("-------------------------------------------------");
        //Знахожу унікальні контакти
        List<Contact> res = dao.getAll()
                .stream()
                .distinct()
                .collect(Collectors.toList());
        res.forEach((contact -> System.out.println("ID:" + contact.getId() + "  Name: " + contact.getName())));
        System.out.println("-------------------------------------------------");
        //Знахожу унікальні контакти з певного департаменту
        List<Contact> res2 = dao
                .getAll()
                .stream()
                .distinct()
                .filter((contact) -> contact.getDepartment() == Department.factory).collect(Collectors.toList());

        res2.forEach((contact -> System.out.println("ID:"
                + contact.getId()
                + "  Name: "
                + contact.getName()
                + " Department: "
                + contact.getDepartment())));
        System.out.println("-------------------------------------------------");
        //Знахожу унікальні контакти з певного департаменту і сортую по імені
        List<Contact> res3 = dao.getAll()
                .stream()
                .distinct()
                .filter((contact) -> contact.getDepartment() == Department.factory)
                .sorted((q1, q2) -> {
                    return q1.getName().compareTo(q2.getName());
                })
                .collect(Collectors.toList());

        res3.forEach((contact -> System.out.println("ID:" + contact.getId()
                + "  Name: "
                + contact.getName()
                + " Department: "
                + contact.getDepartment())));
        System.out.println("-------------------------------------------------");
        //Знахожу унікальні контакти та групую їх по компанії
        List<Contact> res4 = dao.getAll()
                .stream()
                .distinct()
                .sorted((d1, d2) -> {
                 return d1.getDepartment().compareTo(d2.getDepartment());
                })
                .collect(Collectors.toList());

        res4.forEach((contact -> System.out.println("ID:" + contact.getId()
                + "  Name: "
                + contact.getName()
                + " Department: "
                + contact.getDepartment()
                + " Company: "
                + contact.getCompany())));

        System.out.println("-------------------------------------------------");


    }

}
