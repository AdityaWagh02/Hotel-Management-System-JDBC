# 🏨 Hotel Management System (Java + JDBC)

A console-based Hotel Booking Management System developed using Java and JDBC. It supports CRUD operations for managing hotel bookings, offering a simple interface for adding, viewing, updating, and deleting bookings.

---

## 💡 Features

- ➕ Add new bookings  
- 📄 View existing bookings  
- ✏️ Update booking details based on booking ID  
- ❌ Delete bookings  
- 🔒 Uses **PreparedStatement** to prevent SQL injection  

---

## 🛠️ Technologies Used

- Java (JDK 8+)
- JDBC (Java Database Connectivity)
- MySQL relational database

---

## 🗃️ Database Setup

1. **Create database and bookings table**:
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
Java database connection string (inside your code):


static final String URL = "jdbc:mysql://localhost:3300/hotel";
static final String USER = "root";
static final String PASS = "root";
⚠️ If your MySQL server uses the default port (3306), update the URL accordingly.

🚀 Running the Application
 Clone the project:
 
 git clone https://github.com/AdityaWagh02/Hotel-Management-System-JDBC.git
 cd Hotel-Management-System-JDBC
 Open the project in your Java IDE (e.g., IntelliJ IDEA or Eclipse).
 
 Ensure your MySQL server is running and the hotel database is set up.
 
 Compile and run the main Java class:
 
 javac HotelManagementSystem.java
 java HotelManagementSystem

📝 Console Menu Interface
 When the application runs, it displays:
 
 --- Hotel Management System ---
 1. Add Booking
 2. View Bookings
 3. Update Booking
 4. Delete Booking
 5. Exit
 Select an option and follow the instructions.

🧩 Example Usage Flow

Enter name: Alex Johnson  
Enter room type (Single/Double/Suite): Suite  
Enter check-in date (YYYY-MM-DD): 2025-08-15  
Enter check-out date (YYYY-MM-DD): 2025-08-18  
Booking added successfully.

⚙️ Remarks & Suggestions
 Ensure the MySQL JDBC Driver (Connector/J) is included in your classpath.
 
 Update the USER and PASS constants if your database credentials differ.
 
 For update and delete operations, use a valid booking ID.

📌 Suggested Enhancements
 ✅ Implement room availability checks before booking
 
 ✅ Store additional customer details (e.g., contact info)
 
 ✅ Add input validation and use LocalDate for date handling
 
 ✅ Use modular architecture with DAO and service layers
 
 ✅ Build a GUI using JavaFX or Swing for better user experience

🙌 Contribution
 Feel free to fork the repository and submit pull requests.
 Feature suggestions, bug fixes, or structural enhancements are always welcome!
