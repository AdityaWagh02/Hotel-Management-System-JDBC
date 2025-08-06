# 🏨 Hotel Management System (Java + JDBC)

A simple **console-based Hotel Booking Management System** developed using Java and JDBC. This system allows users to perform basic CRUD operations for managing hotel room bookings.

---

## 📌 Features

- ➕ Add Booking
- 📄 View All Bookings
- ✏️ Update Booking Details
- ❌ Delete Booking
- 🔒 Uses **PreparedStatement** to prevent SQL injection

---

## 🛠 Technologies Used

- Java
- JDBC (Java Database Connectivity)
- MySQL

---

## 🗃 Database Configuration

1. Open MySQL and create the database and table using:

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
Ensure MySQL is running on port 3300 or change the port in the Java code accordingly:

java
Copy
Edit
static final String URL = "jdbc:mysql://localhost:3300/hotel";
static final String USER = "root";
static final String PASS = "root";
🚀 How to Run
Clone the repository:

bash
Copy
Edit
git clone https://github.com/AdityaWagh02/Hotel-Management-System-JDBC.git
Open the project in your preferred Java IDE (like IntelliJ IDEA or Eclipse).

Make sure your MySQL server is running and the hotel database is set up as shown above.

Compile and run the HotelManagmentSystem.java file.

🎮 Menu Options
When you run the program, you’ll see:

pgsql
Copy
Edit
--- Hotel Management System ---
1. Add Booking
2. View Bookings
3. Update Booking
4. Delete Booking
5. Exit
Follow the prompts to perform operations.

📦 Example Data Flow
plaintext
Copy
Edit
Enter name: John Doe
Enter room type (Single/Double/Suite): Double
Enter check-in date (YYYY-MM-DD): 2025-08-10
Enter check-out date (YYYY-MM-DD): 2025-08-14
Booking added successfully.
📋 Notes
Make sure the MySQL JDBC Driver (Connector/J) is added to your classpath.

Update the database credentials (USER and PASS) if yours are different.

Error messages will appear in the console for invalid inputs or DB issues.
