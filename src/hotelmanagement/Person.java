package hotelmanagement;
public class Person {

    protected String name;
    protected String phone;

    public Person(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
    }
}