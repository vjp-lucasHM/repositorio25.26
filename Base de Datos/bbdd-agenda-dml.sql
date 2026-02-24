-- -------------------------------
-- LUCAS HERRERA MORENO
-- 1 dam 25-26
-- BBDD
-- --------------------------------

CREATE DATABASE PERSONAS;
USE PERSONAS;

CREATE TABLE PERSONAS(
	DNI VARCHAR(9),
    COD_HOSPITAL INT,
    APELLIDOS VARCHAR(50),
    FUNCION VARCHAR(9),
    SALARIO DECIMAL(8,2),
    LOCALIDAD VARCHAR(9),
    FECHA_NAC DATE
);

insert into personas values ('12345678A',1,'García Hernández, Eladio','CONSERJE','1200.15','CACERES','1995/03/02'); 
insert into personas values ('87654321B',1,'Fuentes Bermejo, Carlos','DIRECTOR','2000.25','MERIDA','1995/02/12'); 
insert into personas values ('55544433A',2,'González Marín, Alicia','CONSERJE','1200.65','MERIDA','1998/04/10'); 
insert into personas values ('66655544C',1,'Castillo Montes, Pedro','MEDICO','1700.25','MERIDA','1999/02/02'); 
insert into personas values ('22233322T',2,'Tristán García, Ana','MEDICO','1900.35','MERIDA','1999/12/12'); 
insert into personas values ('55544411R',3,'Ruiz Hernández, Caridad','MEDICO','1900.45','CACERES','1995/05/12'); 
insert into personas values ('99988333S',3,'Serrano Díaz, Alejandro','DIRECTOR','2400.89','BADAJOZ','1996/07/22'); 
insert into personas values ('33222111M',4,'Mesa del Castillo, Juan','MEDICO','2200.55','CACERES','2000/01/12'); 
insert into personas values ('22233333M',2,'Martínez Molina, Andrés','MEDICO','1600.75','BADAJOZ','1995/08/20'); 
insert into personas values ('55544412J',4,'Jiménez Jiménez, Dolores','CONSERJE','1200.60','MERIDA','1997/12/15'); 
insert into personas values ('22233311M',4,'Martínez Molina, Gloria','MEDICO','1600.80','MERIDA','1995/11/15'); 

-- 21) Obtener el número total de personas.
SELECT COUNT(*) FROM PERSONAS;

-- 22) Obtener el número total de personas agrupadas por su función.
SELECT COUNT(*) FROM PERSONAS GROUP BY FUNCION;

-- 23) Obtener el número total de personas agrupadas por localidad.
SELECT COUNT(*) FROM PERSONAS GROUP BY LOCALIDAD;

-- 24) Obtener el número total de personas que trabajan en el hospital nº1.
SELECT COUNT(*) FROM PERSONAS WHERE COD_HOSPITAL='1';

-- 25) Obtener el salario medio de todas las personas.
SELECT AVG(SALARIO) FROM PERSONAS;

-- 26) Obtener el salario medio de todas las personas que trabajan en el hospital nº 2.
SELECT AVG(SALARIO) FROM PERSONAS WHERE COD_HOSPITAL='2';

-- 27) Obtener el salario más alto de las personas que son de MERIDA.
SELECT MAX(SALARIO) FROM PERSONAS WHERE LOCALIDAD='MERIDA';

-- 28) Obtener el salario MÁS BAJO de las personas que trabajan en el hospital nº 2.
SELECT MIN(SALARIO) FROM PERSONAS WHERE COD_HOSPITAL='2';

-- 29) Obtener el salario medio de todos los médicos.
SELECT AVG(SALARIO) FROM PERSONAS WHERE FUNCION='MEDICO';

-- 30) Obtener el número de poblaciones distintas que hay en la tabla.
SELECT COUNT(DISTINCT LOCALIDAD) FROM PERSONAS;