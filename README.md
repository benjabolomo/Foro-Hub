# Foro Hub API REST

Foro Hub es un proyecto de API RESTful que gestiona los tópicos de un foro. Está construido con Java, Spring Boot, Spring Security, MySQL y Hibernate. El proyecto permite crear, leer, actualizar y eliminar tópicos en un foro, con un sistema de autenticación básico para los usuarios.

## Tecnologías utilizadas

- **Java 17**: Lenguaje de programación.
- **Spring Boot 3.4.1**: Framework para la construcción de aplicaciones Java.
- **Spring Security**: Gestión de seguridad y autenticación de usuarios.
- **Spring Data JPA**: Acceso a datos con JPA y Hibernate.
- **MySQL**: Base de datos.
- **Hibernate Validator**: Validación de datos en el modelo.
- **Maven**: Herramienta de construcción y gestión de dependencias.

## Características

- **Gestión de tópicos**:
  - Crear un nuevo tópico.
  - Listar todos los tópicos.
  - Ver detalles de un tópico específico.
  - Actualizar un tópico.
  - Eliminar un tópico.
  
- **Autenticación y seguridad**:
  - Sistema básico de autenticación de usuarios con Spring Security.
  - Validación de datos de entrada utilizando Hibernate Validator.

## Instrucciones de instalación

### Requisitos

- **Java 17**: Necesario para ejecutar el proyecto.
- **MySQL**: Debes tener MySQL instalado y configurado para almacenar los datos del foro.

### Pasos para configurar y ejecutar el proyecto

1. Clona este repositorio en tu máquina local:
   ```bash
   git clone https://github.com/tu_usuario/forohub.git

2.Asegúrate de tener MySQL instalado y crea una base de datos llamada forohub:

sql
Copiar
Editar
CREATE DATABASE forohub;
Configura las credenciales de la base de datos en el archivo application.properties:

properties
Copiar
Editar
spring.datasource.url=jdbc:mysql://localhost:3306/forohub
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
Abre el proyecto en IntelliJ IDEA y asegúrate de tener las dependencias necesarias instaladas.

Ejecuta la aplicación con el comando:

bash
Copiar
Editar
./mvnw spring-boot:run
La API estará corriendo en http://localhost:8080.

Endpoints
1. Crear un tópico
POST /api/topics
Cuerpo: { "title": "Título del tópico", "content": "Contenido del tópico" }
2. Listar todos los tópicos
GET /api/topics
3. Ver un tópico por ID
GET /api/topics/{id}
4. Actualizar un tópico
PUT /api/topics/{id}
Cuerpo: { "title": "Nuevo título", "content": "Nuevo contenido" }
5. Eliminar un tópico
DELETE /api/topics/{id}
Contribuir
Si deseas contribuir al proyecto, sigue estos pasos:

Haz un fork del repositorio.
Crea una rama con tu nueva funcionalidad: git checkout -b nueva-funcionalidad.
Realiza tus cambios y haz un commit: git commit -am 'Agrega nueva funcionalidad'.
Sube tus cambios a tu fork: git push origin nueva-funcionalidad.
Abre un pull request con la descripción de lo que has cambiado.
Licencia
Este proyecto está bajo la Licencia MIT. Puedes ver más detalles en el archivo LICENSE.   
