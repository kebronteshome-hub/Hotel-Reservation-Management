package hotelmanagement;
import java.util.ArrayList;

public class Hotel {

    private ArrayList<Room> rooms;
    private ArrayList<Reservation> reservations;

    public Hotel() {

        rooms = new ArrayList<>();
        reservations = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public void viewRooms() {

        System.out.println("\n--- Available Rooms ---");

        for(Room room : rooms) {
            room.displayRoom();
        }
    }

    public void makeReservation(Customer customer,
                                int roomNumber,
                                int nights) {

        boolean found = false;

        for(Room room : rooms) {

            if(room.getRoomNumber() == roomNumber
                    && !room.isBooked()) {

                room.bookRoom();

                Reservation reservation =
                        new Reservation(customer,
                                room,
                                nights);

                reservations.add(reservation);

                System.out.println(
                        "\nReservation Successful!"
                );

                reservation.displayReservation();

                found = true;
            }
        }

        if(!found) {
            System.out.println(
                    "Room unavailable or not found."
            );
        }
    }

    public void viewReservations() {

        System.out.println(
                "\n--- All Reservations ---"
        );

        for(Reservation reservation
                : reservations) {

            reservation.displayReservation();
        }
    }
}