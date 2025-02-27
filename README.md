# Job Management API

**Descripción**: Este es el ejercicio práctico del pre-parcial.

Este proyecto es una API REST desarrollada con **Spring Boot** para la gestión de ofertas de empleo, postulaciones de candidatos y la información asociada a empresas y candidatos. Esta API permite a las empresas publicar ofertas de empleo y a los candidatos postularse a ellas. Además, incluye un sistema de gestión de empresas y candidatos, con todas las funcionalidades CRUD necesarias.

## Características

- **Gestión de Empresas**: Crear, leer, actualizar y eliminar empresas.
- **Gestión de Ofertas de Empleo**: Publicar ofertas de empleo, ver las ofertas existentes y actualizar o eliminar ofertas.
- **Gestión de Candidatos**: Crear candidatos, ver candidatos existentes y actualizar o eliminar candidatos.
- **Postulaciones**: Los candidatos pueden postularse a ofertas de empleo. El estado de la postulación puede ser actualizado.

## Tecnologías Utilizadas

- **Spring Boot**: Framework principal para el desarrollo de la API.
- **JPA/Hibernate**: Para la persistencia de datos en la base de datos.
- **MySQL**: Base de datos utilizada para almacenar la información de empresas, ofertas, candidatos y postulaciones.
- **Postman**: Herramienta utilizada para probar los endpoints de la API.

## Requisitos

- **Java 17** (o superior)
- **MySQL**: Debes tener MySQL instalado y configurado.
- **Maven**: Para la construcción del proyecto.

## Configuración del Proyecto

### 1. Clonación del Repositorio

Para comenzar, clona este repositorio a tu máquina local:

```bash
git clone https://github.com/tu-usuario/job-management-api.git
```
## Uso del Proyecto

### 1. Importar el Archivo JSON en Postman

Para poder consumir el API:

```bash
Parcial.ejercicio.postman.json
```

### 2. Importar el la base de datos en MySQL
```bash
job_management_db.sql
```

### 3. Ejecutar el proyecto con SpringBoot
### 4. Hacer uso de Postman
