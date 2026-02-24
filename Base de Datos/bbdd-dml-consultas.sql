-- ------------------
-- LUCAS HERRERA MORENO
-- BASE DE DATOS
-- EJERCICIO CONSULTA 1 TABLA
-- ------------------

-- Crea una base de datos nueva: DATOSALUMNOS. 
CREATE DATABASE DATOSALUMNOS;
USE DATOSALUMNOS;

-- Crea la tabla ALUMNOS: 	
CREATE TABLE ALUMNOS(
	EXPEDIENTE INT PRIMARY KEY,
    NOMBRE VARCHAR(50),
    LOCALIDAD VARCHAR(50),
    FECHA_NAC DATE,
    DIRECCION VARCHAR(50),
    CURSO INT,
    NIVEL VARCHAR(20),
    FALTAS INT
);

-- Inserta datos en la tabla:  Para ello utiliza el fichero DATOS_ALUMNOS, que está en la plataforma.
INSERT INTO ALUMNOS VALUES ('123456', 'Juan Miguel Soler Bakero', 'Plasencia', '1995-10-10', 'Gran Via, 2A, 4A', '1', 'CF', 15),
 ('654321', 'Laura Gomez Fernandez', 'Caceres', '1994-04-10', 'Junterones, 10, 5B', '2', 'ESO', '25'),
 ('765432', 'Beatriz Martinez Fernandez', 'Plasencia', '1993-05-05', 'Plaza Mayor, 6, 3B', '3', 'ESO', 5),
 ('987654', 'Diego Martin Llorente', 'Navalmoral', '1990-06-03', 'Diego de la Cierva, 5, 7A', '1', 'BACHILLERATO', 34),
 ('445544', 'Juan Francisco Cano Riquelme',  'Caceres', '1992-07-01', 'Plaza de Beluga, 3, 4A', 4, 'ESO', 13),
 ('223322', 'Raquel Riquelme Rubio', 'Plasencia', '1990-01-23', 'San Juan, 14, 3B', 1, 'BACHILLERATO', 7),
 ('9988877', 'Cristina Sanchez Bermejo', 'Caceres', '1995-03-19', 'Torre de Romo, 7', 1, 'CF', 1),
 ('334455',  'Pedro Jesus Rodriguez Soler', 'Plasencia', '1994-03-10', 'Camino de Badel, 4', 2, 'ESO', 11),
 ('334400', 'Javier Jamanez Rodriguez', 'Plasencia', '1993-05-27', 'Gran Via, 4, 3A', 3, 'ESO', 0),
 ('993322', 'Gema Rubio Colero', 'Caceres', '1992-09-09', 'Plaza Fuensanta, 5, 7A', 1,'BACHILLERATO', 19),
 ('554411', 'Joaquin Hernandez Gonzalez', 'Plasencia', '1991-12-12', 'Junterones, 4, 5A', 2, 'BACHILLERATO', 14);
 
--  Muestra todos los datos de todos los alumnos. 
SELECT * FROM ALUMNOS;

-- Muestra el nombre , localidad y fecha de nacimiento de todos los alumnos. 
SELECT NOMBRE,LOCALIDAD,FECHA_NAC FROM ALUMNOS;

-- Muestra el nombre de todos los alumnos. En el resultado de la consulta, la columna “Nombre” debe aparecer con la etiqueta “Nombre y apellidos” (ALIAS DE COLUMNAS). 
SELECT NOMBRE AS 'Nombre y apellidos' FROM ALUMNOS;

-- Obtén el nombre y el número de faltas multiplicado por 2 de todos los alumnos (COLUMNAS CALCULADAS). En el resultado de la consulta, la columna faltas debe aparecer con la etiqueta “Faltas de asistencia” (ALIAS DE COLUMNAS)
SELECT NOMBRE, FALTAS*2 AS "Faltas de asistencia" FROM ALUMNOS;

-- Consulta los datos de los alumnos que son de Plasencia. 
SELECT * FROM ALUMNOS WHERE LOCALIDAD='PLASENCIA';

-- Obtén los datos de los alumnos que son de Plasencia o Navalmoral. 
SELECT * FROM ALUMNOS WHERE LOCALIDAD IN('PLASENCIA','NAVALMORAL');

-- Obtén los datos de los alumnos que son de Plasencia y están en el primer curso de CF. 
SELECT * FROM ALUMNOS WHERE LOCALIDAD='PLASENCIA' AND CURSO=1 AND NIVEL='CF';

-- Muestra lo salumnos que son de Plasencia, están en 2º de Bachillerato y tienen más de 10 faltas.
SELECT * FROM ALUMNOS WHERE (FALTAS>10) AND LOCALIDAD='PLASENCIA' AND CURSO=2 AND NIVEL='BACHILLERATO'; 

-- Obtén los datos de aquellos alumnos que son de Cáceres ordenados por nombre. 
SELECT * FROM ALUMNOS WHERE LOCALIDAD='Caceres' ORDER BY NOMBRE;

-- Obtén los datos de todos los alumnos ordenados por nivel, y dentro de cada nivel por curso
SELECT * FROM ALUMNOS ORDER BY NIVEL, CURSO;

-- Muestra los datos de aquellos alumnos que tengan más de 10 faltas en primer o segundo curso. 
SELECT * FROM ALUMNOS WHERE (FALTAS>10) AND CURSO IN(1, 2);

-- Muestra los datos de todos aquellos alumnos que tengan menos de 10 faltas en 3º o 4º curso y además sean de Navalmoral. 
SELECT * FROM ALUMNOS WHERE (FALTAS>10) AND LOCALIDAD='Navalmoral' AND CURSO IN(3, 4);

-- Obtén con una consulta todos los cursos que hay sin repeticiones (DISTINCT).	
SELECT DISTINCT CURSO FROM ALUMNOS;

-- Obtén los datos de los alumnos que no tengan 10 faltas en 2º de E.S.O. 
SELECT * FROM ALUMNOS WHERE CURSO='2' AND NIVEL='ESO' AND (FALTAS<10);

-- Muestra los datos de aquellos alumnos cuyo nombre empiece por la letra 'B'. 
SELECT * FROM ALUMNOS WHERE NOMBRE='B%';

-- Con una consulta obtén los alumnos que son de Cáceres y cuyo nombre termina con una letra 'O'.
SELECT * FROM ALUMNOS WHERE LOCALIDAD='Caceres' AND NOMBRE='%B';

-- Muestra los datos de todos aquellos alumnos que están en 1º curso de E.S.O. Y tienen una letra 'U' en la segunda posición del nombre. 
SELECT * FROM ALUMNOS WHERE CURSO='1' AND NIVEL='ESO' AND NOMBRE='%B%';

-- Obtén los datos de los alumnos cuya columna “Faltas” es nula. 
SELECT * FROM ALUMNOS WHERE FALTAS IS NULL;

-- Muestra los datos de aquellos  alumnos que tienen entre 10 y 20 faltas (BETWEEN). Ordena el resultado por nombre. 
SELECT * FROM ALUMNOS WHERE FALTAS BETWEEN 10 AND 20 ORDER BY NOMBRE;

-- Muestra los datos de los alumnos que tienen entre 10 y 20 faltas y además son de Cáceres. 
SELECT * FROM ALUMNOS WHERE FALTAS BETWEEN 10 AND 20 AND LOCALIDAD='Caceres';

-- Muestra los datos de los alumnos que tienen entre 10 y 20 faltas, son de Plasencia y están matriculados en CF. 
SELECT * FROM ALUMNOS WHERE FALTAS BETWEEN 10 AND 20 AND LOCALIDAD='Plasencia' AND NIVEL='CF';

-- Muestra los datos de los alumnos cuyas faltas sean menores que 10 y mayores que 20. 
SELECT * FROM ALUMNOS WHERE (FALTAS < 10) OR (FALTAS > 20);

-- Muestra los datos de los alumnos cuya fecha de nacimiento comprenda los años 1993 y 1994. Ordena el resultado por nombre. 
SELECT * FROM ALUMNOS WHERE FECHA_NAC BETWEEN '1993-01-01' AND '1994-31-12' ORDER BY NOMBRE;

-- Muestra los datos de los alumnos que sean de primer o segundocurso (no importa que sean de E.S.O., BACHILLERATO O CF).  Utiliza el operador IN. 
SELECT * FROM ALUMNOS WHERE CURSO IN('2', '1');

-- Obtén los datos de aquellos alumnos que sean de tercer o cuarto curso y sean de Navalmoral. Utiliza el operador IN. 
SELECT * FROM ALUMNOS WHERE CURSO IN('3','4') AND LOCALIDAD='Navalmoral';

-- Muestra los datos de los alumnos que no sean de E.S.O, ordenados por curso y por nombre descendentemente. Utiliza el operador IN. 
SELECT * FROM ALUMNOS WHERE NIVEL NOT IN('ESO') ORDER BY CURSO, NOMBRE DESC;

-- Muestra los datos de los alumnos que sean de primer o segundo curso y no sean de Bachillerato. Ordena el resultado por nombre.
SELECT * FROM ALUMNOS WHERE NIVEL NOT IN('BACHILLERATO') AND CURSO NOT IN ('1','2') ORDER BY NOMBRE;

-- Obtén los datos de los alumnos cuyo nombre empiece por la letra 'J', que tengan más de 10 faltas y no sean de Bachillerato. Ordena el resultado por curso, y dentro de cada curso, por nombre. 
SELECT * FROM ALUMNOS WHERE NOMBRE='%B' AND (FALTAS>10) AND NIVEL NOT IN('BACHILLERATO') ORDER BY CURSO,NOMBRE;

-- Obtener el expediente, nombre, curso y nivel de todos los alumnos ordenado por curso, nivel ascendentemente y nombre descendentemente cuyo nivel no sea 'BACHILLERATO'. 
SELECT EXPENDIENTE,NOMBRE,CURSO,NIVEL FROM ALUMNOS WHERE NIVEL NOT IN('BACHILLERATO') ORDER BY CURSO ASC, NIVEL ASC, NOMBRE DESC;

-- Obtén el nombre de cada alumno en mayúscula cuya localidad sea Navalmoral. 
SELECT UPPER(NOMBRE) FROM ALUMNOS WHERE LOCALIDAD='NAVALMORAL';

-- Muestra el nombre de cada alumno en mayúscula y la localidad a la que pertenecenen minúscula, ordenados por localidad. 
SELECT UPPER(NOMBRE), LOWER(LOCALIDAD) FROM ALUMNOS ORDER BY LOCALIDAD;

-- Concatena el nombre de cada alumno y su localidad. 
SELECT CONCAT(NOMBRE,LOCALIDAD) FROM ALUMNOS;