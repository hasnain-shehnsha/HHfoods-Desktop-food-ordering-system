📄 README.md
# HHFoods - Java Desktop Billing System

**HHFoods** is a desktop-based billing system developed using **Java Swing** and **MySQL**. It features a clean role-based login system (User/Admin), item selection with cart functionality, PDF bill generation, and admin controls for managing prices and sales records.

---

## 📁 Project Structure

```
HHFoods/
├── bills/           # PDF bills generated for each order
├── lib/             # Required external JAR libraries
├── connector/       # MySQL JDBC connector
├── mainHHFoods/     # NetBeans project folder (src, nbproject, etc.)
├── database.sql     # Exported MySQL database (via phpMyAdmin)
└── README.md        # Project documentation
```


## 💻 Features

### 👤 User Login

- Secure username/password login
- Role selection: User or Admin
- Forgot Password and Registration support

### 🛒 User Functionality

- Menu item listing
- Add to cart
- View total and generate bill
- View profile 
- Change password
- PDF bill export

### 🔧 Admin Functionality

- Change item prices
- View full bill records (sales history)
- View profile 
- Change password

---

## 🛠 Technologies Used

| Layer    | Tech                   |
| -------- | ---------------------- |
| Frontend | Java Swing (NetBeans)  |
| Backend  | JDBC + MySQL           |
| Database | MySQL (via XAMPP)      |
| Export   | PDF (iText or similar) |

---

## 🚀 How to Run

1. Clone this repo or download ZIP.
2. Import the `mainHHFoods` folder into **NetBeans**.
3. Start **XAMPP** (`Apache + MySQL`).
4. Open **phpMyAdmin** and import `database.sql`.
5. Update DB connection settings in code if needed.
6. Run the project in NetBeans.

---

## 🖼 Screenshots

### 🔐 Login Screen
<img width="1371" height="913" alt="login" src="https://github.com/user-attachments/assets/6aec936e-866f-4313-9304-8f70ff78dc87" />
<img width="1356" height="871" alt="Register" src="https://github.com/user-attachments/assets/684e095e-5c0d-48fb-ba05-e3989f7899e6" />
<img width="1444" height="857" alt="Forget Password" src="https://github.com/user-attachments/assets/dfe05dac-316c-4c98-8308-fe292b07d265" />

### 🛒 User Item Menu
<img width="1914" height="1027" alt="Home(menu)" src="https://github.com/user-attachments/assets/84d010f3-3609-4b44-8064-bf53b65fa382" />
<img width="766" height="540" alt="Change Password" src="https://github.com/user-attachments/assets/aa20a52f-25be-48de-a73e-70a31e57eb86" />

### 🛠 Admin Panel
<img width="791" height="603" alt="Admin panel" src="https://github.com/user-attachments/assets/40456dc4-f356-4fc9-8436-5c79fd8c92d5" />
<img width="1360" height="944" alt="Price Change" src="https://github.com/user-attachments/assets/eda3af44-bc5e-4ee1-92a5-329a89264d75" />


### 🧾 PDF Bill
<img width="1237" height="794" alt="Bills" src="https://github.com/user-attachments/assets/a9f2a4b3-1d0c-4217-9067-b0bbe36018bf" />


---

## 📌 Note

Make sure all `.jar` files in `/Jar lib/` and `/JDBC connector/` are added to your project libraries in NetBeans.

---

## 🧑‍💻 Author

**Hasnain Shehnsha**

