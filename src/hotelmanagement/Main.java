package hotelmanagement;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Hotel hotel = new Hotel();

        hotel.addRoom(new Room(101, "Single"));
        hotel.addRoom(new Room(102, "Double"));
        hotel.addRoom(new Room(103, "Suite"));

        Employee emp =
                new Employee(
                        1,
                        "Ali",
                        "0911111111",
                        "Manager"
                );

        System.out.println(
                "\n--- Employee Information ---"
        );

        emp.displayInfo();

        int choice;

        do {

            System.out.println(
                    "\n===== HOTEL MENU ====="
            );

            System.out.println("1. View Rooms");
            System.out.println("2. Make Reservation");
            System.out.println("3. View Reservations");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");

            choice = input.nextInt();

            try {

                switch(choice) {

                    case 1:

                        hotel.viewRooms();
                        break;

                    case 2:

                        System.out.print(
                                "Enter Customer ID: "
                        );

                        int id = input.nextInt();

                        input.nextLine();

                        System.out.print(
                                "Enter Name: "
                        );

                        String name =
                                input.nextLine();

                        System.out.print(
                                "Enter Phone: "
                        );

                        String phone =
                                input.nextLine();

                        Customer customer =
                                new Customer(
                                        id,
                                        name,
                                        phone
                                );

                        System.out.print(
                                "Enter Room Number: "
                        );

                        int roomNumber =
                                input.nextInt();

                        System.out.print(
                                "Enter Nights: "
                        );

                        int nights =
                                input.nextInt();

                        hotel.makeReservation(
                                customer,
                                roomNumber,
                                nights
                        );

                        break;

                    case 3:

                        hotel.viewReservations();
                        break;

                    case 4:

                        System.out.println(
                                "Goodbye!"
                        );

                        break;

                    default:

                        System.out.println(
                                "Invalid choice."
                        );
                }

            } catch(Exception e) {

                System.out.println(
                        "Invalid input."
                );

                input.nextLine();
            }

        } while(choice != 4);

        input.close();
    }
}
