public class BusinessAddress implements Adress{
    private String busAddress;


    public BusinessAddress(String busAddress) {
        this.busAddress = busAddress;
    }

    public String getBusAddress() {
        return busAddress;
    }

    public void setBusAddress(String busAddress) {
        this.busAddress = busAddress;
    }


}
