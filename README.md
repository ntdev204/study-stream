# 🎓 Study Stream - Learning Management System

**Study Stream** is a modern, microservice-based Learning Management System (LMS) that empowers students to learn smarter, track skills, and get personalized AI support. It also enables instructors and employers to create, manage, and assess courses and learners efficiently.

---

## 📚 Table of Contents

- [🎓 Study Stream - Learning Management System](#-study-stream---learning-management-system)
  - [📚 Table of Contents](#-table-of-contents)
  - [✨ Features](#-features)
  - [🧰 Tech Stack](#-tech-stack)
  - [🚀 Getting Started](#-getting-started)
    - [Prerequisites](#prerequisites)
  - [🧪 Local Setup](#-local-setup)
    - [Clone the repo](#clone-the-repo)
    - [Frontend](#frontend)
    - [Backend](#backend)
  - [📁 Project Structure](#-project-structure)
  - [📄 License](#-license)
  - [📬 Contact](#-contact)

---

## ✨ Features

- 🔐 Secure Authentication & Authorization (JWT, Role-based)
- 🧑‍🏫 Admin/Instructor/Student/Employer Dashboards
- 📘 Course & Content Management
- 📈 Skill & Progress Tracking
- 🧠 AI Assistant for Learning (Quiz Generator, Smart Feedback)
- 💬 REST, GraphQL, gRPC APIs
- ☁️ Fully Containerized & Scalable with Docker & Kubernetes
- ✅ Unit, Integration, and E2E Testing
- 🌐 API Gateway (Express.js)
- 🌍 Multi-language, mobile-first frontend with Next.js 15

---

## 🧰 Tech Stack

| Layer       | Technology                                              |
| ----------- | ------------------------------------------------------- |
| Frontend    | Next.js 15, Tailwind CSS, NextAuth                      |
| API Gateway | Node.js (Express.js)                                    |
| Backend     | Java 21, Spring Boot (Microservices), Redis, PostgreSQL |
| AI Module   | Python, FastAPI, OpenAI, LangChain                      |
| DevOps      | Docker, GitHub Actions, Kubernetes (K8s), Helm          |
| Protocols   | REST, GraphQL, gRPC                                     |

---

## 🚀 Getting Started

### Prerequisites

- Node.js >= 18.x
- Docker & Docker Compose
- JDK 21
- Python 3.10+
- PostgreSQL / Redis (Docker-ready)

---

## 🧪 Local Setup

### Clone the repo

```bash
git clone https://github.com/your-org/study-stream.git
cd study-stream

docker-compose up --build
```

### Frontend

1. Client

   ```bash
   cd frontend/client
   npm install
   npm run dev
   ```

2. Admin

   ```bash
   cd frontend/admin
   npm install
   npm run dev
   ```

### Backend

1. API Gateway

   ```bash
   cd backend/gateway
   npm install
   npm run dev
   ```

2. Services

   ```bash
   cd backend/services/<service-name>
   ./mvnw spring-boot:run
   ```

3. AI Module

   ```bash
   cd backend/ai
   pip install -r requirements.txt
   uvicorn app.main:app --reload
   ```

## 📁 Project Structure

## 📄 License

This project is licensed under the MIT License.

## 📬 Contact

Maintainer: [ntdev.npc204@gmail.com](mailto:ntdev.npc204@gmail.com)
Project by the Study Stream team.
