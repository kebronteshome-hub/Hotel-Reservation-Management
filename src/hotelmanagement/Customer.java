package hotelmanagement;
public class Customer extends Person {

    private int customerId;

    public Customer(int customerId,
                    String name,
                    String phone) {

        super(name, phone);
        this.customerId = customerId;
    }

    public int getCustomerId() {
        return customerId;
    }

    @Override
    public void displayInfo() {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Customer Name: " + name);
        System.out.println("Phone: " + phone);
    }
}
