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

## Trabajo con Repositorios

Para comenzar a colaborar, primero necesitamos clonar el repositorio, tenemos 2 formas de hacerlo, a través de https o a través de llave SSH. En lo personal, prefiero el método SSH, por lo que primero, debo agregar mi llave pública de SSH a mi perfil de Github. Para ver el contenido de mi llave pública, podemos ejecutar lo siguiente en una shell:

```
➜  ~ cat ~/.ssh/id_rsa.pub
```

El contenido, lo copiamos y pegamos en [https://github.com/settings/keys](https://github.com/settings/keys) dando click en __New SSH key__.

###### Clonado

Ya con nuestra llave SSH agregada a nuestro perfil, podemos realizar el clonado del repositorio ejecutando lo siguiente en una shell:

```
➜  ~ git clone git@github.com:CCLaboratorio/AlvaroHernandez.git
```

Esto nos clonará el repositorio (vacío si es de reciente creación) en nuestro directorio actual/AlvaroHernandez

###### Edición

Ya clonado nuestro repositorio, nos posicionamos en el directorio ejecutando:

```
➜  ~ cd AlvaroHernandez
```

Para la colaboración/edición en nuestro repositorio, podemos hacer uso de cualquier editor de texto. Yo uso VIM como editor de texto, para lo cual creamos nuestro archivo README.md ejecutando lo siguiente:

```
➜  ~ vim README.md
```

Una vez que terminos la edición de nuestro documento, guardamos y salimos con el comando __:wq__

###### Añadir cambios al Repositorio

Para añadir nuestros cambios, ya sean modificaciones o archivos nuevos al repositorio, ejecutamos lo siguiente:

```
➜  ~ git add README.md
```

Esto nos agregara el archivo README.md al registro de cambios, si modificamos más de un archivo y deseamos agragar todos los archivos modificados al registro de cambios, podemos hacerlo en una sola ejecución con:

```
➜  ~ git add -A
```

Ya agregados nuestros cambios al registro, debemos agregar un comentario (commit) que describa brevemente nuestros cambios, para que el resto de los colaboradores puedan inferir que fue lo que se hizo sin tener que revisar todo el código. Para esto, ejecutamos lo siguiente en una terminal:

```
➜  ~ git commit -m "Primera Versión de README"
```

###### Subida de Cambios

Una vez que agregamos el commit de nuestros cambios, debemos subirlos al repositorio remoto, dado que por el momento sólo se encuentran en nuestro repositorio local, para subir nuestros cambios debemos hacer lo siguiente en una terminal:

```
➜  ~ git push origin master
```

Dado que sólo estaremos trabajando con una branch (master), en las posteriore subidas, esta sentencia puede ser acortada simplemente a:

```
➜  ~  git push
```
