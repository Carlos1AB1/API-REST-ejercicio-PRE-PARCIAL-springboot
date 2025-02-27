-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 27-02-2025 a las 21:01:48
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `job_management_db`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `candidato`
--

CREATE TABLE `candidato` (
  `id` bigint(20) NOT NULL,
  `apellido` varchar(255) DEFAULT NULL,
  `correo_electronico` varchar(255) DEFAULT NULL,
  `cv` varchar(255) DEFAULT NULL,
  `educacion` varchar(255) DEFAULT NULL,
  `experiencia_laboral` varchar(255) DEFAULT NULL,
  `fecha_registro` date DEFAULT NULL,
  `habilidades` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `telefono` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `candidato`
--

INSERT INTO `candidato` (`id`, `apellido`, `correo_electronico`, `cv`, `educacion`, `experiencia_laboral`, `fecha_registro`, `habilidades`, `nombre`, `telefono`) VALUES
(1, 'Pérez', 'juan.perez@email.com', 'http://example.com/cv/juan_perez.pdf', 'Ingeniería en Sistemas Computacionales', '5 años como desarrollador backend', '2025-02-26', 'Java, Spring Boot, SQL', 'Juan', '555-1234567');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empresa`
--

CREATE TABLE `empresa` (
  `id` bigint(20) NOT NULL,
  `correo_contacto` varchar(255) DEFAULT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `fecha_registro` date DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `sector` varchar(255) DEFAULT NULL,
  `ubicacion` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `empresa`
--

INSERT INTO `empresa` (`id`, `correo_contacto`, `descripcion`, `fecha_registro`, `nombre`, `sector`, `ubicacion`) VALUES
(1, 'contacto@techinnovations.com', 'Innovación tecnológica en desarrollo de software.', '2025-02-26', 'Tech Innovations', 'Tecnología', 'Ciudad de México');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `oferta`
--

CREATE TABLE `oferta` (
  `id` bigint(20) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `estado` varchar(255) DEFAULT NULL,
  `fecha_expiracion` date DEFAULT NULL,
  `fecha_publicacion` date DEFAULT NULL,
  `modalidad` varchar(255) DEFAULT NULL,
  `requisitos` varchar(255) DEFAULT NULL,
  `salario_max` double NOT NULL,
  `salario_min` double NOT NULL,
  `tipo_jornada` varchar(255) DEFAULT NULL,
  `titulo` varchar(255) DEFAULT NULL,
  `ubicacion` varchar(255) DEFAULT NULL,
  `empresa_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `oferta`
--

INSERT INTO `oferta` (`id`, `descripcion`, `estado`, `fecha_expiracion`, `fecha_publicacion`, `modalidad`, `requisitos`, `salario_max`, `salario_min`, `tipo_jornada`, `titulo`, `ubicacion`, `empresa_id`) VALUES
(2, 'Se busca desarrollador backend con experiencia en Spring Boot y bases de datos relacionales.', 'Activa', '2025-03-26', '2025-02-26', 'Remoto', 'Experiencia con Java, Spring Boot, SQL.', 60000, 40000, 'Tiempo completo', 'Desarrollador Backend', 'Ciudad de México', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `postulacion`
--

CREATE TABLE `postulacion` (
  `id` bigint(20) NOT NULL,
  `comentarios` varchar(255) DEFAULT NULL,
  `estado` varchar(255) DEFAULT NULL,
  `fecha_postulacion` date DEFAULT NULL,
  `candidato_id` bigint(20) DEFAULT NULL,
  `oferta_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `postulacion`
--

INSERT INTO `postulacion` (`id`, `comentarios`, `estado`, `fecha_postulacion`, `candidato_id`, `oferta_id`) VALUES
(1, 'Tengo una gran experiencia trabajando con Java y Spring, creo que puedo aportar mucho a esta posición.', 'En revisión', '2025-02-28', 1, 2);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `candidato`
--
ALTER TABLE `candidato`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `empresa`
--
ALTER TABLE `empresa`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `oferta`
--
ALTER TABLE `oferta`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKofyhahjaqb65slqdrr45g7luq` (`empresa_id`);

--
-- Indices de la tabla `postulacion`
--
ALTER TABLE `postulacion`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKn854gdextut9ovxyaug230aom` (`candidato_id`),
  ADD KEY `FKjh41b3wa93k0m8b5gisebfdh5` (`oferta_id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `candidato`
--
ALTER TABLE `candidato`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `empresa`
--
ALTER TABLE `empresa`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `oferta`
--
ALTER TABLE `oferta`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `postulacion`
--
ALTER TABLE `postulacion`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `oferta`
--
ALTER TABLE `oferta`
  ADD CONSTRAINT `FKofyhahjaqb65slqdrr45g7luq` FOREIGN KEY (`empresa_id`) REFERENCES `empresa` (`id`);

--
-- Filtros para la tabla `postulacion`
--
ALTER TABLE `postulacion`
  ADD CONSTRAINT `FKjh41b3wa93k0m8b5gisebfdh5` FOREIGN KEY (`oferta_id`) REFERENCES `oferta` (`id`),
  ADD CONSTRAINT `FKn854gdextut9ovxyaug230aom` FOREIGN KEY (`candidato_id`) REFERENCES `candidato` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
