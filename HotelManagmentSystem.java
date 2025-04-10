import java.sql.*;
import java.util.Scanner;

public class HotelManagmentSystem {
    static final String URL = "jdbc:mysql://localhost:3300/hotel";
    static final String USER = "root"; // change if different
    static final String PASS = "root"; // your MySQL password

    static Connection conn;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            conn = DriverManager.getConnection(URL, USER, PASS);

            while (true) {
                System.out.println("\n--- Hotel Management System ---");
                System.out.println("1. Add Booking");
                System.out.println("2. View Bookings");
                System.out.println("3. Update Booking");
                System.out.println("4. Delete Booking");
                System.out.println("5. Exit");
                System.out.print("Enter choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // consume newline

                switch (choice) {
                    case 1:
                        addBooking();
                        break;
                    case 2:
                        viewBookings();
                        break;
                    case 3:
                        updateBooking();
                        break;
                    case 4:
                        deleteBooking();
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        conn.close();
                        return;
                    default:
                        System.out.println("Invalid choice.");
                }
            }
        } catch (Exception e) {
            System.out.println( e.getMessage());
        }
    }

    static void addBooking() throws SQLException {
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter room type (Single/Double/Suite): ");
        String roomType = scanner.nextLine();
        System.out.print("Enter check-in date (YYYY-MM-DD): ");
        String checkIn = scanner.nextLine();
        System.out.print("Enter check-out date (YYYY-MM-DD): ");
        String checkOut = scanner.nextLine();

        String query = "INSERT INTO bookings (name, room_type, check_in, check_out) VALUES (?, ?, ?, ?)";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(1, name);
        stmt.setString(2, roomType);
        stmt.setString(3, checkIn);
        stmt.setString(4, checkOut);

        int rows = stmt.executeUpdate();
        System.out.println(rows > 0 ? "Booking added successfully." : "Failed to add booking.");
    }

    static void viewBookings() throws SQLException {
        String query = "SELECT * FROM bookings";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);

        System.out.println("\n--- Bookings ---");
        while (rs.next()) {
            System.out.printf("ID: %d, Name: %s, Room: %s, Check-in: %s, Check-out: %s\n",
                    rs.getInt("id"),
                    rs.getString("name"),
                    rs.getString("room_type"),
                    rs.getDate("check_in"),
                    rs.getDate("check_out"));
        }
    }

    static void updateBooking() throws SQLException {
        System.out.print("Enter booking ID to update: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter new name: ");
        String name = scanner.nextLine();
        System.out.print("Enter new room type: ");
        String roomType = scanner.nextLine();
        System.out.print("Enter new check-in date (YYYY-MM-DD): ");
        String checkIn = scanner.nextLine();
        System.out.print("Enter new check-out date (YYYY-MM-DD): ");
        String checkOut = scanner.nextLine();

        String query = "UPDATE bookings SET name=?, room_type=?, check_in=?, check_out=? WHERE id=?";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setString(1, name);
        stmt.setString(2, roomType);
        stmt.setString(3, checkIn);
        stmt.setString(4, checkOut);
        stmt.setInt(5, id);

        int rows = stmt.executeUpdate();
        System.out.println(rows > 0 ? "Booking updated successfully." : "Booking not found.");
    }

    static void deleteBooking() throws SQLException {
        System.out.print("Enter booking ID to delete: ");
        int id = scanner.nextInt();

        String query = "DELETE FROM bookings WHERE id=?";
        PreparedStatement stmt = conn.prepareStatement(query);
        stmt.setInt(1, id);

        int rows = stmt.executeUpdate();
        System.out.println(rows > 0 ? "Booking deleted." : "Booking not found.");
    }
}
