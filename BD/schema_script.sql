SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema awiki
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `awiki` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `awiki` ;

-- -----------------------------------------------------
-- Table `awiki`.`usuarios`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `awiki`.`usuarios` (
  `idusuarios` BIGINT NOT NULL,
  `nombre` VARCHAR(31) NOT NULL,
  `email` VARCHAR(127) NOT NULL,
  `nombre_usuario` VARCHAR(45) NOT NULL,
  `contraseña` VARCHAR(31) NOT NULL,
  `imagen_perfil` VARCHAR(255) NULL,
  `descripcion_perfil` VARCHAR(255) NULL,
  `es_perfil_empresa` TINYINT NOT NULL,
  PRIMARY KEY (`idusuarios`),
  UNIQUE INDEX `idusuarios_UNIQUE` (`idusuarios` ASC) VISIBLE,
  UNIQUE INDEX `email_UNIQUE` (`email` ASC) VISIBLE,
  UNIQUE INDEX `nombre_usuario_UNIQUE` (`nombre_usuario` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `awiki`.`listings`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `awiki`.`listings` (
  `idlistings` BIGINT NOT NULL,
  `nombre` VARCHAR(63) NOT NULL,
  `descripcion` VARCHAR(255) NOT NULL,
  `rating` DOUBLE NOT NULL,
  `categoria` VARCHAR(31) NOT NULL,
  `direccion` VARCHAR(63) NOT NULL,
  `estado` VARCHAR(31) NOT NULL,
  `municipio` VARCHAR(31) NOT NULL,
  `codigo_postal` INT NOT NULL,
  `colonia` VARCHAR(63) NOT NULL,
  PRIMARY KEY (`idlistings`),
  UNIQUE INDEX `idlistings_UNIQUE` (`idlistings` ASC) VISIBLE)
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `awiki`.`publicaciones`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `awiki`.`publicaciones` (
  `idpublicaciones` INT NOT NULL AUTO_INCREMENT,
  `descripcion` VARCHAR(255) NOT NULL,
  `imagen` VARCHAR(255) NULL,
  PRIMARY KEY (`idpublicaciones`),
  UNIQUE INDEX `idpublicacion_UNIQUE` (`idpublicaciones` ASC) VISIBLE)
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `awiki`.`resenas`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `awiki`.`resenas` (
  `idresenas` BIGINT NOT NULL,
  `descripcion` VARCHAR(255) NOT NULL,
  `calificacion` DOUBLE NOT NULL,
  PRIMARY KEY (`idresenas`),
  UNIQUE INDEX `idreseñas_UNIQUE` (`idresenas` ASC) VISIBLE)
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `awiki`.`imagenes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `awiki`.`imagenes` (
  `idimagenes` INT NOT NULL AUTO_INCREMENT,
  `url` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`idimagenes`),
  UNIQUE INDEX `idimagenes_UNIQUE` (`idimagenes` ASC) VISIBLE)
ENGINE = InnoDB;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
