# 🏨 Hotel Management System (JDBC)

A simple **console-based Hotel Management System** built using **Java** and **MySQL (JDBC)**. It allows basic CRUD operations for hotel room bookings including adding, viewing, updating, and deleting bookings.

---

## 💡 Features

- ➕ Add new hotel bookings
- 📄 View all bookings
- 🖊️ Update existing booking details
- ❌ Delete a booking
- 💾 Connected to MySQL database using JDBC

---

## 🛠️ Technologies Used

- Java (JDK 8+)
- JDBC (Java Database Connectivity)
- MySQL (Relational Database)
- Console I/O

---

## 📦 Setup Instructions

### 🔧 Prerequisites

- Java JDK installed
- MySQL server running
- MySQL JDBC driver
- Basic understanding of terminal/command line

---

### 📁 Database Setup

1. Open your MySQL client and run the following SQL to create the database and table:

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
