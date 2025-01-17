ForoHub API - Plataforma de Discusión 🚀

Descripción del Proyecto 📋
ForoHub es una aplicación web desarrollada con Spring Boot que permite a los usuarios crear, consultar, actualizar y eliminar tópicos de discusión. La aplicación implementa autenticación JWT, control de acceso basado en roles y documentación de API con Swagger.


Características Principales ✨

🔐 Autenticación y autorización con JWT
📝 Gestión de tópicos (CRUD)
🛡️ Control de acceso por roles
📊 Documentación de API con Swagger
💾 Persistencia de datos con MySQL
🔄 Migraciones de base de datos con Flyway


Tecnologías Utilizadas 🔧

Backend:

Java 17+
Spring Boot 3.x
Spring Security
Spring Data JPA
Base de Datos:

MySQL 8.0
Flyway Migration
Autenticación:

JWT (JSON Web Tokens)
BCrypt Password Encoding
Documentación:

Swagger OpenAPI

Requisitos Previos
JDK 17 o superior
Maven
MySQL 8.0
IDE (IntelliJ IDEA, Eclipse, VS Code)


Configuración del Proyecto
1. Clonar el Repositorio
   
git clone https://github.com/tu-usuario/forohub.git
cd forohub

3. Configurar Base de Datos
Crear base de datos MySQL

CREATE DATABASE forohub;

Configurar credenciales en application.properties
PROPERTIES

spring.datasource.url=jdbc:mysql://localhost:3306/forohub

3. Compilar y Ejecutar





Endpoints principales 🌐
Autenticación
POST /login: Iniciar sesión y obtener token JWT
Tópicos
POST /topicos: Crear nuevo tópico (Requiere autenticación)
GET /topicos: Listar tópicos (Requiere autenticación)
PUT /topicos/{id}: Actualizar tópico (Requiere autenticación)
DELETE /topicos/{id}: Eliminar tópico (Requiere rol ADMIN)



Documentación de API 📖
Accede a la documentación de Swagger:

URL: http://localhost:8080/swagger-ui.html


Seguridad 🔒
Autenticación basada en JWT
Roles de usuario (USER/ADMIN)
Endpoints protegidos

Migraciones de Base de Datos 🗄️
Migraciones de Base de Datos
Las migraciones se manejan con Flyway. Los scripts de migración se encuentran en:
src/main/resources/db/migration/

Contribuciones 🤝
Haz un fork del proyecto
Crea tu feature branch (git checkout -b feature/nueva-caracteristica)
Commit tus cambios (git commit -m 'Añadir nueva característica')
Push a la rama (git push origin feature/nueva-caracteristica)
Abre un Pull Request


Recursos Adicionales
Documentación Spring Boot
Guía JWT
Swagger OpenAPI
