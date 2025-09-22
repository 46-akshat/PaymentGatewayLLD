# Payment Processing System

## Overview
This project is a payment processing system implemented in Java using the **Template Method**, **Proxy**, and **Factory** design patterns. It demonstrates how to structure a payment system with reusable, maintainable, and scalable code.

---

## Design Patterns Used and Reasons

### 1. Template Method Pattern
- **Why Used:**
    - To define the skeleton of the payment process algorithm in the `PaymentGateway` abstract class.
    - Ensures that all payment gateways follow the same process structure (e.g., validation, payment initiation, confirmation) while allowing specific steps to be customized by subclasses.
- **Benefit:** Promotes code reuse and enforces a consistent workflow across different payment gateways.

### 2. Proxy Pattern
- **Why Used:**
    - The `PaymentController` acts as a proxy to the `PaymentService`, controlling access to the core payment logic.
    - Allows the `PaymentController` to handle client requests, validate inputs, or add additional layers (e.g., logging, security) before delegating to the `PaymentService`.
- **Benefit:** Decouples the client from the service, making the system more modular and easier to maintain.

### 3. Factory Method Pattern
- **Why Used:**
    - The `GatewayFactory` encapsulates the creation logic for `PaymentGateway` objects based on the `GatewayType`.
    - Makes it easy to add new payment gateways without modifying existing code.
- **Benefit:** Promotes the Open/Closed Principle, ensuring the system is open to extension but closed to modification. It simplifies object creation and centralizes it in one place.

---

## Classes and Their Responsibilities

### 1. `Main`
- Entry point of the application.
- Initializes the `PaymentController`, `PaymentService`, and `Client`.
- Demonstrates the payment process using different gateways and banking systems.

### 2. `PaymentController`
- Acts as a proxy for the `PaymentService`.
- Handles client requests and delegates payment processing to the `PaymentService`.

### 3. `PaymentService`
- Implements the core payment processing logic.
- Uses the `GatewayFactory` to get the appropriate `PaymentGateway` and processes payments.

### 4. `PaymentGateway` (Abstract Class)
- Defines the template for the payment process.
- Subclasses (`PaytmGateway`, `RazorpayGateway`) implement specific payment logic.

### 5. `GatewayFactory`
- Implements the **Factory Method** pattern to create `PaymentGateway` instances based on the `GatewayType`.

### 6. `Client`
- Represents the user of the payment system.
- Interacts with the `PaymentController` to initiate payments.

### 7. `BankingSystem`
- Represents the banking system used for payment processing.
- Subclasses (`RazorpayBankingSystem`, `HDFCBankingSystem`) implement specific banking logic.

### 8. `PaymentRequest`
- Represents the payment details (e.g., amount, metadata).

### 9. `GatewayType`
- Enum representing the available payment gateways (e.g., `PAYTM`, `RAZORPAY`).

---

## How to Run
1. Clone the repository.
2. Build the project using Maven:
   ```bash
   mvn clean install

Run the Main class to see the payment processing system in action.
<hr></hr>
Future Enhancements
Add more payment gateways.
Implement advanced validation and error handling.
Integrate with real-world banking APIs.
