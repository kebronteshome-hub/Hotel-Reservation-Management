package hotelmanagement;
public class Employee extends Person {

    private int employeeId;
    private String position;

    public Employee(int employeeId,
                    String name,
                    String phone,
                    String position) {

        super(name, phone);

        this.employeeId = employeeId;
        this.position = position;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public void displayInfo() {

        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + name);
        System.out.println("Phone: " + phone);
        System.out.println("Position: " + position);
    }
}
