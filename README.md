# Library_Management_System_Using_CoreJava
A console-based Library Management System built using pure Java with Core OOP Principles and Collections Framework.
It allows you to manage books and members, issue books, and persist data using simple file handling.

✅ Features
Add Books & Members
Issue Books to Members
View Available Books & Registered Members
Data Persistence with File Handling (ObjectOutputStream and ObjectInputStream)

✅ Object-Oriented Concepts Used
Encapsulation: Private fields with public getters/setters.
Inheritance & Polymorphism: Library implements Storable interface and overrides methods.
Abstraction: Storable interface defines contract for saving/loading data.
Collections Framework: Uses ArrayList to store books and members.
Exception Handling: Handles I/O errors gracefully.

✅ Project Structure

LibraryManagementSystem 
 ├── LibraryManagementSystem.java   # Main entry point
 ├── Library.java                   # Core library operations
 ├── Book.java                      # Book model class
 ├── Member.java                    # Member model class
 ├── Storable.java                  # Interface for abstraction
 ├── library.dat                    # Data file (auto-created)
 ├── README.md                      # Project description

 
✅ How to Run
Clone or Download this project.
Open in your Java IDE (Eclipse, IntelliJ, VS Code) or compile via terminal.
Run LibraryManagementSystem.java.
Use the console menu to manage books and members.
When you choose Save & Exit, data is saved in library.dat and automatically loaded next time.

✅ Technologies Used
Java SE (Core Java)
Collections Framework
File I/O (Serialization)
OOP Principles

✅ Example
==== Library Menu ====
1. Add Book
2. Add Member
3. Issue Book
4. View Books
5. View Members
6. Save & Exit
Choose an option:
