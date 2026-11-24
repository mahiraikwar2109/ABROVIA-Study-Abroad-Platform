
# ABROVIA – Study Abroad Consultancy Platform

## Project Overview
ABROVIA is a web-based study abroad consultancy platform that helps students explore international study destinations and submit course enquiries.

## Technologies Used
- Frontend: HTML, CSS, JavaScript
- Backend: Java, Spring Boot
- Database: H2 Database
- Build Tool: Maven

## Main Features
1. Student enquiry submission
2. Study destination information
3. University finder
4. Admin login
5. Admin dashboard
6. View and delete student enquiries
7. Input validation
8. REST API integration

## Project Structure
- frontend/ – Website files
- backend/ – Spring Boot application
- src/ – Java core application
- tests/ – Testing files
- docs/ – Project documentation

## How to Run

### Backend
1. Install JDK 17 or later.
2. Open the backend folder in VS Code.
3. Run:

   .\mvnw.cmd spring-boot:run

4. Backend runs at http://localhost:8080

### Links
Live website: https://abrovia-website.onrender.com/
Backend health: https://abrovia-study-abroad-platform.onrender.com/api/hello
GitHub source: https://github.com/mahiraikwar2109/ABROVIA-Study-Abroad-Platform

### Frontend
1. Open the frontend folder in VS Code.
2. Run index.html using Live Server.

## API Endpoints

| Method | Endpoint | Purpose |
|---|---|---|
| GET | /api/enquiries | View enquiries |
| POST | /api/enquiries | Submit enquiry |
| DELETE | /api/enquiries/{id} | Delete enquiry |

## Project Purpose
Developed as an integrated academic project covering Java programming, e-commerce, software engineering, cloud computing and startup concepts.

## Note
This is an academic prototype. The login and database configuration are not intended for production use.
