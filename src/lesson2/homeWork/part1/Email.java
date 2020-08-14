package lesson2.homeWork.part1;

public class Email {
    private String site;
    private String login;
    private String password;


    public Email(String site, String login, String password) {
        this.site = site;
        this.login = login;
        this.password = password;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public void login(String login, String password) {
        if (this.login.equals(login) && this.password.equals(password)) {
            System.out.println("Ви війшли в на пошту");
        } else {
            System.out.println("Ви ввели невірний логін або пароль");
        }

    }
}
