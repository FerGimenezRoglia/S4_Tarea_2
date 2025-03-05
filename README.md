# Ejercicios de CRUD con Spring Boot

Este repositorio contiene tres ejercicios de CRUD desarrollados con Spring Boot utilizando diferentes bases de datos: **H2** (en memoria), **MySQL** y **MongoDB**.

---

## 📄 **Descripción**

Cada nivel del ejercicio implementa una API REST para la gestión de frutas con operaciones CRUD:

1. **Nivel 1 - H2** (`nivel1/S04T02N01`): Implementación de CRUD utilizando **H2**, una base de datos en memoria.
2. **Nivel 2 - MySQL** (`nivel2/S04T02N02`): Implementación de CRUD con **MySQL**, una base de datos relacional.
3. **Nivel 3 - MongoDB** (`nivel3/S04T02N03`): Implementación de CRUD con **MongoDB**, una base de datos NoSQL.

Cada API REST permite las siguientes operaciones:

- `GET /fruits` → Obtener todas las frutas.
- `GET /fruits/{id}` → Obtener una fruta por su ID.
- `POST /fruits` → Agregar una nueva fruta.
- `PUT /fruits/{id}` → Actualizar una fruta existente.
- `DELETE /fruits/{id}` → Eliminar una fruta.

---

## 💻 **Tecnologías Utilizadas**

- Java 17+
- Spring Boot 3.4.3
- Spring Data JPA (para H2 y MySQL)
- Spring Data MongoDB (para MongoDB)
- Postman (para pruebas de API)
- Docker (opcional, para bases de datos locales)

---

## 📋 **Requisitos**

Para ejecutar estos proyectos, necesitas tener instalados:

- Java Development Kit (JDK 17 o superior)
- Maven (`mvn -version`)
- MySQL (`brew install mysql` o instalación manual)
- MongoDB (`brew install mongodb-community` o instalación manual)
- Postman (para realizar pruebas a los endpoints)

---

## 🛠️ **Instalación y Ejecución**

### **Ejecutar el Proyecto Nivel 1 - H2**

1. Clona el repositorio:
   ```bash
   git clone https://github.com/FerGimenezRoglia/S4_Tarea_2.git
   ```
2. Accede al directorio:
   ```bash
   cd S4_Tarea_2/nivel1/S04T02N01
   ```
3. Compila y ejecuta:
   ```bash
   mvn spring-boot:run
   ```
4. La aplicación correrá en:
   ```
   http://localhost:8080/fruits
   ```

---

### **Ejecutar el Proyecto Nivel 2 - MySQL**

1. Asegúrate de que MySQL esté instalado y corriendo:
   ```bash
   brew services start mysql
   ```
2. Crea la base de datos en MySQL:
   ```sql
   CREATE DATABASE IF NOT EXISTS fruits;
   ```
3. Configura `application.properties` en `src/main/resources/`:
   ```
   spring.datasource.url=jdbc:mysql://localhost:3306/fruits?useSSL=false&serverTimezone=UTC
   spring.datasource.username=root
   spring.datasource.password=TU_CONTRASEÑA
   spring.jpa.hibernate.ddl-auto=update
   ```
4. Ejecuta el proyecto:
   ```bash
   mvn spring-boot:run
   ```

---

### **Ejecutar el Proyecto Nivel 3 - MongoDB**

1. Asegúrate de que MongoDB esté instalado y corriendo:
   ```bash
   brew services start mongodb-community
   ```
2. Abre una terminal y accede a MongoDB:
   ```bash
   mongosh
   ```
3. Crea la base de datos y colección:
   ```javascript
   use Fruits;
   db.createCollection("fruit");
   ```
4. Configura `application.properties` en `src/main/resources/`:
   ```
   spring.data.mongodb.host=localhost
   spring.data.mongodb.port=27017
   spring.data.mongodb.database=Fruits
   ```
5. Ejecuta el proyecto:
   ```bash
   mvn spring-boot:run
   ```

---

## 📁 **Estructura del Proyecto**

```
S4_Tarea_2/
│── nivel1/
│   └── S04T02N01/  # Proyecto con H2
│       ├── src/
│       ├── pom.xml
│
│── nivel2/
│   └── S04T02N02/  # Proyecto con MySQL
│       ├── src/
│       ├── pom.xml
│
│── nivel3/
│   └── S04T02N03/  # Proyecto con MongoDB
│       ├── src/
│       ├── pom.xml
```

---

## 🔎 **Pruebas con Postman**

Para probar los endpoints, puedes usar Postman o un navegador:

### **Pruebas en Nivel 1 (H2) y Nivel 2 (MySQL)**
- `GET http://localhost:8080/fruits`
- `POST http://localhost:8080/fruits`
- `PUT http://localhost:8080/fruits/{id}`
- `DELETE http://localhost:8080/fruits/{id}`

### **Pruebas en Nivel 3 (MongoDB)**
- `GET http://localhost:8080/fruits`
- `POST http://localhost:8080/fruits`
- `PUT http://localhost:8080/fruits/{id}`
- `DELETE http://localhost:8080/fruits/{id}`

---

## 📚 **Documentación**

Para más información sobre Spring Boot y bases de datos:

- [Spring Boot Reference Guide](https://docs.spring.io/spring-boot/docs/current/reference/html/)
- [MySQL Documentation](https://dev.mysql.com/doc/)
- [MongoDB Documentation](https://www.mongodb.com/docs/)
- [Postman Documentation](https://learning.postman.com/docs/getting-started/introduction/)

---

📌 **Autor:** Fer Giménez Roglia  
📌 **Fecha:** Marzo 2025
