# Foro Hub

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
