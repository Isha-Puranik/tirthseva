#  TirthSeva - Online Temple Service Booking System

##  Project Overview
TirthSeva is a full-stack web application designed to provide a seamless platform for users to book temple-related services online. Users can explore temples, book services, and manage bookings, while administrators can manage services, users, and all bookings efficiently through an admin panel.

It provides role-based access (Service Provider/User), secure JWT authentication, secure payment process and search/filter temples by location.

This project demonstrates real-world enterprise-level backend design using Spring Boot and React integration.

This project is developed as part of my **Java Full Stack Developer (CDAC Kharghar)** learning journey.

---

##  Features:

###  User Features
- User Registration & Login (Authentication)
- Browse available temple services
- Book temple services online
- View booking history
- Manage user profile

###  Service Provider Features
- Secure admin login panel
- Add / update / delete temple services
- Manage user bookings
- View all registered users

---

##  Tech Stack

### Frontend
- React.js
- HTML5
- CSS3
- JavaScript
- Axios (API integration)

### Backend
- Java
- Spring Boot
- RESTful APIs

### Database
- MySQL

### Security
-JWT Authentication

### Styling
- Bootstrap 5

### Tools
- Git & GitHub
- Maven
- Postman
- VS Code / Spring Tool Suite (STS)


---

##  System Architecture

React Frontend → Spring Boot REST APIs → MySQL Database
                 ↑
              JWT Security Layer
---

## Project Structure
🔹 Backend (Spring Boot)
backend-spring/
├── src/main/java/com/tirthseva/api/
│   ├── config/             # Global configurations
│   ├── controller/         # REST Controllers (Auth, Temple, Booking)
│   ├── dto/                # Data Transfer Objects organized by module
│   ├── entity/             # Database Models (JPA Entities)
│   ├── repository/         # JPA Repositories for DB access
│   ├── security/           # JWT, SecurityConfig, UserDetails
│   ├── service/            # Business Logic interfaces & implementations
│   ├── util/               # Helper classes (JWTUtils, FileUtils)
│   └── TirthSevaApplication.java
├── src/main/resources/     # application.properties & Static assets
├── uploads/                # Root folder for profile/temple images
└── pom.xml

🔹 Frontend (React)

frontend/
├── public/                 # Static assets (favicons, etc.)
├── src/
│   ├── context/           # AuthContext.jsx for global state
│   ├── pages/             # Routed pages
│   │   ├── admin/         # Admin Dashboard & Management
│   │   ├── provider/      # Temple/Bhaktnivas Provider views
│   │   ├── user/          # User Profile & Bookings
│   │   └── public/        # Home, Login, Signup
│   ├── services/          # Axios API calls
│   ├── utils/             # Helper functions (Date formatting, etc.)
│   ├── App.jsx            # Routes & Layout
│   ├── main.jsx           # Entry point
│   └── index.css          # Global styles
├── package.json
└── vite.config.js
---

##  Setup Instructions

### 🔹 1. Clone Repository
```bash id="clone01"
git clone https://github.com/Isha-Puranik/tirthseva.git
cd tirthseva



🔹 2. Backend Setup (Spring Boot)
Open backend project in STS / IntelliJ
Configure MySQL database in application.properties:
spring.datasource.url=jdbc:mysql://localhost:3306/tirthseva
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
server.port=8080
Run backend:
mvn spring-boot:run

👉 Backend runs at:

http://localhost:8080


🔹 3. Frontend Setup (React)
cd frontend
npm install
npm start

👉 Frontend runs at:

http://localhost:3000

-----

## Authentication Flow

User logs in via /api/auth/login
Backend returns JWT token
Token stored in localStorage
Axios automatically attaches token in headers
Backend validates token via JwtFilter

-----

## Roles & Permissions

Role			Access

Service Provider	Full system access and manage service
USER			Book Service

----

## Database Overview

Core Tables

Users 		– stores user details 
Temples 	– stores temples information Bookings – stores booking details 
darshan_slots   – stores  darshan_slots records
payments	- stores information about payments like 
bhaktnivas	– stores bhaktanivas details 
bhaktnivas_slots- stores bhaktanivas details 



----

## API Endpoints 

| Method | Endpoint            | Description      |
| ------ | ------------------- | ---------------- |
| POST   | /api/users/register | Register user    |
| POST   | /api/users/login    | Login user       |
| GET    | /api/services       | Get all services |
| POST   | /api/bookings       | Create booking   |

------

##Dependencies

Backend:

Spring Boot Starter Web
Spring Security
Spring Data JPA
MySQL Connector
JWT Library

Frontend:

React Router DOM
Axios
Bootstrap

----

## Future Improvements:

Payment gateway integration
Email/SMS notifications
Advanced admin dashboard
Mobile responsive UI

-----


## Developer:
Isha Anant Puranik
Solapur, Maharashtra
puranikisha@gmail.com

🔗 GitHub: https://github.com/Isha-Puranik

🔗 LinkedIn: https://linkedin.com/in/isha-puranik

----------

## Project Status

 Backend Completed
 Frontend Completed
 JWT Authentication Implemented
 Database Integration Done

----