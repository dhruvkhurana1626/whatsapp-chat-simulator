# WhatsApp Chatbot Simulator (Spring Boot)

## 📌 Overview

This project is a simple backend simulation of a WhatsApp chatbot built using Java and Spring Boot. It demonstrates how webhook-based systems receive and process messages.

---

## ⚙️ Features

* REST API endpoint (`/webhook`)
* DTO-based request and response handling
* Predefined chatbot replies
* Console logging of incoming messages
* Timestamp included in responses
* Clean layered architecture (Controller + Service + DTO)

---

## 🛠️ Tech Stack

* Java
* Spring Boot
* REST API

---

## 🔗 API Endpoint

### POST /webhook

#### Request Body

```json
{
  "message": "Hi"
}
```

#### Response

```json
{
  "reply": "Hello",
  "timestamp": "2026-03-31T12:00:00"
}
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

1. Clone the repository
2. Run the application
3. Access:

```
http://localhost:8080/webhook
```

---

## ☁️ Deployment

This application can be deployed on platforms like Render.

---

## 📂 Project Structure

```
src/
 ├── controller/
 ├── service/
 ├── dto/
```

---

## 📹 Demo

(Attach your demo video link here)

---
