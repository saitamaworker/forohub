## <h1 align="center">🚀<strong>Bienvenido a Forohub API Challenge</strong>🚀</h1>

<br>
<!--About the challenge -->
<br>

    
<img src="https://user-images.githubusercontent.com/73097560/115834477-dbab4500-a447-11eb-908a-139a6edaec5c.gif"><br><br>
## 📋<b>DESCRIPCION DEL PROYECTO</b>
<br> 

👷‍♂️ ForoHub es una aplicación web desarrollada con Spring Boot que permite a los usuarios crear, consultar, actualizar y eliminar tópicos de discusión. La aplicación implementa autenticación JWT, control de acceso basado en roles y documentación de API con Swagger.
<br>
<!--CONVERTER FEATURES-->
<br>

<img src="https://user-images.githubusercontent.com/73097560/115834477-dbab4500-a447-11eb-908a-139a6edaec5c.gif"><br><br>
## ✨ <b>CARACTERISTICAS PRINCIPALES<b>
<br>

🔐 Autenticación y autorización con JWT

📝 Gestión de tópicos (CRUD)

🛡️ Control de acceso por roles

📊 Documentación de API con Swagger

💾 Persistencia de datos con MySQL

🔄 Migraciones de base de datos con Flyway
<br>
<!--STACK-->
<br>

<img src="https://user-images.githubusercontent.com/73097560/115834477-dbab4500-a447-11eb-908a-139a6edaec5c.gif"><br><br>
## 🔧 <b>TECNOLOGIAS UTILIZADAS<b>
<br>

👉 BACKEND:

:small_orange_diamond:Java 17+

:small_orange_diamond:Spring Boot 3.x

:small_orange_diamond:Spring Security

:small_orange_diamond:Spring Data JPA

👉 BASE DE DATOS:

:small_orange_diamond:MySQL 8.0

:small_orange_diamond:Flyway Migration

👉 AUTH:

:small_orange_diamond:JWT (JSON Web Tokens)

:small_orange_diamond:BCrypt Password Encoding

👉 DOCUMENTACION:

:small_orange_diamond:Swagger OpenAPI
<!--Requirements-->
<br>

<img src="https://user-images.githubusercontent.com/73097560/115834477-dbab4500-a447-11eb-908a-139a6edaec5c.gif"><br><br>
##  🔧 <b>REQUISITOS PREVIOS<b>
<br>

:small_orange_diamond:JDK 17 o superior

:small_orange_diamond:Maven

:small_orange_diamond:MySQL 8.0

:small_orange_diamond:IDE (IntelliJ IDEA, Eclipse, VS Code)
<br>
<!--How it works-->
<br>


<img src="https://user-images.githubusercontent.com/73097560/115834477-dbab4500-a447-11eb-908a-139a6edaec5c.gif"><br><br>
##  🚀 <b>CONFIGURACION DEL PROYECTO<b>
<br>

1. Clonar el Repositorio
git clone https://github.com/tu-usuario/forohub.git
cd forohub

2. Configurar Base de Datos
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
