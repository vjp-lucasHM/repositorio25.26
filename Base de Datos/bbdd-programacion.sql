-- ---------------------
-- LUCAS HERRERA MORENO
-- BBDD PROGRAMACION
-- 25-26
-- ---------------------

CREATE DATABASE PROGRAMACION;
USE PROGRAMACION;

DROP DATABASE PROGRAMACION;

CREATE TABLE FABRICANTE(
	ID_FAB INT PRIMARY KEY,
    NOMBRE VARCHAR(50),
    PAIS VARCHAR(30)
);

CREATE TABLE COMERCIO(
	CIF INT PRIMARY KEY,
    NOMBRE VARCHAR(50),
    CIUDAD VARCHAR(50)
);

CREATE TABLE CLIENTE(
	DNI INT PRIMARY KEY,
    NOMBRE VARCHAR(50),
    EDAD INT
);

CREATE TABLE PROGRAMA(
	CODIGO INT PRIMARY KEY,
    NOMBRE VARCHAR(50),
    VERSION VARCHAR(50)
);

CREATE TABLE DESARROLLA(
	ID_FAB INT,
    CODIGO INT
);

CREATE TABLE DISTRIBUYE(
	CIF INT,
    CODIGO INT,
    CANTIDAD INT
);

CREATE TABLE REGISTRA(
	CIF INT,
    DNI INT,
    CODIGO INT,
    MEDIO VARCHAR(20)
);

-- DESARROLLA
ALTER TABLE DESARROLLA ADD CONSTRAINT PRIMARY KEY(ID_FAB,CODIGO);

ALTER TABLE DESARROLLA ADD CONSTRAINT FOREIGN KEY(ID_FAB) REFERENCES FABRICANTE(ID_FAB) ON UPDATE CASCADE ON DELETE CASCADE;
ALTER TABLE DESARROLLA ADD CONSTRAINT FOREIGN KEY(CODIGO) REFERENCES PROGRAMA(CODIGO) ON UPDATE CASCADE ON DELETE CASCADE;

-- DISTRIBUYE
ALTER TABLE DISTRIBUYE ADD CONSTRAINT PRIMARY KEY(CIF,CODIGO);

ALTER TABLE DISTRIBUYE ADD CONSTRAINT FOREIGN KEY(CIF) REFERENCES COMERCIO(CIF) ON UPDATE CASCADE ON DELETE CASCADE;
ALTER TABLE DISTRIBUYE ADD CONSTRAINT FOREIGN KEY(CODIGO) REFERENCES PROGRAMA(CODIGO) ON UPDATE CASCADE ON DELETE CASCADE;

-- REGISTRA
ALTER TABLE REGISTRA ADD CONSTRAINT PRIMARY KEY(CIF,DNI,CODIGO);

ALTER TABLE REGISTRA ADD CONSTRAINT FOREIGN KEY(CIF) REFERENCES COMERCIO(CIF) ON UPDATE CASCADE ON DELETE CASCADE;
ALTER TABLE REGISTRA ADD CONSTRAINT FOREIGN KEY(DNI) REFERENCES CLIENTE(DNI) ON UPDATE CASCADE ON DELETE CASCADE;
ALTER TABLE REGISTRA ADD CONSTRAINT FOREIGN KEY(CODIGO) REFERENCES PROGRAMA(CODIGO) ON UPDATE CASCADE ON DELETE CASCADE;

-- CARGA DE DATOS
INSERT INTO fabricante VALUES (1,'Oracle','Estados Unidos');
INSERT INTO fabricante VALUES (2,'Microsoft','Estados Unidos');
INSERT INTO fabricante VALUES (3,'IBM','Estados Unidos');
INSERT INTO fabricante VALUES (4,'Dinamic','España');
INSERT INTO fabricante VALUES (5,'Borland','Estados Unidos');
INSERT INTO fabricante VALUES (6,'Symantec','Estados Unidos');

INSERT INTO programa VALUES (1,'Application Server','9i');
INSERT INTO programa VALUES (2,'Oracle Database','8i');
INSERT INTO programa VALUES (3,'Database','9i');
INSERT INTO programa VALUES (4,'Database','10g');
INSERT INTO programa VALUES (5,'Developer','6i');
INSERT INTO programa VALUES (6,'Access','97');
INSERT INTO programa VALUES (7,'Access','2000');
INSERT INTO programa VALUES (8,'Access','XP');
INSERT INTO programa VALUES (9,'Windows','98');
INSERT INTO programa VALUES (10,'Windows','XP Professional');
INSERT INTO programa VALUES (11,'Windows','XP Home Edition');
INSERT INTO programa VALUES (12,'Windows','2003 Server');
INSERT INTO programa VALUES (13,'Norton Internet Security','2004');
INSERT INTO programa VALUES (14,'Freddy Hardest',NULL);
INSERT INTO programa VALUES (15,'Paradox','2');
INSERT INTO programa VALUES (16,'C++ Builder','5.5');
INSERT INTO programa VALUES (17,'DB/2','2.0');
INSERT INTO programa VALUES (18,'OS/2','1.0');
INSERT INTO programa VALUES (19,'JBuilder','X');
INSERT INTO programa VALUES (20,'La prisión','1.0');

INSERT INTO comercio VALUES (1,'El Corte Inglés','Sevilla');
INSERT INTO comercio VALUES (2,'El Corte Inglés','Madrid');
INSERT INTO comercio VALUES (3,'Jump','Valencia');
INSERT INTO comercio VALUES (4,'Centro Mail','Sevilla');
INSERT INTO comercio VALUES (5,'FNAC','Barcelona');

INSERT INTO cliente VALUES (1,'Pepe Pérez',45);
INSERT INTO cliente VALUES (2,'Juan González',45);
INSERT INTO cliente VALUES (3,'María Gómez',33);
INSERT INTO cliente VALUES (4,'Javier Casado',18);
INSERT INTO cliente VALUES (5,'Nuria Sánchez',29);
INSERT INTO cliente VALUES (6,'Antonio Navarro',58);

INSERT INTO desarrolla VALUES (1,1);
INSERT INTO desarrolla VALUES (1,2);
INSERT INTO desarrolla VALUES (1,3);
INSERT INTO desarrolla VALUES (1,4);
INSERT INTO desarrolla VALUES (1,5);
INSERT INTO desarrolla VALUES (2,6);
INSERT INTO desarrolla VALUES (2,7);
INSERT INTO desarrolla VALUES (2,8);
INSERT INTO desarrolla VALUES (2,9);
INSERT INTO desarrolla VALUES (2,10);
INSERT INTO desarrolla VALUES (2,11);
INSERT INTO desarrolla VALUES (2,12);
INSERT INTO desarrolla VALUES (6,13);
INSERT INTO desarrolla VALUES (4,14);
INSERT INTO desarrolla VALUES (5,15);
INSERT INTO desarrolla VALUES (5,16);
INSERT INTO desarrolla VALUES (3,17);
INSERT INTO desarrolla VALUES (3,18);
INSERT INTO desarrolla VALUES (5,19);
INSERT INTO desarrolla VALUES (4,20);

INSERT INTO distribuye VALUES (1,1,10);
INSERT INTO distribuye VALUES (1,2,11);
INSERT INTO distribuye VALUES (1,6,5);
INSERT INTO distribuye VALUES (1,7,3);
INSERT INTO distribuye VALUES (1,10,5);
INSERT INTO distribuye VALUES (1,13,7);
INSERT INTO distribuye VALUES (2,1,6);
INSERT INTO distribuye VALUES (2,2,6);
INSERT INTO distribuye VALUES (2,6,4);
INSERT INTO distribuye VALUES (2,7,7);
INSERT INTO distribuye VALUES (3,10,8);
INSERT INTO distribuye VALUES (3,13,5);
INSERT INTO distribuye VALUES (4,14,3);
INSERT INTO distribuye VALUES (4,20,6);
INSERT INTO distribuye VALUES (5,15,8);
INSERT INTO distribuye VALUES (5,16,2);
INSERT INTO distribuye VALUES (5,17,3);
INSERT INTO distribuye VALUES (5,19,6);

INSERT INTO distribuye VALUES (5,8,8);

INSERT INTO registra VALUES (1,1,1,'Internet');
INSERT INTO registra VALUES (1,3,4,'Tarjeta postal');
INSERT INTO registra VALUES (4,2,10,'Teléfono');
INSERT INTO registra VALUES (4,1,10,'Tarjeta postal');
INSERT INTO registra VALUES (5,2,12,'Internet');
INSERT INTO registra VALUES (2,4,15,'Internet');

-- -- CONSULTAS
-- 1. Averigua el DNI de todos los clientes.
SELECT DNI FROM CLIENTE;

-- 2. Consulta todos los datos de todos los programas.
SELECT * FROM PROGRAMA;

-- 3. Obtén un listado con los nombres de todos los programas.
SELECT NOMBRE FROM PROGRAMA;

-- 4. Genera una lista con todos los comercios.
SELECT * FROM COMERCIO;

-- 5. Genera una lista de las ciudades con establecimientos donde se venden programas, sin que aparezcan valores duplicados (utiliza DISTINCT).
SELECT DISTINCT CIUDAD FROM COMERCIO;

-- 6. Obtén una lista con los nombres de programas, sin que aparezcan valores duplicados (utiliza DISTINCT).
SELECT DISTINCT NOMBRE FROM PROGRAMA;

-- 7. ¿Cuáles son los programas cuyo código es inferior o igual a 10?
SELECT * FROM PROGRAMA WHERE CODIGO<=10;

-- 8. ¿Cuál es el programa cuyo código es 11?
SELECT * FROM PROGRAMA WHERE CODIGO=11;

-- 9. ¿Qué fabricantes son de Estados Unidos?
SELECT * FROM FABRICANTE WHERE PAIS="Estados Unidos";

-- 10. ¿Cuáles son los fabricantes no españoles? Utilizar el operador IN.
SELECT * FROM FABRICANTE WHERE PAIS NOT IN ("España");

-- 11. Obtén un listado con los códigos de las distintas versiones de Windows.
SELECT VERSION FROM PROGRAMA WHERE NOMBRE="Windows";

-- 12. ¿Qué otros comercios hay, además de El Corte Inglés? (NO DEBE SALIR EL Corte Inglés).
SELECT * FROM COMERCIO WHERE NOMBRE NOT IN ("Corte Inglés");

-- 13. Genera una lista con los códigos de las distintas versiones de Windows y Access.
SELECT NOMBRE,VERSION FROM PROGRAMA WHERE NOMBRE IN ("Windows","Access");

-- 14. Obtén un listado que incluya los nombres de los clientes de edades comprendidas entre 10 y 25 y de los mayores de 50 años. Da una solución con BETWEEN y otra sin BETWEEN.2
SELECT NOMBRE,EDAD FROM CLIENTE WHERE EDAD BETWEEN 10 AND 25 OR EDAD>50;
SELECT NOMBRE,EDAD FROM CLIENTE WHERE EDAD>10 AND EDAD<25 OR EDAD>50;

-- 15. Saca un listado con los comercios de Sevilla y Madrid. No se admiten valores duplicados.
SELECT DISTINCT NOMBRE FROM COMERCIO WHERE CIUDAD IN ("Sevilla","Madrid");

-- 16. ¿Qué clientes terminan su nombre en la letra “o”?
SELECT NOMBRE FROM CLIENTE WHERE NOMBRE LIKE "%o";

-- 17. ¿Qué clientes terminan su nombre en la letra “o” y, además, son mayores de 30 años?
SELECT NOMBRE,EDAD FROM CLIENTE WHERE NOMBRE LIKE "%o" AND EDAD>30;

-- 18. Obtén un listado en el que aparezcan los programas cuya versión finalice por una letra i, o cuyo nombre comience por una A o por una W.
SELECT * FROM PROGRAMA WHERE VERSION LIKE "%i" OR NOMBRE LIKE "A%" OR NOMBRE LIKE "W%";

-- 19. Obtén un listado en el que aparezcan los programas cuya versión finalice por una letra i, o cuyo nombre comience por una A y termine por una S.
SELECT * FROM PROGRAMA WHERE VERSION LIKE "%i" OR (NOMBRE LIKE "A%" AND NOMBRE LIKE "%S");

-- 20. Obtén un listado en el que aparezcan los programas cuya versión finalice por una letra i, y cuyo nombre no comience por una A.
SELECT * FROM PROGRAMA WHERE VERSION LIKE "%i" AND NOMBRE NOT LIKE "A%";

-- 21. Genera un listado de empresas por orden alfabético descendente.
SELECT * FROM COMERCIO ORDER BY NOMBRE DESC;

-- 22. Obtén un listado de programas por orden de versión
SELECT * FROM PROGRAMA ORDER BY VERSION;

-- 23. Genera un listado de los programas que desarrolla Oracle.
SELECT PROGRAMA.CODIGO,PROGRAMA.NOMBRE,PROGRAMA.VERSION FROM PROGRAMA 
INNER JOIN DESARROLLA USING(CODIGO) 
INNER JOIN FABRICANTE USING(ID_FAB) 
WHERE FABRICANTE.NOMBRE="Oracle";

-- 24. ¿Qué comercios distribuyen Windows?
SELECT COMERCIO.NOMBRE,COMERCIO.CIUDAD FROM COMERCIO
INNER JOIN DISTRIBUYE USING(CIF)
INNER JOIN PROGRAMA USING(CODIGO)
WHERE PROGRAMA.NOMBRE="Windows";

-- 25. Genera un listado de los programas y cantidades que se han distribuido a El  Corte Inglés de Madrid.
SELECT PROGRAMA.NOMBRE,PROGRAMA.VERSION,DISTRIBUYE.CANTIDAD FROM PROGRAMA
INNER JOIN DISTRIBUYE ON PROGRAMA.CODIGO=DISTRIBUYE.CODIGO
INNER JOIN COMERCIO ON DISTRIBUYE.CIF=COMERCIO.CIF
WHERE COMERCIO.NOMBRE="El Corte Inglés" AND COMERCIO.CIUDAD="Madrid";

-- 26. ¿Qué fabricante ha desarrollado Freddy Hardest?
SELECT FABRICANTE.NOMBRE FROM FABRICANTE
INNER JOIN DESARROLLA USING(ID_FAB)
INNER JOIN PROGRAMA USING(CODIGO)
WHERE PROGRAMA.NOMBRE='Freddy Hardest';

-- 27. Selecciona el nombre de los programas que se registran por Internet.
SELECT DISTINCT PROGRAMA.NOMBRE FROM PROGRAMA
INNER JOIN REGISTRA USING(CODIGO);

-- 28. Selecciona el nombre de las personas que se registran por Internet.
SELECT DISTINCT CLIENTE.NOMBRE FROM CLIENTE
INNER JOIN REGISTRA USING(DNI);

-- 29. ¿Qué medios ha utilizado para registrarse Pepe Pérez?
SELECT REGISTRA.MEDIO FROM REGISTRA
INNER JOIN CLIENTE USING (DNI)
WHERE CLIENTE.NOMBRE="Pepe Pérez";

-- 30. ¿Qué usuarios han optado por Internet como medio de registro?
SELECT CLIENTE.NOMBRE FROM CLIENTE
INNER JOIN REGISTRA USING(DNI)
WHERE REGISTRA.MEDIO="Internet";

-- 31. ¿Qué programas han recibido registros por tarjeta postal?
SELECT PROGRAMA.CODIGO,PROGRAMA.NOMBRE FROM PROGRAMA
INNER JOIN REGISTRA USING(CODIGO)
WHERE REGISTRA.MEDIO="Tarjeta postal";

-- 32. ¿En qué localidades se han vendido productos que se han registrado por Internet?
SELECT COMERCIO.CIUDAD FROM COMERCIO
INNER JOIN REGISTRA USING(CIF)
WHERE REGISTRA.MEDIO="Internet";

-- 33. Obtén un listado de los nombres de las personas que se han registrado por Internet, junto al nombre de los programas para los que ha efectuado el registro.
SELECT CLIENTE.NOMBRE,PROGRAMA.NOMBRE FROM CLIENTE
INNER JOIN REGISTRA USING(DNI)
INNER JOIN PROGRAMA USING(CODIGO)
WHERE REGISTRA.MEDIO="Internet";

-- 34. Genera un listado en el que aparezca cada cliente junto al programa que ha registrado, el medio con el que lo ha hecho y el comercio en el que lo ha adquirido.
SELECT CLIENTE.NOMBRE,PROGRAMA.NOMBRE,REGISTRA.MEDIO,COMERCIO.NOMBRE FROM CLIENTE
INNER JOIN REGISTRA USING(DNI)
INNER JOIN PROGRAMA USING(CODIGO)
INNER JOIN COMERCIO USING(CIF);

-- 35. Genera un listado con las ciudades en las que se pueden obtener los productos de Oracle.
SELECT DISTINCT COMERCIO.CIUDAD FROM COMERCIO
INNER JOIN DISTRIBUYE USING(CIF)
INNER JOIN PROGRAMA USING(CODIGO)
INNER JOIN DESARROLLA USING(CODIGO)
INNER JOIN FABRICANTE USING(ID_FAB)
WHERE FABRICANTE.NOMBRE="Oracle";

-- 36. Obtén el nombre de los usuarios que han registrado el programa "Paradox" en su versión "2".
SELECT CLIENTE.NOMBRE FROM CLIENTE
INNER JOIN REGISTRA USING(DNI)
INNER JOIN PROGRAMA USING(CODIGO)
WHERE PROGRAMA.NOMBRE="Paradox" AND PROGRAMA.VERSION="2";

-- FALTA DE HACER LAS SUBCONSULTAS

-- 41. Obtener el número de programas que hay en la tabla programas.
SELECT COUNT(*) FROM PROGRAMA;

-- 42. Calcula el número de clientes cuya edad es mayor de 40 años.
SELECT COUNT(*) FROM CLIENTE WHERE EDAD>40;

-- 43. Calcula el número de productos que ha vendido el establecimiento cuyo CIF es 1.
SELECT COUNT(CANTIDAD) FROM DISTRIBUYE WHERE CIF=1;

-- 44. Calcula la media de programas que se venden cuyo código es 7.
SELECT AVG(CANTIDAD) FROM DISTRIBUYE WHERE CODIGO=7;

-- 45. Calcula la máxima cantidad de programas de código 7 que se han vendido.
SELECT MAX(CANTIDAD) FROM DISTRIBUYE WHERE CODIGO=7;

-- 46. ¿En cuántos establecimientos se vende el programa cuyo código es 7?
SELECT COUNT(CIF) FROM DISTRIBUYE WHERE CODIGO=7;

-- 47. Calcular el número de registros que se han realizado por Internet.
SELECT COUNT(*) FROM REGISTRA WHERE MEDIO="Internet";

-- 
