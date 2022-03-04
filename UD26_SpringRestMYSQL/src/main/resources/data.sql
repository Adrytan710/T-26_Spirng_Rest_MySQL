Create database investigadores;
USE investigadores;
DROP table IF EXISTS reserva;
DROP table IF EXISTS investigadores;
DROP table IF EXISTS equipos;
DROP table IF EXISTS facultad;

create table facultad(
    id int auto_increment,
    nombre nvarchar(100),
    PRIMARY KEY (id)
);

create table investigadores(
    id int auto_increment,
    dni varchar(9),
    nomapels nvarchar(255),
    facultad int,
    PRIMARY KEY (id, dni),
    KEY (dni),
    KEY facultadInv_idx (facultad),
    CONSTRAINT facultadInv FOREIGN KEY (facultad) REFERENCES facultad (id)
);

create table equipos(
    id int auto_increment,
    numserie char(4),
    nombre nvarchar(100),
    facultad int,
    PRIMARY KEY (id, numserie),
	KEY (numserie),
    KEY facultadEq(facultad),
    CONSTRAINT facultadEq FOREIGN KEY (facultad) REFERENCES facultad (id)
);

create table reserva(
    id int auto_increment,
    investigador varchar(9),
    equipo char(4),
    comienzo datetime,
    fin datetime,
    PRIMARY KEY (id),
    KEY equipo(equipo),
    CONSTRAINT equipo FOREIGN KEY (equipo) REFERENCES equipos (numserie),
    KEY investigador (investigador),
    CONSTRAINT investigador FOREIGN KEY (investigador) REFERENCES investigadores (dni)
);

INSERT INTO facultad(nombre) 
VALUES
("Víctor"),
("Samu"),
("Albert"),
("Adri"),
("Marcos");