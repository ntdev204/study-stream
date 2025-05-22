# 🎓 Study Stream - Learning Management System

**Study Stream** is a modern, microservice-based Learning Management System (LMS) that empowers students to learn smarter, track skills, and get personalized AI support. It also enables instructors and employers to create, manage, and assess courses and learners efficiently.

---

## 📚 Table of Contents

---

## ✨ Features

---

## 🧰 Tech Stack

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
