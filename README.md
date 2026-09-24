# Hostel Management System

A monolithic hostel operations app using Java 8, Spring Boot, PostgreSQL, React, Vite, Axios, and JWT.

## Run locally

1. Create PostgreSQL database `hostel_management`.
2. Set `DB_USERNAME`, `DB_PASSWORD`, and optionally `DB_URL` in the environment.
3. Backend: `cd backend`, `mvn spring-boot:run`.
4. Frontend: `cd frontend`, `npm install`, `npm run dev`.

Demo login: `admin@hostel.in` / `admin123`

API documentation: `http://localhost:8080/swagger-ui.html`


Hostel Management System is a web-based application used by admins to manage floors, rooms, beds, residents, and rent payments.
The frontend is developed using React.js with a responsive admin dashboard.
The backend is developed using Java 8 and Spring Boot to provide RESTful APIs.
PostgreSQL is used as the relational database for storing hostel, resident, room, and payment information.
Spring Security with JWT is used for secure admin authentication and authorization.
Admin can create floors → rooms → beds and manage their occupancy.
When a resident joins, the admin assigns the resident to an available room and bed.
The system tracks monthly rent, payment date, pending amount, overdue amount, and payment status.
The dashboard provides real-time occupancy, available beds, resident details, and rent collection summaries.
Application flow: React.js → REST API → Spring Boot Service → JPA/Hibernate → PostgreSQL → response back to React.js.
