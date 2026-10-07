# 🚦 Elevator-Design-LLD (Java)

## 📖 Overview
This project implements a **Low-Level Design (LLD)** of a real-world elevator system using **Java**.  
It demonstrates backend system design principles such as request handling, scheduling, state management, and clean architecture.  
The goal is to simulate elevators operating in a building while applying **OOP** and **SOLID principles**.

---

## 🛠 Features
- Multiple elevators with independent states (floor, direction, capacity).
- Request handling: users can request elevators and specify destination floors.
- Elevator scheduling using the **Nearest Elevator Strategy**.
- Queue management for multiple requests.
- Extensible design with **Strategy Pattern** for different scheduling algorithms.
- Modular, testable, and scalable backend code.

---

## 📂 Project Structure
ElevatorSystem/
├── Direction.java
├── Request.java
├── Elevator.java
├── ElevatorController.java
└── Main.java

---

## 🚀 How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/vinod-4284/Elevator-Design-LLD.git
Navigate to the project folder:

bash
cd Elevator-Design-LLD
Compile the project:

bash
javac *.java
Run the simulation:

bash
java Main
📈 Future Enhancements
Add advanced scheduling algorithms (Look Algorithm, SCAN).

Implement concurrency with threads for real-time simulation.

Integrate logging and monitoring.

Build a simple UI (console or web-based) for visualization.

Extend to multi-building or smart elevator systems.

👨‍💻 Author
Developed by Vinod (@vinod-4284)  
📌 Focused on Java, backend design, and system design interview preparation.
