# 🏨 Hotel Management System (Java + JDBC)

A console-based Hotel Booking Management System developed using Java and JDBC. It supports CRUD operations for managing hotel bookings via a simple CLI: add, view, update, and delete bookings.

---

## 💡 Features

- ➕ Add new bookings  
- 📄 View all bookings  
- ✏️ Update booking details using booking ID  
- ❌ Delete bookings  
- 🔒 Uses **PreparedStatement** to prevent SQL injection  

---

## 🛠️ Technologies Used

- Java (JDK 8+)  
- JDBC (Java Database Connectivity)  
- MySQL relational database  

---

## 🗃️ Database Setup

1. Create the database and `bookings` table:
   ```sql
   CREATE DATABASE hotel;
   USE hotel;

   CREATE TABLE bookings (
     id INT PRIMARY KEY AUTO_INCREMENT,
     name VARCHAR(100) NOT NULL,
     room_type VARCHAR(50),
     check_in DATE,
     check_out DATE
   );
In your Java code:

static final String URL = "jdbc:mysql://localhost:3300/hotel";
static final String USER = "root";
static final String PASS = "root";


🚀 Running the Application
Clone the repository:
git clone https://github.com/AdityaWagh02/Hotel-Management-System-JDBC.git
cd Hotel-Management-System-JDBC
Open the project in your Java IDE (e.g., IntelliJ IDEA, Eclipse).
Ensure your MySQL server is running and the hotel database is ready.

Compile and run:
javac HotelManagementSystem.java
java HotelManagementSystem

📝 Console Menu Interface
The menu displays the following options:

--- Hotel Management System ---
1. Add Booking
2. View Bookings
3. Update Booking
4. Delete Booking
5. Exit
Follow prompts for each operation.

🧩 Example Usage Flow

Enter name: Alex Johnson
Enter room type (Single/Double/Suite): Suite
Enter check-in date (YYYY-MM-DD): 2025-08-15
Enter check-out date (YYYY-MM-DD): 2025-08-18
Booking added successfully.

⚙️ Remarks & Suggestions
Ensure the MySQL JDBC Driver (Connector/J) is included in your classpath.

Update USER and PASS constants if your database credentials differ.

Use valid booking IDs when updating or deleting entries.


📌 Suggested Enhancements
✅ Check room availability before booking

✅ Store additional customer details like contact info

✅ Add input validation, date parsing with LocalDate

✅ Refactor code using DAO and service layers

✅ Develop a GUI using JavaFX or Swing for better UX


🙌 Contribution
Feel free to fork the project and submit pull requests.
Feature suggestions, bug fixes, and architecture improvements are always welcome!

