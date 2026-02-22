# Community Rainwater Harvesting Tank Management System (Hibernate)

## 📌 Project Overview

This project is a Java application developed using **Hibernate ORM** and **Oracle (SQL*Plus)** to manage community rainwater harvesting tanks.
It allows storing and retrieving tank details, maintenance visits, and reports.

The project demonstrates how Hibernate maps Java objects to database tables using annotations.

---

## 🛠️ Technologies Used

* Java
* Hibernate ORM
* Oracle Database (SQL*Plus)
* JDBC Driver
* Eclipse IDE
* Maven (if applicable)

---

## 🗄️ Database

**Database:** Oracle XE
**Connection URL:** `jdbc:oracle:thin:@localhost:1521:xe`

### Main Tables

* `TANK_TBL` → Stores tank details
* `MAINT_VISIT_TBL` → Stores maintenance visit details
* `MAINT_REPORT_TBL` → Stores maintenance reports

---

## 🧩 Features

✔ Add new tank details
✔ View tank information
✔ Map One-to-Many relationship (Tank → Visits)
✔ Map One-to-Many relationship (Visit → Reports)
✔ Demonstrates DAO pattern
✔ Transaction management using Hibernate

---

## 📂 Project Structure

src/main/java
  ├── com.rainwater.app → Main classes
  ├── com.rainwater.dao → DAO classes
  ├── com.rainwater.entity → Entity classes
  └── com.rainwater.util → Hibernate utility

src/main/resources
  └── hibernate.cfg.xml


---

## 🎓 Learning Outcomes

* Understanding Hibernate configuration
* Implementing ORM using annotations
* Performing CRUD operations
* Managing database transactions
* Designing entity relationships




This project is for educational purposes.
