import java.util.ArrayList;
import java.util.Date;

public class User {
    private String name;
    private String surname;
    private String email;
    private String password;
    private String job;
    private int age;
    private ArrayList<Adress> adsList;
    private Date lastlog;

    public User(String name, String surname, String email, String password, String job, int age) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.job = job;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public ArrayList<Adress> getAdsList() {
        return adsList;
    }

    public void setAdsList(ArrayList<Adress> adsList) {
        this.adsList = adsList;
    }

    public Date getLastlog() {
        return lastlog;
    }

    public void setLastlog(Date lastlog) {
        this.lastlog = lastlog;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
