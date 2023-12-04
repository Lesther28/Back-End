DROP DATABASE restaurante;

CREATE DATABASE restaurante;
USE restaurante;

CREATE TABLE cliente (
id_cliente int AUTO_INCREMENT PRIMARY KEY, 
nombre varchar(50),
apellido varchar(50)
);

CREATE TABLE ingrediente (
    id_ingrediente integer AUTO_INCREMENT PRIMARY KEY,
    nombre varchar(50),
    cantidadStock int,
    unidadMedida varchar(50),
    url_imagen varchar(255)
);

CREATE TABLE tipoComida (
id_tipo_comida integer AUTO_INCREMENT PRIMARY KEY,
    descripcion varchar(50),
id_comida int, 
 CONSTRAINT fk_tipoComida_comida FOREIGN KEY (id_comida) REFERENCES comida(id_comida),

);

CREATE TABLE comida (
id_comida integer AUTO_INCREMENT PRIMARY KEY,
    nombre varchar(50),
    precio int
    url_imagen varchar(255) 
    

CREATE TABLE comidaIngre (
idComidaIngre integer AUTO_INCREMENT PRIMARY KEY,
    id_comida int,
    id_ingrediente int, 
    cantidad int,
    CONSTRAINT fk_comidaIngre_ingrediente FOREIGN KEY (id_ingrediente) REFERENCES ingrediente (id_ingrediente),
    CONSTRAINT fk_comidaIngre_comida FOREIGN KEY (id_comida) REFERENCES comida (id_comida)
);

CREATE TABLE orden (
    id_orden integer AUTO_INCREMENT PRIMARY KEY,
    mesa int,
    descripcion varchar(200),
    id_cliente int, 
    CONSTRAINT fk_orden_cliente FOREIGN KEY (id_cliente)REFERENCES cliente (id_cliente)
);

