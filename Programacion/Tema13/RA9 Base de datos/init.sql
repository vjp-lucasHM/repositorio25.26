-- Script de inicialización para la base de datos de alumnos

-- Creamos tabla de alumnos
CREATE TABLE alumnos (
    id SERIAL PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    apellido VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    fecha_nacimiento DATE,
    telefono VARCHAR(20),
    direccion VARCHAR(200),
    ciudad VARCHAR(50),
    codigo_postal VARCHAR(10),
    fecha_inscripcion DATE DEFAULT CURRENT_DATE,
    activo BOOLEAN DEFAULT TRUE
);

-- Creamos tabla de cursos
CREATE TABLE cursos (
    id SERIAL PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    descripcion TEXT,
    creditos INTEGER NOT NULL CHECK (creditos > 0),
    profesor VARCHAR(100),
    horario VARCHAR(50),
    aula VARCHAR(20),
    activo BOOLEAN DEFAULT TRUE
);

-- Insertamos datos de alumnos
INSERT INTO alumnos (nombre, apellido, email, fecha_nacimiento, telefono, direccion, ciudad, codigo_postal) VALUES
('Juan', 'García', 'juan.garcia@email.com', '2002-05-15', '600123456', 'Calle Mayor 123', 'Madrid', '28001'),
('María', 'López', 'maria.lopez@email.com', '2003-02-20', '600234567', 'Avenida del Sol 45', 'Barcelona', '08001'),
('Carlos', 'Martínez', 'carlos.martinez@email.com', '2002-11-08', '600345678', 'Plaza Central 67', 'Valencia', '46001'),
('Ana', 'Sánchez', 'ana.sanchez@email.com', '2003-07-12', '600456789', 'Calle Luna 89', 'Sevilla', '41001'),
('Pedro', 'Fernández', 'pedro.fernandez@email.com', '2002-09-25', '600567890', 'Avenida del Río 23', 'Bilbao', '48001'),
('Laura', 'Rodríguez', 'laura.rodriguez@email.com', '2003-04-18', '600678901', 'Calle del Puerto 156', 'Málaga', '29001'),
('Miguel', 'González', 'miguel.gonzalez@email.com', '2002-12-03', '600789012', 'Plaza de la Universidad 78', 'Salamanca', '37001'),
('Sofía', 'Pérez', 'sofia.perez@email.com', '2003-06-30', '600890123', 'Calle Gran Vía 234', 'Zaragoza', '50001'),
('David', 'Jiménez', 'david.jimenez@email.com', '2002-08-14', '600901234', 'Avenida de la Constitución 56', 'Murcia', '30001'),
('Elena', 'Díaz', 'elena.diaz@email.com', '2003-01-27', '600012345', 'Calle de la Universidad 90', 'Granada', '18001');

-- Insertamos datos de cursos
INSERT INTO cursos (nombre, descripcion, creditos, profesor, horario, aula) VALUES
('Base de Datos', 'Introducción a sistemas de bases de datos relacionales y SQL', 6, 'Dr. Antonio Ruiz', 'Lunes y Miércoles 10:00-12:00', 'A101'),
('Programación Java', 'Fundamentos de programación orientada a objetos con Java', 8, 'Dra. María Torres', 'Martes y Jueves 14:00-16:00', 'B205'),
('Redes de Computadores', 'Conceptos fundamentales de redes y protocolos', 6, 'Dr. Carlos López', 'Lunes y Miércoles 16:00-18:00', 'C103'),
('Desarrollo Web', 'HTML, CSS, JavaScript y frameworks modernos', 7, 'Dra. Ana Martínez', 'Martes y Jueves 10:00-12:00', 'D201'),
('Sistemas Operativos', 'Arquitectura y gestión de sistemas operativos', 6, 'Dr. Pedro Sánchez', 'Viernes 08:00-12:00', 'E105'),
('Inteligencia Artificial', 'Introducción a algoritmos de IA y machine learning', 8, 'Dra. Laura González', 'Lunes y Miércoles 14:00-16:00', 'F301'),
('Seguridad Informática', 'Principios de seguridad y criptografía', 5, 'Dr. Miguel Fernández', 'Martes y Jueves 16:00-18:00', 'G102'),
('Análisis de Algoritmos', 'Complejidad y optimización de algoritmos', 6, 'Dra. Sofía Pérez', 'Viernes 14:00-18:00', 'H203'),
('Ingeniería del Software', 'Metodologías y ciclo de vida del software', 7, 'Dr. David Jiménez', 'Lunes y Miércoles 08:00-10:00', 'I101'),
('Computación en la Nube', 'Servicios cloud y arquitecturas distribuidas', 6, 'Dra. Elena Díaz', 'Martes y Jueves 08:00-10:00', 'J205');