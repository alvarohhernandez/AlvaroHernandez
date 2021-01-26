INTRODUCCIÓN A LAS CIENCIAS DE LA COMPUTACIÓN - BANCO SIMPLE
------------------------------------------------------------
Este proyecto modela un banco simple, hasta el momento se cuenta con 2 clases, una para modelar Clientes y otra
para modelar Cuentas Bancarias.

Comenzando
----------

Estas instrucciones te permitirán obtener una copia del proyecto en funcionamiento en tu máquina local para
propósitos de desarrollo y pruebas.

Mira Deployment para conecer como desplegar el proyecto.

Pre-requisitos
--------------

- Java 1.8 JRE – 32bit or 64bit for
- Windows 7/8/10
- Linux
- Mac OsX

Obtención del código
--------------------

El proyecto puede ser obtenido a través del repositorio https://github.com/CCLaboratorio/AlvaroHernandez o bien a
través del paquete AlvaroHernandez.tgz

- Git
A través de git, se puede obtener la versión actualizada ejecutando el siguiente comando:

  git clone https://github.com/CCLaboratorio/AlvaroHernandez

- Paquete
A través del paquete comprimido, se debe descomprimir en cualquier ruta del sistema.

Deployment
----------

Primero se deberá de compilar el proyecto, para generar las clases java. Para compilar, se deben posicionar el el
directorio principal /AlvaroHernandez y ejecutar la siguiente instrucción.

    javac Main.java banco/*.java

Esto nos generará las clases principales Main.class, banco/Cuenta.class, banco/CuentaDebito.class,
banco/CuentaCredito.class y banco/Cliente.class

Para correr las pruebas, se deberá ejecutar la siguiente intrucción desde la carpeta principal del proyecto.

    java Main

Funcionalidades
---------------

- Se agrega excepción para cuenta nula (No se puede agrega un cliente al banco sin una cuenta bancaria relacionada)

Estructura del Proyecto
-----------------------

Durante el desarrollo del proyecto, se realizarán diversas actividades, las cuales consistirán de diversas etapas,
la estructura principal es la siguiente

/AlvaroHernandez - Carpeta principal del proyecto
/AlvaroHernandez/Actividad(n) - Carpeta de actividad, donde n es el número de actividad actual
/AlvaroHernandez/Actividad(n)/banco - Carpeta del paquete banco, donde se encuentran las clases Cliente,
                                      Cuenta, CuentaDebito y CuentaCredito
/AlvaroHernadnez/Actividad(n)/Main.java - Clase Main, con los principales test de las clases

--------------------------
Readme aún en construcción
