# 🎓 Study Stream - Learning Management System

![GitHub issues](https://img.shields.io/github/issues/ntdev204/study-stream) ![PRs Welcome](https://img.shields.io/badge/PRs-welcome-brightgreen.svg) ![Last Commit](https://img.shields.io/github/last-commit/ntdev204/study-stream) ![Stars](https://img.shields.io/github/stars/ntdev204/study-stream?style=social)

**Study Stream** is a modern, microservice-based Learning Management System (LMS) that empowers students to learn smarter, track skills, and get personalized AI support. It also enables instructors and employers to create, manage, and assess courses and learners efficiently.

## ✨ Features

- 🧑‍🎓 Student Dashboard with skill tracking
- 👨‍🏫 Instructor course builder
- 🧠 AI-based skill recommendation (coming soon)
- 🏆 Gamification for learning progress
- 🔐 Role-based authentication (JWT & NextAuth)
- 📊 Analytics for employers and instructors

## ⚙️ Tech Stack

| Layer             | Technology                            |
| ----------------- | ------------------------------------- |
| Frontend          | Next.JS, TypeScript, Tailwind CSS     |
| Authentication    | NextAuth, JWT, Redis                  |
| API Gateway       | Node.JS, Express.JS                   |
| Backend Services  | Spring Boot 3, PostgreSQL, Redis      |
| DevOps & Infra    | Docker, Kubernetes, GitHub Actions    |
| API Documentation | Swagger, GraphQL Playground, Protobuf |

## 📁 Project Structure

```bash
learnsphere/
├── .github/
│   └── workflows/
│
├── docker/
│
├── backend/
│   ├── api-gateway/
│   ├── services/
│   ├── ai/
│
├── docs/
│
├── frontend/
│   ├── website/
│   └── mobile/
│
├── k8s/
│
├── .env
├── .gitignore
├── CONTRIBUTING.md
├── LICENSE
├── README.md
├── docker-compose.yml
```

## 🚀 Getting Started

New to **Study Stream**?
Follow our [Getting Started Guide](./docs/getting-started.md) to:

- Set up your local development environment
- Run all services using Docker
- Understand the microservice structure

## 🤝 Contributing

We welcome contributions, issues, and feature requests!

- 📌 Check out our [open issues](https://github.com/ntdev204/study-stream/issues)
- 📖 See the [Contributing Guide](./CONTRIBUTING.md) before submitting a PR
- 💬 Join the discussion and help improve the project!

## 👤 Author

- Founder: **Nguyen Ngoc Thien**
- Github: [@ntdev204](https://github.com/ntdev204)

## 📄 License

Copyright © 2025 [Nguyen Ngoc Thien](https://github.com/ntdev204).
This project is [MIT](https://github.com/ntdev204/study-stream/blob/main/LICENSE) licensed.

## 📬 Contact

Maintainer: [ntdev.npc204@gmail.com](mailto:ntdev.npc204@gmail.com)
Project by the Study Stream team.

> 🔖 Note: This documentation is continuously updated to reflect the current system design and technologies. Please check the last update date before relying on a document.
