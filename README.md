# Clínica Veterinaria

## Descripción
Este proyecto es una API REST sencilla para gestionar información de una clínica veterinaria, que permite realizar operaciones CRUD sobre las entidades **Dueño** y **Mascota**. La API está implementada utilizando **Spring Boot** y conecta con una base de datos MySQL.

El propósito principal de este proyecto es demostrar el uso de **Docker** para contenerizar tanto la aplicación como la base de datos, permitiendo una fácil implementación y ejecución en cualquier entorno.

## Requisitos
- **Estructura de la API**: Implementación de endpoints básicos para gestionar las entidades **Dueño** y **Mascota**.
- **Conexión a la base de datos**: Uso de MySQL para almacenar los datos.
- **Documentación de API**: Usar **Swagger** para describir los endpoints.

## Features

- **Add Owner**: Permite agregar un nuevo dueño de una mascota.
- **Add Pet**: Permite agregar una nueva mascota asociada a un dueño.
- **List Owners and Pets**: Permite listar los dueños y las mascotas registradas.
- **Update Owner/Pet**: Permite actualizar la información de un dueño o mascota.
- **Delete Owner/Pet**: Permite eliminar un dueño o una mascota.

## Tecnologías Usadas
- **Spring Boot**: Framework para construir aplicaciones Java.
- **MySQL**: Sistema de gestión de bases de datos.
- **Swagger**: Para la documentación de la API.
- **Docker**: Para contenerizar la aplicación y la base de datos.

## Instalación
Para instalar y configurar el proyecto, sigue estos pasos:
1. Clona este repositorio:
   ```bash
   git clone <url-del-repositorio>
   ```
2. Navega al directorio del proyecto:
    ```bash
    cd <nombre-del-directorio>
    ```
3. Instala las dependencias de Spring Boot:
    ```bash
    docker-compose up --build
    ```
Esto levantará los contenedores para la aplicación y la base de datos MySQL. La API estará disponible en **http://localhost:8080.**

## Uso
Puedes interactuar con la API utilizando herramientas como **Postman**. A continuación, se presentan algunas instrucciones básicas para realizar peticiones:

- **CRUD**: Utiliza las siguientes rutas para realizar operaciones CRUD sobre los dueños y mascotas:
  - `POST /duenio/create`: Crea un nuevo dueño.
  - `GET /duenio/all`: Obtiene todos los dueños.
  - `GET /duenio/{id}`: Obtiene un dueño.
  - `PUT /duenio/{id}`: Actualiza un dueño.
  - `DELETE /duenio/{id}`: Elimina un dueño.
  - `POST /mascota/create`: Crea una nueva mascota.
  - `GET /mascota/all`: Obtiene todas las mascotas.
  - `GET /mascota/{id}`: Obtiene una mascota.
  - `PUT /mascota/{id}`: Actualiza una mascota.
  - `DELETE /pets/{id}`: Elimina una mascota.
  
- **Documentacion Swagger**:Se puede ingresar a la documentación a traves de `/doc/swagger-ui/index.html`.

## Notes
Se debe tener instalado
- Java 17
- Maven v3.4.0
- MySQL
- Postman (opcional)

## Contribuciones
Este proyecto no acepta contribuciones.

## Licencia
Este proyecto está bajo la Licencia MIT. Consulta el archivo [LICENSE](LICENSE) para más detalles.