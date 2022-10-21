-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 09-10-2022 a las 20:24:22
-- Versión del servidor: 10.4.25-MariaDB
-- Versión de PHP: 7.4.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `consultorio_medico`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cita`
--

CREATE TABLE `cita` (
  `Cita_ID` int(11) NOT NULL,
  `Paciente_ID` int(11) NOT NULL,
  `Cita_Activa` tinyint(1) NOT NULL,
  `Cita_Tipoconsulta` varchar(25) NOT NULL,
  `Cita_Hora` varchar(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `cita`
--

INSERT INTO `cita` (`Cita_ID`, `Paciente_ID`, `Cita_Activa`, `Cita_Tipoconsulta`, `Cita_Hora`) VALUES
(3, 1234567, 1, 'Medicina general', '10:30'),
(4, 1003558205, 0, 'Odontologia', '1:30'),
(5, 1003558205, 1, 'Medicina General', '4:30'),
(6, 123456, 1, 'Pediatria', '8:30');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `medicamento`
--

CREATE TABLE `medicamento` (
  `Medi_ID` int(11) NOT NULL,
  `Paciente_ID` int(11) NOT NULL,
  `Medi_Descripcion` varchar(90) NOT NULL,
  `Medi_Cantidadrecetada` int(11) NOT NULL,
  `Medi_Ubicacion` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `medicamento`
--

INSERT INTO `medicamento` (`Medi_ID`, `Paciente_ID`, `Medi_Descripcion`, `Medi_Cantidadrecetada`, `Medi_Ubicacion`) VALUES
(1, 123456, 'Acetaminofen', 15, 'Drogueria distrital'),
(2, 1234567, 'Paracetamol', 45, 'Drogueria carmen 1'),
(3, 1003558205, 'Timonol', 160, 'Drogueria distrital');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `paciente`
--

CREATE TABLE `paciente` (
  `Paci_ID` int(90) NOT NULL,
  `Paci_Nombre` varchar(70) NOT NULL,
  `Paci_Sexo` varchar(9) NOT NULL,
  `Paci_Direccion` varchar(90) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `paciente`
--

INSERT INTO `paciente` (`Paci_ID`, `Paci_Nombre`, `Paci_Sexo`, `Paci_Direccion`) VALUES
(123456, 'Daniela Ortiz', 'Femenino', 'Chia'),
(1234567, 'Luisa Casablanca', 'Femenino', 'Chia'),
(16543248, 'Camilo Contreras', 'Masculino', 'Fusagasuga'),
(1003558205, 'Daniel ramirez', 'Masculino', 'Bogota D.C');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cita`
--
ALTER TABLE `cita`
  ADD PRIMARY KEY (`Cita_ID`),
  ADD KEY `FK_PACIID_PACIENTE` (`Paciente_ID`);

--
-- Indices de la tabla `medicamento`
--
ALTER TABLE `medicamento`
  ADD PRIMARY KEY (`Medi_ID`),
  ADD KEY `FK_IDPACIENTE_PACIENTE` (`Paciente_ID`);

--
-- Indices de la tabla `paciente`
--
ALTER TABLE `paciente`
  ADD PRIMARY KEY (`Paci_ID`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cita`
--
ALTER TABLE `cita`
  MODIFY `Cita_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `medicamento`
--
ALTER TABLE `medicamento`
  MODIFY `Medi_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `cita`
--
ALTER TABLE `cita`
  ADD CONSTRAINT `FK_PACIID_PACIENTE` FOREIGN KEY (`Paciente_ID`) REFERENCES `paciente` (`Paci_ID`);

--
-- Filtros para la tabla `medicamento`
--
ALTER TABLE `medicamento`
  ADD CONSTRAINT `FK_IDPACIENTE_PACIENTE` FOREIGN KEY (`Paciente_ID`) REFERENCES `paciente` (`Paci_ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
