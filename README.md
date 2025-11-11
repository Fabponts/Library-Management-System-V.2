# Library Management System V.2
![Status](https://img.shields.io/badge/status-finalizado-brightgreen)
![Java](https://img.shields.io/badge/Java-17%2B-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen)
![Maven](https://img.shields.io/badge/Maven-Build-blue)
![License](https://img.shields.io/badge/License-MIT-lightgrey)
![Swagger](https://img.shields.io/badge/Swagger-UI-green)


## Description
A RESTful API built to manage a library’s core operations — including user management, book catalog control, and the borrowing and returning flow.
The project follows a layered architecture and applies clean code principles to ensure scalability, clarity, and ease of maintenance.

## API Documentation(Swagger Ui)
The project includes an integrated Swagger UI for easy testing and exploration of endpoints.
After running the project, access it at:
👉 http://localhost:8081/swagger-ui.html

## Project Structure
 ```bash
src/
 ├── main/
 │    ├── java/com/example/library/
 │    │    ├── controller/    → REST controllers
 │    │    ├── service/       → Business logic
 │    │    ├── model/entities/→ JPA entities
 │    │    ├── exception/     → Custom exceptions
 │    │    └── repository/    → Data access layer
 │    └── resources/
 │         ├── application.properties
 │         └── data.sql
 └── test/                    → Unit tests
 ```

## Features 
- 👤 User Management: Register, list, and manage library users.
- 📖 Book Management: Add, update, and track books in the catalog.
- 🔄 Borrowing System: Borrow and return books with automatic status updates.
- 🧩 Layered Architecture: Divided into controller, service, model, and exception packages.
- ✅ Validation and Error Handling: Ensures data integrity and provides meaningful error messages.

## Technologies Used
- Java 17+
- Spring Boot (REST API framework)
- Spring Data JPA (data persistence)
- H2 / MySQL (database)
- Maven (build and dependency management)

## Running the Project
- Java 17+
- Maven Installed

### Steps
 ```bash
# Clone the repository
git clone https://github.com/yourusername/library-system.git

# Navigate to the project directory
cd library-system

# Build the project
mvn clean install

# Run the application
mvn spring-boot:run
```

🚧 *Feel free to suggest new features or improvements by opening an issue!*

## License
This project is licensed under the MIT License — feel free to use, modify, and share it.

## Creator 
 ```bash
Fabricio Pontes

fabriciopontes02.fa@gmail.com

https://github.com/Fabponts


 ```
