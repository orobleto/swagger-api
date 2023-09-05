# Ejemplo de Documentación de API con Swagger

Este repositorio contiene un proyecto de Spring Boot que demuestra cómo documentar una API utilizando Swagger y OpenAPI. El proyecto incluye una API de ejemplo con endpoints para la autenticación de usuarios y un servicio de ping. La documentación de la API se genera utilizando la biblioteca Springdoc-OpenAPI.

## Inicio rápido

Estas instrucciones te ayudarán a configurar y ejecutar el proyecto localmente para pruebas y exploración.

### Requisitos previos

- Kit de Desarrollo Java (JDK) 17 o posterior
- Herramienta de construcción Gradle

### Ejecución de la Aplicación

1. Clona este repositorio en tu máquina local:

   ```bash
   git clone https://github.com/orobleto/swagger-api.git
   ```

2. Navega hasta el directorio del proyecto:

   ```bash
   cd swagger-api
   ```

3. Compila y ejecuta la aplicación usando Gradle:

   ```bash
   ./gradlew bootRun
   ```

   Este comando compilará el proyecto y ejecutará la aplicación Spring Boot. La aplicación se ejecutará en `http://localhost:8080` de forma predeterminada.

4. Accede a la documentación de Swagger UI:

   Abre un navegador web y ve a [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html) para ver la documentación interactiva de la API generada por Swagger.

## Documentación de la API

La documentación de la API proporciona información detallada sobre los endpoints disponibles, las estructuras de solicitud y respuesta, y ejemplos de muestra.

### Autenticación

#### POST /v1/auth/login

Permite a los usuarios iniciar sesión.

- **Request**: Información del usuario, incluyendo correo electrónico y contraseña.
- **Response**: JSON que contiene el token de acceso, tiempo de expiración y tipo de token.

Para obtener más detalles, consulta la documentación de Swagger [aquí](http://localhost:8080/swagger-ui.html#/Auth/login).

### Principal

#### GET /v1/main/ping

Se utiliza para verificar el estado del servicio.

- **Response**: Una respuesta simple en forma de cadena de texto.

Para obtener más detalles, consulta la documentación de Swagger [aquí](http://localhost:8080/swagger-ui.html#/Main/ping).

## Modelos de la API

Se utilizan los siguientes modelos en la API:

- `user-dto`: Información del usuario, incluyendo correo electrónico y contraseña.
- `error-message-dto`: Respuesta de error que contiene el código de error y el mensaje.
- `jwt-dto`: Respuesta del token JWT que contiene el token de acceso, tiempo de expiración y tipo de token.

Para obtener más detalles sobre los modelos, consulta la documentación de Swagger [aquí](http://localhost:8080/swagger-ui.html#/Models).

## Contacto

Si tienes alguna pregunta o necesitas ayuda adicional, no dudes en ponerte en contacto conmigo:

- Nombre: Ing. Octavio Robleto
- WEB: https://octaviorobleto.com
