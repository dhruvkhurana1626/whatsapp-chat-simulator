# WhatsApp Chatbot Simulator (Spring Boot)

## 📌 Overview

This project is a backend simulation of a WhatsApp chatbot built using Java and Spring Boot. It demonstrates how webhook-based systems receive and process messages.

---

## ⚙️ Features

* REST API endpoint (`/webhook`)
* DTO-based request and response
* Predefined chatbot replies
* Console logging of incoming messages
* Timestamp included in response
* Clean architecture (Controller + Service + DTO)

---

## 🛠️ Tech Stack

* Java
* Spring Boot
* REST API

---

## 🔗 API Endpoints

### 1. Webhook Endpoint

**POST** `/webhook`

#### Request:

```json
{
  "message": "Hi"
}
```

#### Response:

```json
{
  "reply": "Hello",
  "timestamp": "2026-03-31T12:00:00"
}
```

---

### 2. Health Check

**GET** `/webhook/health`

#### Response:

```text
Application is running
```

---

## 🌐 Live Deployment (AWS EC2)

Base URL:

```
http://13.233.224.128:8080
```

Example:

```
http://13.233.224.128:8080/webhook
```

---

## 🧪 Test Cases

| Input  | Output                   |
| ------ | ------------------------ |
| Hi     | Hello                    |
| Bye    | Goodbye                  |
| Random | I didn't understand that |
| Empty  | Invalid message          |

---

## 🚀 Running Locally

1. Clone repo
2. Run application
3. Test:

```
http://localhost:8080/webhook
```

---

## 📂 Project Structure

```
src/
 ├── controller/
 ├── service/
 ├── dto/
```

---

## 📹 Demo Video

WhatsApp Chatbot Backend (Spring Boot) | Webhook API + AWS EC2 Deployment
Full Video Link -> https://youtu.be/xLYR1JE28cg

---
