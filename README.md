<!-- ================= HERO SECTION ================= -->

<p align="center">
  <img src="https://capsule-render.vercel.app/api?type=waving&color=0:141E30,100:243B55&height=250&section=header&text=E-Commerce%20Microservices%20Platform&fontSize=42&fontColor=ffffff&animation=fadeIn&fontAlignY=35"/>
</p>

<h1 align="center">Somnath Rana</h1>
<h3 align="center">Backend Engineer • Spring Boot • Microservices • JWT • Docker • System Design</h3>

<p align="center">
  <img src="https://readme-typing-svg.herokuapp.com/?lines=Building+Scalable+Microservices;Secure+JWT+Authentication;Distributed+System+Design;Production+Ready+Backend&center=true&width=900&height=45">
</p>

---


# 🚀 Project Overview

This project is a **Production-Style E-Commerce Backend System**  
built using **Microservices Architecture with Spring Boot**.

The system demonstrates:

- Independent service deployment
- Secure JWT authentication
- API Gateway routing
- Distributed system design
- Containerized infrastructure
- Clean layered architecture

This is designed following real-world backend engineering practices.

---

# 🏗 Complete System Architecture

```
                      🌐 Client (Frontend / Postman)
                                  │
                                  ▼
                           🚪 API Gateway
                                  │
     ┌────────────────────────────┼────────────────────────────┐
     ▼                            ▼                            ▼
 👤 User Service            📦 Product Service           📑 Order Service
 (Authentication)           (CRUD Operations)           (Order Handling)
     │                            │                            │
     └──────────────┬─────────────┴───────────────┬────────────┘
                    ▼                             ▼
              📊 Inventory Service          💳 Payment Service
                    │                             │
                    └──────────────┬──────────────┘
                                   ▼
                             🗄 MySQL Database
```

---

# 📦 Microservices Breakdown

## 👤 User Service (Port 8082)
- User Registration
- Login Authentication
- Password Encryption (BCrypt)
- JWT Token Generation
- Role Management
- Stateless Authentication

## 📦 Product Service (Port 8081)
- Create Product
- Update Product
- Delete Product
- Get Product by ID
- Get All Products

## 📑 Order Service
- Place Order
- Order Status
- Order History

## 📊 Inventory Service
- Stock Validation
- Quantity Update
- Product Availability Check

## 💳 Payment Service
- Payment Processing (Mock)
- Transaction Status
- Order Confirmation

## 🚪 API Gateway
- Central Entry Point
- Route Mapping
- Security Enforcement
- Request Filtering

---

# 🧠 Architecture Principles Used

- Layered Architecture (Controller → Service → Repository)
- Separation of Concerns
- Microservice Isolation
- Stateless Authentication
- RESTful API Standards
- Secure Password Hashing
- Independent Scalability

---

# 📂 Complete Project Structure

```
ecommerce-microservices/
│
├── api-gateway/
│   ├── src/main/java/
│   └── application.yml
│
├── user-service/
│   ├── controller/
│   ├── service/
│   ├── repository/
│   ├── security/
│   ├── model/
│   └── application.properties
│
├── product-service/
│   ├── controller/
│   ├── service/
│   ├── repository/
│   ├── model/
│   └── application.properties
│
├── order-service/
├── inventory-service/
├── payment-service/
│
├── docker-compose.yml
└── README.md
```

---

# 🔐 Authentication Flow (JWT)

1️⃣ User registers  
2️⃣ Password encrypted using BCrypt  
3️⃣ User logs in  
4️⃣ JWT token generated  
5️⃣ Token must be included in Authorization Header  

Example:

```
Authorization: Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9...
```

---

# 🔗 Core API Endpoints

## 🔐 Authentication

| Method | Endpoint |
|--------|----------|
| POST | /api/auth/register |
| POST | /api/auth/login |

## 📦 Products

| Method | Endpoint |
|--------|----------|
| GET | /api/products |
| GET | /api/products/{id} |
| POST | /api/products |
| PUT | /api/products/{id} |
| DELETE | /api/products/{id} |

---

# 🛠 Technology Stack

| Category | Technology |
|----------|------------|
| Language | Java 21 |
| Framework | Spring Boot |
| Security | Spring Security + JWT |
| Gateway | Spring Cloud Gateway |
| Database | MySQL |
| ORM | Spring Data JPA |
| Containerization | Docker |
| Build Tool | Maven |

---

# 🐳 Dockerized Deployment

Run entire system using:

```bash
docker-compose up --build
```

All services run independently and communicate via internal network.

---

# 📈 Scalability & Production Readiness

- Stateless services
- Independent service deployment
- Clear separation of responsibilities
- Easily extendable architecture
- Cloud-ready structure

---

# ⭐ Why This Project Stands Out

- Real Microservices Implementation
- Secure Authentication with JWT
- API Gateway Integration
- Production-Oriented Structure
- Clean Code & Modular Design
- Expandable Architecture

---

# 🔮 Future Enhancements

- Service Discovery (Eureka)
- Kafka Event-Driven Architecture
- Redis Caching
- CI/CD Integration
- Kubernetes Deployment
- Distributed Tracing (Zipkin)

---

# 👨‍💻 Author

Somnath Rana  
Backend Engineer | Microservices | Spring Boot | System Design  

---

⭐ If you found this project valuable, consider giving it a star!
