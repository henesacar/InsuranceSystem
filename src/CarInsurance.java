import java.util.Date;

public class CarInsurance extends Insurance{
    public CarInsurance(String start,String finish) {
        super("Araç Sigortası", 1000, start, finish);
    }

    @Override
    public void calculate() {

    }
}
