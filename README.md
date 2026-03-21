[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/pG3gvzt-)
# PCCCS495 – Term II Project

## Project Title
Library Management System
---

## Problem Statement (max 150 words)
If a library has a poorly designed software, it can lead to inefficiencies. These include difficulty in tracking issued books, maintaining accurate membership records, and monitoring the availability of book copies. Librarians may face problems such as misplaced records, delays in locating books, and errors while issuing or returning them. These challenges reduce the overall efficiency of library operations and affect the user experience. A well-designed Library Management System can automate these tasks and ensure accurate management of books and member activities. The proposed LMS will help librarians manage books, members, and transactions efficiently using a modular and object-oriented design. It will also allow library members to search for books, issue or return them, and check their availability in real time. By applying OOP principles, the system will be scalable, easy to maintain, and flexible enough to support future extensions such as digital libraries and online reservation services.
---

## Target User
- Librarians
- Library Administrators
- Students / Members

---

## Core Features
- Add, update, and remove books from the library database
- Register and manage library members
- Issue books to members and track due dates
- Return books and update availability status
- Search books by title, author, or ID
- Display available and issued books
- Basic record management and error handling

---

## OOP Concepts Used

- Abstraction:
- Inheritance:
- Polymorphism:
- Exception Handling
- Collections

---

## Proposed Architecture Description
The library management system will utilize a modular object-oriented architecture consisting of things like books, users, and library operations that would be represented with different classes. There will be one Library class that contains lots of information related to book collections and members by utilizing data structures like lists or maps. The Book, Member, and Transaction classes will be used to represent the main object types in this library management system. The Library class will provide the service methods to perform actions such as adding or removing books, registering members, issuing books, returning books, and searching for records. The user interface (which will be a console-based user interface) will interact with these classes that perform actions requested by either a librarian or a user. Exception handling would be used to handle errors associated with issuing books that are not available, invalid member number, etc. This modular structure will allow the separation of object responsibilities into coherent abstractions and will make it easier to maintain, enhance or modify in the future.
---

## How to Run
1. Compile:
   javac *.java
2. Run:
   java Main
---

## Git Discipline Notes
Minimum 10 meaningful commits required.
