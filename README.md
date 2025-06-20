# 🛒 E-commerce Website — Backend

> A powerful and scalable backend for an E-commerce application built using **Spring Boot**, **Spring Data JPA**, and **MySQL**. Provides secure and RESTful API endpoints for product, cart, and order management.

---

## 🌐 API Base URL

🔗 [Live API](https://steadfast-enthusiasm-production.up.railway.app/)

---

## 📂 Modules & Endpoints

### 🛍️ Product Management
- `GET /products` — Fetch all products  
- `GET /products/{id}` — Fetch product by ID  
- `POST /products` — Add a new product (multipart/form-data)  
- `PUT /products/{id}` — Update existing product  
- `DELETE /products/{id}` — Delete product  

### 🛒 Cart Operations
- `POST /cart/add` — Add product to cart  
- `GET /cart` — Get all cart items  
- `DELETE /cart/{id}` — Remove product from cart  

### ✅ Checkout / Order (Optional)
- `POST /checkout` — Place an order  
- `GET /orders` — Fetch order history  

---

## 🧠 Features

- 📦 Product CRUD with image upload  
- 🛒 Cart functionality  
- 🔐 Secure REST API structure  
- 🗃️ MySQL DB integration  
- 🌐 CORS configured for frontend  
- 📁 Clean layered architecture (Controller, Service, Repository, Model)

---

## 🔧 Tech Stack

- Java 17  
- Spring Boot  
- Spring Data JPA  
- Hibernate  
- MySQL  
- Maven  
- Railway (Deployment)  

---

## 🛠️ Setup Instructions

```bash
# Clone the repository
git clone https://github.com/your-username/ecommerce-backend.git
cd ecommerce-backend

# Build and run
./mvnw spring-boot:run
