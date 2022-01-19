import java.util.Scanner;

public class AdressManager {
    static Scanner scn = new Scanner(System.in);

    public static Adress addHome() {
        System.out.println("Lütfen yeni ev adresinizi giriniz: ");
        String str = scn.nextLine();
        HomeAddress ev = new HomeAddress(str);
        return ev;
    }

    public static Adress addBus() {
        System.out.println("Lütfen yeni iş adresinizi giriniz: ");
        String str = scn.nextLine();
        BusinessAddress is = new BusinessAddress(str);
        return is;
    }

}
