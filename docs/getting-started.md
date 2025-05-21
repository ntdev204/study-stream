# Getting Started

Welcome to the StudyStream project! This guide will help you set up the development environment and run the project locally for the first time.

---

## Prerequisites

Make sure you have the following installed on your machine:

- [Node.js](https://nodejs.org/) (v16 or later) — for frontend and backend (if using Node)
- [Docker](https://www.docker.com/get-started) — for containerized services (optional but recommended)
- [Java JDK](https://adoptium.net/) (version 17 or later) — if backend is Spring Boot
- [Yarn](https://yarnpkg.com/) or [npm](https://www.npmjs.com/) — package managers

---

## Clone the Repository

```bash
git clone https://github.com/ntdev204/modern-portfolio.git
cd study-stream
```

---

## Install dependencies

1. Client

   ```bash
   cd frontend/client
   npm install
   ```

2. Admin

   ```bash
   cd frontend/admin
   npm install
   ```

3. Gateway

   ```bash
   cd backend/gateway
   npm install
   ```

---

## Environment Variables

Make sure to create `.env` files in each folder if needed, based on the .env.example files provided.

---

## Run the Project

1. Client

   ```bash
   cd frontend/client
   npm run dev
   ```

2. Admin

   ```bash
   cd frontend/admin
   npm run dev
   ```

3. Gateway

   ```bash
   cd backend/gateway
   npm run dev
   ```

---

## Access the Application

- Client: [http:localhost:3000](http:localhost:3000)
- Admin: [http:localhost:3030](http:localhost:3001)
- Gateway: [http:localhost:8080](http:localhost:8080)
