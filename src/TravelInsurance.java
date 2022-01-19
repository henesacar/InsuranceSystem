import java.util.Date;

public class TravelInsurance extends Insurance{
    public TravelInsurance(String start, String finish) {
        super("Seyahat Sigortası", 1000, start, finish);
    }

    @Override
    public void calculate() {

    }
}
