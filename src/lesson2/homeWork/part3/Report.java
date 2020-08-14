package lesson2.homeWork.part3;

import javax.xml.crypto.Data;

public class Report {
    private long id;
    private Data data;
    private String type;
    private Client client;

    public long getId() {
        return id;
    }

    public Data getData() {
        return data;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Report(long id, Data data, String type, Client client) {
        this.id = id;
        this.data = data;
        this.type = type;
        this.client = client;
    }
}
