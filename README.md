# Quantum Bookstore 📚 | Fawry N² Dev Slope #10 Challenge

This Java project was developed as part of the **Fawry N² Internship Challenge (Dev Slope #10)** for Summer 2025.  
It simulates an **online bookstore system** with clean architecture, multiple book types, and full test case coverage.

## 💼 Challenge Overview
The objective was to build a modular bookstore system that:
- Manages various types of books
- Supports adding, removing, and buying operations
- Interacts with external services (simulated) like shipping and mailing
- Is extensible and follows good software engineering principles

## ✅ Features Implemented

### 📘 Book Types Supported
- **PaperBook**
  - Has stock quantity
  - Uses `ShippingService` to simulate delivery
- **EBook**
  - Has a file type
  - Uses `MailService` to simulate email sending
- **DemoBook**
  - Not for sale (throws an exception on purchase)

### 🔄 Core Functionalities
- ✅ Add a book (ISBN, title, author, year, price)
- ✅ Buy a book using its ISBN, quantity, email, and address
  - Reduces stock (if PaperBook)
  - Triggers shipping/email via service interface
  - Throws error if not available or not allowed
- ✅ Remove outdated books (older than N years)
- ✅ Show full inventory with type and details
- ✅ Extensible design (new book types can be added without modifying existing code)

### 🧪 Test Class: `QuantumBookstoreFullTest`
- Demonstrates all major use cases:
  - Valid PaperBook and EBook purchases
  - Attempting to buy a DemoBook
  - Out-of-stock handling
  - Buying non-existent ISBN
  - Removing old books and listing inventory
- Each scenario includes proper console output and clear simulation messages

> 🧠 **Note:** I used **ChatGPT** as an AI assistant **only to help generate the test cases**.  
> It helped by giving me:
> - Book names and ISBNs for realism
> - Edge-case examples (e.g., stock = 0, demo book)
> - The structure of the test method `QuantumBookstoreFullTest.java`

> 💡 All core code logic, structure, and class implementation were written and understood entirely by me as part of the Fawry Internship Challenge.

## 🧠 OOP Concepts Used
- Inheritance (`Book` superclass with 3 types)
- Abstract methods (`buyBook`)
- Interface-based services (`ShippingService`, `MailService`)
- Dependency Injection (passing services into constructors)
- ArrayList to manage inventory
- Exception handling for business rules

## 🛠 Tech Stack
- Java 8+
- No external libraries
- Pure console application (OOP focused)

---

## 📂 File Structure
├── Book.java # Abstract class for all books
├── PaperBook.java # Paper book logic (stock + shipping)
├── EBook.java # Ebook logic (file + mailing)
├── DemoBook.java # Not-for-sale book
├── BookInventory.java # Manages inventory (ArrayList)
├── ShippingService.java # Interface
├── HandleShippingService.java # Simulated implementation
├── MailService.java # Interface
├── HandleMailService.java # Simulated implementation
├── QuantumBookstoreFullTest.java # Test class with all scenarios!
## ScreenShots
[Screenshot (378)](https://github.com/user-attachments/assets/0dffdc02-dc89-48e8-a586-c2eb6766b141)
![Screenshot (379)](https://github.com/user-attachments/assets/e954f646-c11e-4dd7-9c49-8ed0405d1f4c)

## 📌 License
This project is for internship application and educational purposes only.
