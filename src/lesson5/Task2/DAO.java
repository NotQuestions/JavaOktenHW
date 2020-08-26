package lesson5.Task2;

import java.util.LinkedList;
import java.util.Optional;

public class DAO {
    private LinkedList<Contact> listContact;

    public DAO() {
        this.listContact = new LinkedList<>();
    }

    public void save(Contact contact) {
        listContact.add(contact);
    }

    public void delete(Contact contact) {
        listContact.remove(contact);
    }

    public LinkedList<Contact> getAll() {
        return listContact;
    }

    public Optional<Contact> getContact(int id) {
       Optional<Contact> result = listContact.stream().filter((Contact contact) -> contact.getId() == id).findFirst();
        return result;
    }
    public void deleteById(int id) {
        listContact.stream().filter(contact -> {
            if (contact.getId() == id){
                listContact.remove(contact);
                return true;
            }
            return false;

        }).findFirst();
    }

    public void update(Contact contact,int id) {
        listContact.stream().filter(contac -> {
            if (contac.getId() == id){
                listContact.set(listContact.indexOf(contac),contact);
                return true;
            }
            return false;

        }).findFirst();
    }
}
