package hotelmanagement;
public class Reservation {

    private Customer customer;
    private Room room;
    private int nights;

    public Reservation(Customer customer,
                       Room room,
                       int nights) {

        this.customer = customer;
        this.room = room;
        this.nights = nights;
    }

    public void displayReservation() {

        System.out.println("\n--- Reservation Details ---");

        customer.displayInfo();

        System.out.println(
                "Room Number: " + room.getRoomNumber()
        );

        System.out.println(
                "Room Type: " + room.getType()
        );

        System.out.println("Nights: " + nights);
    }
}