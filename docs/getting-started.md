# Getting Started

Welcome to the StudyStream project! This guide will help you set up the development environment and run the project locally for the first time.

---

## Prerequisites

Make sure you have the following installed on your machine:

- [Node.js](https://nodejs.org/) (v16 or later)
- [Docker](https://www.docker.com/get-started)
- [Java JDK](https://adoptium.net/) (version 17 or later)
- [Python](https://www.python.org/downloads/) (version 3.10 or later)

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

---

## Access the Application

- Client: [http:localhost:3000](http:localhost:3000)
- Admin: [http:localhost:3030](http:localhost:3001)
- Gateway: [http:localhost:8080](http:localhost:8080)
