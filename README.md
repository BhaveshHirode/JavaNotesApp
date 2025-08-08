--- # JAVA NOTES APP – FILE I/O BASED CONSOLE APPLICATION

##  Overview
This is a Java-based Notes Management System built using File I/O concepts.  
It is a menu-driven console application where you can Add, View, Search, Edit, and Delete notes,  
with all data stored in a text file (`notes.txt`) for persistent storage.

---

##  Features
1.  Add new notes
2.  View all saved notes
3.  Search notes by keywords
4. ️ Edit existing notes
5.  Delete notes by number
6.  Persistent storage using a text file
7.  Friendly farewell message – `Thanks for visiting! Have a Good Day!`

---

##  Technologies Used
- Java SE 17+
- File I/O (`FileReader`, `FileWriter`, `BufferedReader`, `BufferedWriter`)
- Exception Handling
- Collection Framework (`ArrayList`)
- Java Scanner for input

---

##  File I/O Concepts Demonstrated
- File creation & existence check
- Reading & writing text files
- Buffered streams for efficiency
- `try-with-resources` for auto resource management
- Handling checked exceptions (`IOException`)
- Data persistence

---

##  How to Run the Project

### 1️. Clone the Repository
```bash
git clone https://github.com/BhaveshHirode/JavaNotesApp.git
cd JavaNotesApp

2️. Open in IntelliJ IDEA
Go to File → Open and select the project folder.
Set Project SDK to Java 17+ in File → Project Structure → Project SDK.

3. Compile and Run (from terminal)
```bash

javac -d out src/NotesApp.java
java -cp out NotesApp
Or simply right-click NotesApp.java in IntelliJ and select Run 'NotesApp.main()'.

--- 

### Project Structure

JavaNotesApp/
│── src/
│   └── NotesApp.java                    # Main Java source code
│── notes.txt                            # File storing all notes
│── README.md                            # Project documentation
│── LICENSE                              # License file
│── .gitignore                           # Git ignore rules
│── screenshots/
│   ├── running-output 1.png # IntelliJ project structure screenshot
│   └── running-output 2.png            # Console output screenshot

### About Me
  * Name: Bhavesh Hirode
  * MCA Final Year | Java Full Stack Developer | SQL Developer | Exploring Data Analytics
  * Skilled in Java, SQL, HTML, CSS, Spring Boot, File I/O, and problem-solving
  * Certifications: Java (HackerRank), SQL (Basic, Intermediate, Advanced)
  * Email: bhaveshhirode7038@gmail.com
  * GitHub: https://github.com/BhaveshHirode 
  * LinkedIn: www.linkedin.com/in/bhaveshhirode7038
  * Passionate about building software that solves real-world problems.

##  License
This project is licensed under the [MIT License](LICENSE) - you are free to use, modify, and distribute it.
