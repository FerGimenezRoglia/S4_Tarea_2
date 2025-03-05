Ejercicios de CRUD con Spring Boot

Este repositorio contiene tres ejercicios de CRUD desarrollados con Spring Boot utilizando diferentes bases de datos: H2 (en memoria), MySQL y MongoDB.

📄 Descripción

Cada nivel del ejercicio implementa una API REST para la gestión de frutas con operaciones CRUD:

Nivel 1 - H2 (nivel1/S04T02N01): Implementación de CRUD utilizando H2, una base de datos en memoria.

Nivel 2 - MySQL (nivel2/S04T02N02): Implementación de CRUD con MySQL, una base de datos relacional.

Nivel 3 - MongoDB (nivel3/S04T02N03): Implementación de CRUD con MongoDB, una base de datos NoSQL.

Cada API REST permite las siguientes operaciones:

GET /fruits → Obtener todas las frutas.

GET /fruits/{id} → Obtener una fruta por su ID.

POST /fruits → Agregar una nueva fruta.

PUT /fruits/{id} → Actualizar una fruta existente.

DELETE /fruits/{id} → Eliminar una fruta.

💻 Tecnologías Utilizadas

Java 17+

Spring Boot 3.4.3

Spring Data JPA (para H2 y MySQL)

Spring Data MongoDB (para MongoDB)

Postman (para pruebas de API)

Docker (opcional, para bases de datos locales)

📋 Requisitos

Para ejecutar estos proyectos, necesitas tener instalados:

Java Development Kit (JDK 17 o superior)

Maven (mvn -version)

MySQL (brew install mysql o instalación manual)

MongoDB (brew install mongodb-community o instalación manual)

Postman (para realizar pruebas a los endpoints)

🛠️ Instalación y Ejecución

Ejecutar el Proyecto Nivel 1 - H2

Clona el repositorio:

git clone https://github.com/FerGimenezRoglia/S4_Tarea_2.git

Accede al nivel 1:

cd S4_Tarea_2/nivel1/S04T02N01

Compila y ejecuta:

mvn spring-boot:run

La aplicación correrá en:

http://localhost:8080/fruits

Ejecutar el Proyecto Nivel 2 - MySQL

Asegúrate de que MySQL esté instalado y corriendo:

brew services start mysql

Crea la base de datos en MySQL (puedes hacerlo desde Workbench o terminal con):

CREATE DATABASE IF NOT EXISTS fruits;

Configura application.properties en src/main/resources/:

spring.datasource.url=jdbc:mysql://localhost:3306/fruits?useSSL=false&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=TU_CONTRASEÑA
spring.jpa.hibernate.ddl-auto=update

Ejecuta el proyecto:

mvn spring-boot:run

Ejecutar el Proyecto Nivel 3 - MongoDB

Asegúrate de que MongoDB esté instalado y corriendo:

brew services start mongodb-community

Abre una terminal y accede a MongoDB:

mongosh

Crea la base de datos y colección:

use Fruits;
db.createCollection("fruit");

Configura application.properties en src/main/resources/:

spring.data.mongodb.host=localhost
spring.data.mongodb.port=27017
spring.data.mongodb.database=Fruits

Ejecuta el proyecto:

mvn spring-boot:run

📁 Estructura del Proyecto

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

🔎 Pruebas con Postman

Para probar los endpoints, puedes usar Postman o un navegador:

Pruebas en Nivel 1 (H2) y Nivel 2 (MySQL)

GET http://localhost:8080/fruits

POST http://localhost:8080/fruits

PUT http://localhost:8080/fruits/{id}

DELETE http://localhost:8080/fruits/{id}

Pruebas en Nivel 3 (MongoDB)

GET http://localhost:8080/fruits

POST http://localhost:8080/fruits

PUT http://localhost:8080/fruits/{id}

DELETE http://localhost:8080/fruits/{id}

📚 Documentación

Para más información sobre Spring Boot y bases de datos:

Spring Boot Reference Guide

MySQL Documentation

MongoDB Documentation

Postman Documentation

📌 Autor: Fer Giménez Roglia📌 Fecha: Marzo 2025

