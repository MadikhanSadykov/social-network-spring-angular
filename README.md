
# Social Network web application

Clone "Instagram" application.


# API Reference

### Registration - Validate and Save new User

```http
  POST /api/auth/signup
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `email` | `String` | **Required**. Email of user |
| `username` | `String` | **Required**. Nick name of user |
| `firstname` | `String` | **Required**. Name of user |
| `lastname` | `String` | **Required**. Surname of user |
| `password` | `String` | **Required**. Password of user |
| `confirmPassword` | `String` | **Required**. Confirm password |

### Authentication - Authenticate and generate JWT

```http
  POST /api/auth/signin
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `email`      | `String` | **Required**. Email of registered user |
| `password` | `String` | **Required**. Password of registered user |


### Authorization - Validate JWT and return Data

```http
  GET /api/*
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `jwt`      | `JWT TOKEN` | **Required**. Json Web Toket |



