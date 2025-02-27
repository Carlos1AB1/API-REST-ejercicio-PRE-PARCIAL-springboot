CREATE DATABASE IF NOT EXISTS job_management_db;

USE job_management_db;

CREATE TABLE IF NOT EXISTS empresa (
                                       id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                       nombre VARCHAR(255),
    descripcion TEXT,
    sector VARCHAR(255),
    ubicacion VARCHAR(255),
    correo_contacto VARCHAR(255),
    fecha_registro DATE
    );

CREATE TABLE IF NOT EXISTS oferta (
                                      id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                      titulo VARCHAR(255),
    descripcion TEXT,
    salario_min DECIMAL(10, 2),
    salario_max DECIMAL(10, 2),
    requisitos TEXT,
    tipo_jornada VARCHAR(50),
    modalidad VARCHAR(50),
    ubicacion VARCHAR(255),
    fecha_publicacion DATE,
    fecha_expiracion DATE,
    estado VARCHAR(50),
    empresa_id BIGINT,
    FOREIGN KEY (empresa_id) REFERENCES empresa(id)
    );

CREATE TABLE IF NOT EXISTS candidato (
                                         id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                         nombre VARCHAR(255),
    apellido VARCHAR(255),
    correo_electronico VARCHAR(255),
    telefono VARCHAR(50),
    cv TEXT,
    habilidades TEXT,
    experiencia_laboral TEXT,
    educacion TEXT,
    fecha_registro DATE
    );

CREATE TABLE IF NOT EXISTS postulacion (
                                           id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                           candidato_id BIGINT,
                                           oferta_id BIGINT,
                                           fecha_postulacion DATE,
                                           estado VARCHAR(50),
    comentarios TEXT,
    FOREIGN KEY (candidato_id) REFERENCES candidato(id),
    FOREIGN KEY (oferta_id) REFERENCES oferta(id)
    );
