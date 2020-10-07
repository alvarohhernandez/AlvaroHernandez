# Git
## Instalación de Git

En fedora, el gestor de paquetes es dnf, por lo que, para instalar git ejecutamos lo siguiente en una shell como sudo o con un usuario con privilegios de administrador:

```
➜  ~ sudo dnf -y install git
```

## Configuración de Git (username, email)

Una vez instalado git, debemos configurar el email y username, los cuales servirán para identificar nuestras contribuciones dentro del repositorio. Podemos hacer esta configuración global o específica para un repositorio.

###### Configuración Global

Para configurar nuestro username, ejecutamos lo siguiente en una shell

```
➜  ~ git config --global user.name "Alvaro Hernández"
```

Para configurar nuestra dirección email, ejecutamos lo siguiente en una shell

```
➜  ~ git config --global user.email "draco_90@ciencias.unam.mx"
```

###### Configuración Local

Para configurar nuestro username, ejecutamos lo siguiente en una shell

```
➜  ~ git config user.name "Alvaro Hernández"
```

Para configurar nuestra dirección email, ejecutamos lo siguiente en una shell

```
➜  ~ git config user.email "draco_90@ciencias.unam.mx"
```
