import java.util.Date;

public abstract class Insurance {
    private String name;
    private int cost;
    private String start;
    private String finish;

    public Insurance(String name, int cost, String start, String finish) {
        this.name = name;
        this.cost = cost;
        this.start = start;
        this.finish = finish;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getFinish() {
        return finish;
    }

    public void setFinish(String finish) {
        this.finish = finish;
    }
    public abstract void calculate();

}
