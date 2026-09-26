# Elevator-Design-LLD
Elevator Design LLD in Java simulates a real-world elevator system using clean architecture and OOP principles. It handles requests, scheduling, and state management with modular, testable code. Built for practicing backend design, scalability, and system design interview preparation.



#  Elevator System LLD (Java)

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


