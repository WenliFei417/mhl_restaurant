# MHL Restaurant Management System

This is a **Java console application** developed as a **course project**.  
It simulates a restaurant management system and demonstrates how to use layered architecture with database integration.

---

## ✨ Features
- **Employee Login** – simple authentication for staff
- **Menu Management** – display and query dishes
- **Dining Table Management** – reserve, update, and free tables
- **Order & Billing Management** – create bills, view unpaid bills, settle accounts
- **Layered Architecture** – DAO, Service, Domain, View separation
- **Database Connection Pool** – implemented with Alibaba Druid + DBUtils

---

## 📂 Project Structure
```
mhl/
├── libs/                        # external dependencies
│   ├── commons-dbutils-1.3.jar
│   ├── druid-1.1.10.jar
│   └── mysql-connector-java-8.0.30.jar
├── src/
│   ├── com/hspedu/mhl/dao       # DAO layer (database operations)
│   ├── com/hspedu/mhl/domain    # Domain models (entity classes)
│   ├── com/hspedu/mhl/service   # Business logic layer
│   ├── com/hspedu/mhl/utils     # Utility classes
│   ├── com/hspedu/mhl/view      # Console-based user interface
│   └── druid.properties.example # example DB configuration
└── out/                         # build output (ignored in git)
```

---

## 🛠 Requirements
- **Java JDK 8+**
- **MySQL 5.7+**
- **Dependencies (included in `libs/`)**  
  - `commons-dbutils-1.3.jar`
  - `druid-1.1.10.jar`
  - `mysql-connector-java-8.0.30.jar`

---

## ⚙️ Setup

### 1. Clone the repository
```bash
git clone https://github.com/<your-username>/mhl_restaurant.git
cd mhl_restaurant
```

### 2. Configure the database
1. Create a MySQL database named `mhl`
2. Import the SQL schema (if provided by your course material)
3. Copy the example config:
   ```bash
   cp src/druid.properties.example src/druid.properties
   ```
4. Edit `src/druid.properties` with your own MySQL username & password:
   ```properties
   driverClassName=com.mysql.cj.jdbc.Driver
   url=jdbc:mysql://localhost:3306/mhl?rewriteBatchedStatements=true
   username=root
   password=YOUR_PASSWORD
   ```

### 3. Compile the project
```bash
javac -cp "libs/*" -d out $(find src -name "*.java")
```

### 4. Run the application
```bash
java -cp "out:libs/*" com.hspedu.mhl.view.MHLView
```

---

## 📖 Example Workflow
1. Employee logs in with account credentials  
2. System shows main menu:
   - Manage dining tables  
   - View dishes  
   - Create new order  
   - Check bills  
3. User interacts via console inputs

---

## 📌 Notes
- `out/` folder and `src/druid.properties` are ignored in version control.  
- Use `druid.properties.example` as a template for your own DB config.  
- This is an educational project for learning **Java + JDBC + DBUtils + Druid**.  

---

## 📖 License
This project is provided **for educational purposes only**.
