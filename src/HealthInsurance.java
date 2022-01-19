import java.util.Date;

public class HealthInsurance extends Insurance{
    public HealthInsurance(String start, String finish) {
        super("Sağlık Sigortası", 1000, start, finish);
    }

    @Override
    public void calculate() {

    }
}
