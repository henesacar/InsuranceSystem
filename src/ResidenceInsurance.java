import java.util.Date;

public class ResidenceInsurance extends Insurance{

    public ResidenceInsurance(String start, String finish) {
        super("Konut Sigortası", 1000, start, finish);
    }

    @Override
    public void calculate() {

    }
}
