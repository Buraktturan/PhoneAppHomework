public class Phone extends Product {

    private long phoneNumber;

    public Phone() {
        super();
        this.phoneNumber = 0L;
    }
    
    public Phone(int id, String name, double price, long phoneNumber) {
        super(id, name, price);
        this.phoneNumber = phoneNumber;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}