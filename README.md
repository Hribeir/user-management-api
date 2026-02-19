# User Management API

REST API for user management built with Spring Boot and JPA.

## 🚀 Technologies

- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database
- Maven
- Lombok

---

## 📌 About the Project

This project is a REST API that allows basic user management operations:

- Create user
- List all users
- Find user by ID
- Update user
- Delete user

The application follows a layered architecture:

Controller → Model → Repository → Database

---

## 🗂 Project Structure
```
src/main/java/com/henriqueribeiro/usermanagement
│
├── controller
├── model
├── repository
```

---

## ⚙️ Running the Application

#### 1️⃣ Clone the repository
```bash
git clone https://github.com/Hribeir/user-management-api
````

#### 2️⃣ Enter the project folder
```bash
cd user-management-api
```

#### 3️⃣ Run the project
```bash
./mvnw spring-boot:run
```
or run directly from your IDE.

#### 🗄 H2 Database Console
After running the application, access:
```bash
http://localhost:8080/h2-console
```



```markdown
Use:

- JDBC URL: `jdbc:h2:mem:testdb`
- Username: `sa`
- Password: (leave blank)
```


#### 📡 API Endpoints
```bash

| Method | Endpoint     | Description       |
|--------|--------------|-------------------|
| GET    | /users       | List all users    |
| GET    | /users/{id}  | Get user by ID    |
| POST   | /users       | Create a new user |
| PUT    | /users/{id}  | Update user       |
| DELETE | /users/{id}  | Delete user       |

```
---
👨‍💻 Author

Henrique Ribeiro

