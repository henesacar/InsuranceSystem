import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public abstract class Account {
    private User user;
    private ArrayList<Insurance> policies;
    private AuthenticationStatus auth;
    Scanner scn = new Scanner(System.in);

    public Account(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ArrayList<Insurance> getPolicies() {
        return policies;
    }

    public void setPolicies(ArrayList<Insurance> policies) {
        this.policies = policies;
    }

    public AuthenticationStatus getAuth() {
        return auth;
    }

    public void setAuth(AuthenticationStatus auth) {
        this.auth = auth;
    }

    public final void showUserInfo(){
        System.out.println("Müşteri adı soyadı: "+this.getUser().getName()+" "+this.getUser().getSurname());
        System.out.println("Müşteri emaili: "+this.getUser().getEmail());
        System.out.println("Müşteri mesleği: "+this.getUser().getJob());
        System.out.println("Müşteri yaşı: "+this.getUser().getAge());
        System.out.println("Müşteri adresleri: ");
        for (Adress adr:this.getUser().getAdsList()
             ) {
            System.out.println(adr.toString());
        }
        System.out.println("Müşteri son giriş tarihi: "+this.getUser().getLastlog().toString());

    }

    public abstract void addPolicy();


    public void login(){
        System.out.print("Kayıtlı email adresinizi girin: ");
        String str = scn.nextLine();
        System.out.print("Lütfen şifrenizi girin: ");
        String pass = scn.nextLine();
        if (str.equals(this.getUser().getEmail()) && pass.equals(this.getUser().getPassword())){
            System.out.println("Giriş başarılı.");

        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(user, account.user) && Objects.equals(policies, account.policies) && auth == account.auth && Objects.equals(scn, account.scn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, policies, auth, scn);
    }
}
