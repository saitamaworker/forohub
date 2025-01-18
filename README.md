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

1. **Clonar el Repositorio**

   ```bash
   git clone https://github.com/tu-usuario/forohub.git
   cd forohub

2. **Configurar Base de Datos**

    ```SQL
   CREATE DATABASE forohub;

3. **Configurar credenciales en application.properties**

   ```PROPERTIES
   spring.datasource.url=jdbc:mysql://localhost/forohub
   spring.datasource.username=tu_usuario
   spring.datasource.password=tu_contraseña

4. **Compilar y ejecutar**

   ```bash
   click en run.
<br>


<img src="https://user-images.githubusercontent.com/73097560/115834477-dbab4500-a447-11eb-908a-139a6edaec5c.gif"><br><br>
##  🌐 <b>ENDPOINTS PRINCIPALES<b>
<br>
   
↕️Autenticación

:small_orange_diamond:POST /login: Iniciar sesión y obtener token JWT

↕️Tópicos

:small_orange_diamond:POST /topicos: Crear nuevo tópico (Requiere autenticación)

:small_orange_diamond:GET /topicos: Listar tópicos (Requiere autenticación)

:small_orange_diamond:PUT /topicos/{id}: Actualizar tópico (Requiere autenticación)

:small_orange_diamond:DELETE /topicos/{id}: Eliminar tópico (Requiere rol ADMIN)
<br>


<img src="https://user-images.githubusercontent.com/73097560/115834477-dbab4500-a447-11eb-908a-139a6edaec5c.gif"><br><br>
##  📖 <b>DOCUMENTACION DE API<b>
<br>

🏗️ Accede a la documentación de Swagger:

 URL
    http://localhost:8080/swagger-ui.html
<br>


<img src="https://user-images.githubusercontent.com/73097560/115834477-dbab4500-a447-11eb-908a-139a6edaec5c.gif"><br><br>
##  🔒 <b>SEGURIDAD<b>
<br>

:small_orange_diamond:Autenticación basada en JWT

:small_orange_diamond:Roles de usuario (USER/ADMIN)

:small_orange_diamond:Endpoints protegidos
<br>


<img src="https://user-images.githubusercontent.com/73097560/115834477-dbab4500-a447-11eb-908a-139a6edaec5c.gif"><br><br>
##  🗄️ <b>MIGRACIONES DE BASE DE DATOS<b>
<br>

👉 Las migraciones se manejan con Flyway. 

:small_orange_diamond:src/main/resources/db/migration/
<br>


<img src="https://user-images.githubusercontent.com/73097560/115834477-dbab4500-a447-11eb-908a-139a6edaec5c.gif"><br><br>
##  🤝 <b>CONTRIBUCIONES<b>
<br>

:small_orange_diamond:Haz un fork del proyecto

:small_orange_diamond:Crea tu feature branch (git checkout -b feature/nueva-caracteristica)

:small_orange_diamond:Commit tus cambios (git commit -m 'Añadir nueva característica')

:small_orange_diamond:Push a la rama (git push origin feature/nueva-caracteristica)

:small_orange_diamond:Abre un Pull Request
<br>


<img src="https://user-images.githubusercontent.com/73097560/115834477-dbab4500-a447-11eb-908a-139a6edaec5c.gif"><br><br>
##  🤝 <b>RECURSOS ADICIONALES<b>
<br>

:small_orange_diamond:[Documentación Spring Boot](https://docs.spring.io/spring-boot/index.html)

:small_orange_diamond:[Guía JWT](https://jwt.io/)

:small_orange_diamond:[Swagger OpenAPI](https://swagger.io/)
