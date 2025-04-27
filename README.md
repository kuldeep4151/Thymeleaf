# Employee Management System

A simple **CRUD** (Create, Read, Update, Delete) web application for managing employees, built using **Spring Boot**, **Thymeleaf**, **Spring Data JPA**, and **MySQL**.

---

## Features

- View all employees in a responsive table.
- Add a new employee with name and email.
- Update existing employee details.
- Delete an employee from the list.
- Dynamic HTML rendering using **Thymeleaf**.
- Backend persistence with **Spring Data JPA** and **MySQL**.

---

## Tech Stack

- **Backend:** Spring Boot 3.x, Spring MVC, Spring Data JPA
- **Frontend:** Thymeleaf, HTML5, Bootstrap 4
- **Database:** MySQL 8.x
- **Build Tool:** Maven
- **Others:** HikariCP, Hibernate ORM

---

## Getting Started

### Prerequisites

- Java 17 or later
- Maven 3.x
- MySQL Server

### Database Setup

1. Create a MySQL database named `emp`:
   ```sql
   CREATE DATABASE emp;
